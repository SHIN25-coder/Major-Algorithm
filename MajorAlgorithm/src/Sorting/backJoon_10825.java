package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class backJoon_10825 {
	
	/*
	 * ���� ������ �����ϴ� ������
	 * ���� ������ ������ ���� ������ �����ϴ� ������ 
	 * ���� ������ ���� ������ ������ ���� ������ �����ϴ� ������
	 * ��� ������ ������ �̸��� ���� ������ �����ϴ� ������ 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[][] array = new String[N][4];
		
		for(int i=0;i<array.length;i++) {
			array[i][0] = scan.next();
			array[i][1] = scan.next(); // ��������
			array[i][2] = scan.next(); // ��������
			array[i][3] = scan.next(); // ��������
 		}
		
		// 2���� �迭�̶�� �ش� �Լ��� �� 
		Arrays.sort(array,new Comparator<String[]>() {
			// compare�Լ��� ��� �����ϴ��Ŀ� ���� �޶�����. I
			public int compare(String[] o1,String[] o2) {
				// 1. ���� ������ �����ϴ� ����
				if(Integer.compare(Integer.parseInt(o2[1]),Integer.parseInt(o1[1])) == 0) {
					
					if(Integer.compare(Integer.parseInt(o1[2]),Integer.parseInt(o2[2])) == 0 ) {
						
						if(Integer.compare(Integer.parseInt(o2[3]),Integer.parseInt(o1[3])) == 0 ) {
						
							return o1[0].compareTo(o2[0]);
							// ����,����,���� ������ ���� ��� , 
						
						}
						else {
							
							return Integer.compare(Integer.parseInt(o2[3]),Integer.parseInt(o1[3]));
							// ����,��� ���� ��� , �������� ���� 
						}
					}
					else {
						
						return Integer.compare(Integer.parseInt(o1[2]),Integer.parseInt(o2[2]));
						// ��� ���� ��� , �������� ���� 
					}
				}
				
				else {
					return Integer.compare(Integer.parseInt(o2[1]),Integer.parseInt(o1[1]));
					// �������� ���� 
				}
					
			}
	
		});
		
	
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i][0]);
		}
		
	}
	}

