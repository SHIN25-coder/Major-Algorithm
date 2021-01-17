package Greedy;

import java.util.Scanner;

public class Makeone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		/* N이 1이 될 때까지, 두 과정 중 하나를 반복적으로 선택하여 수행
		 *  1. N에서 1을 뺀다.
		 *  2. N을 K로 나눈다. (N이 K나누어질때만)
		 *  1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 프로그램
		 */
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int count = 0;
		
		// 입력 예시 25,5 
		
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

