package Greedy;

import java.util.Scanner;

public class Makeone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		/* N�� 1�� �� ������, �� ���� �� �ϳ��� �ݺ������� �����Ͽ� ����
		 *  1. N���� 1�� ����.
		 *  2. N�� K�� ������. (N�� K������������)
		 *  1�� Ȥ�� 2���� ������ �����ؾ� �ϴ� �ּ� Ƚ���� ���ϴ� ���α׷�
		 */
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int count = 0;
		
		// �Է� ���� 25,5 
		
		while(true) {
			if(N==1) {
				break;
			}
			else {
				if(N%K==0) {
					N = N/K;
					count++;
				}
				else {
					N = N-1;
					count++;
				}
				
			}
		}
		
		System.out.println(count);
		
	}
	}

