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
				// �� ���߿� �ϳ��� '0'Ȥ�� '1'�� ���, ���ϱⰡ ȿ����
				result = one+two;
				one = result;
			}
			else {
				// 2 �̻��� ��쿡�� ���ϴ°��� �� ȿ����
				result = one*two;
				one = result;
			}
		}
		
		System.out.println(result);
		
	}
	}

