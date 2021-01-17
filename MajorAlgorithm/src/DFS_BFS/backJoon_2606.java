package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class backJoon_2606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt(); // 번호 
		int pare = s.nextInt(); // 쌍 
		

		int[][] array = new int[pare][2];
		
		for(int i=0;i<pare;i++) {
			array[i][0] = s.nextInt();
			array[i][1] = s.nextInt();
 		}
		
		int i = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();
		
		list.add(1); int count = 0;
		
		while(true) {
			
			if(i==pare) {
				i=0; count++;
			}
			if(count==5) {
				break;
			}
			if(list.contains(array[i][0])) {
                list.add(array[i][1]);

			}
			//역방향...
			if(list.contains(array[i][1])) {
				// 이 부분이 문제다..
				list.add(array[i][0]);

			}
			
			i++;
		}
		
		count = 0;
		
		for(int j=0; j<list.size(); j++) {
			if(!resultList.contains(list.get(j)))
				resultList.add(list.get(j));
		}
		
		System.out.println(resultList.size()-1);
	
	}

}
