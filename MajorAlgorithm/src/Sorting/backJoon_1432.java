package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class backJoon_1432 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ø��� ��ȣ 
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		int num = scanner.nextInt();
		String[][] array = new String[num][3];
		
		for(int i=0;i<num;i++) {	
			array[i][0] = scanner.next();
			array[i][1] = String.valueOf(array[i][0].length());	
			
			for(int j=0;j<array[i][0].length();j++) {
	
				if(array[i][0].charAt(j)>='0'&&array[i][0].charAt(j)<='9') {
					result += array[i][0].charAt(j)-48;
					array[i][2] = String.valueOf(result);
				}
				else {
					result += '0'- 48;
					array[i][2] = String.valueOf(result);
				}
			}
			result = 0;
		}
		
		Arrays.sort(array,new Comparator<String[]>() {

			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				//���̸� �� 
				if(Integer.compare(Integer.parseInt(o1[1]),Integer.parseInt(o2[1])) == 0) {
					// ������ ���� ��
					if(Integer.compare(Integer.parseInt(o1[2]),Integer.parseInt(o2[2])) == 0) {
						//������ �հ� ���̰� ���� ������ ���, ���������� ���� 
							return o1[0].compareTo(o2[0]);
					}
					else {
						//������ ���� �ٸ� ���, �������� ���� 
							return Integer.compare(Integer.parseInt(o1[2]),Integer.parseInt(o2[2]));
					}
				}
				else {
					//�������� ���� 
					return Integer.compare(Integer.parseInt(o1[1]),Integer.parseInt(o2[1]));
				}
			}
			
			
		});
		
		for(int i=0;i<num;i++) {
			System.out.println(array[i][0]);
		}
		
	}

}
