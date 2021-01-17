package bruteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class backJoon_7568 {
	// 덩치
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] result = new int[N];
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<N;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<N;i++) {
			result[i] = 1;
			list.get(i).add(sc.nextInt());
			list.get(i).add(sc.nextInt());
		}
		
		// 키와 덩치가 모두 크면 A의 덩치가 B의 덩치보다 더크다.
		// 그외의 경우에는 그렇게 말할수없다.

		
		for(int i=0;i<list.size();i++) {
			
			int a = list.get(i).get(0); // 몸무게
			int b = list.get(i).get(1); // 키 
			
			
			for(int j=0;j<list.size();j++) { 
				
				if(a>list.get(j).get(0)&&b>list.get(j).get(1)) {
				
					result[j]++;
				}
				
			}
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
		
	}

}
