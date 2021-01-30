package bruteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class backJoon_2231 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int _count = 1;

		//%,³ª¸ÓÁö
		while(true) {
			
			int a = 0;
			String count = Integer.toString(_count);
			String[] num;
			num = count.split("");
			
			if(_count==Integer.valueOf(number)) {
				break;
			}
			for(int k=0;k<num.length;k++) {
				a += Integer.valueOf(num[k]);
				
			}
			if(_count+a==Integer.valueOf(number)) {
				list.add(Integer.valueOf(count));
			}
			_count++;
		}
		if(list.size()==0) {
			System.out.println("0");
		}
		else {
			System.out.println(list.get(0));
		}
		
		
	}

}
