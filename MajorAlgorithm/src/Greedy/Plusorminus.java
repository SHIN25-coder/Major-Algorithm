package Greedy;

import java.util.Scanner;

public class Plusorminus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = 0;
		
		String[] array = s.split("");
		
		int one = Integer.parseInt(array[0]);
		
		for(int i=0;i<array.length&&i+1!=array.length;i++) {
			
			int two = Integer.parseInt(array[i+1]);
			
	
			if(one<=1||two<=1) {
				// 두 수중에 하나라도 '0'혹은 '1'인 경우, 더하기가 효율적
				result = one+two;
				one = result;
			}
			else {
				// 2 이상인 경우에는 곱하는것이 더 효율적
				result = one*two;
				one = result;
			}
		}
		
		System.out.println(result);
		
	}
	}

