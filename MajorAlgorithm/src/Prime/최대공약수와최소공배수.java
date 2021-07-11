package backJoon;

import java.util.Scanner;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int result = 0;
		
		for(int i=1;i<=Math.max(N, M);i++) {
			if(N%i==0&&M%i==0) {
				result = i;
			}
		}

		if(result==1) {
			System.out.println(result);
			System.out.println(N*M);
		}
		else {
			System.out.println(result);
			System.out.println(result*(N/result)*(M/result));
		}
	}

}
