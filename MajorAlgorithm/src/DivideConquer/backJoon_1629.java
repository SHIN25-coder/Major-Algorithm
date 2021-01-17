package DivideConquer;

import java.util.Scanner;

public class backJoon_1629 {
	
	static long C;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong(); // นุ
		long B = sc.nextLong(); // ม๖ผ๖
		C = sc.nextLong();
		
	
		
		long result = pow(A,B)%C;
		System.out.println(result);	

	}
	
	public static long pow(long a,long b) {
		
		if(b==0) {
			return 1;
		}
		
		long n = pow(a,b/2);
		long temp = n*n%C;
		
		if(b%2==0) {
			return temp;
		}
		else {
			return a*temp%C;
		}
		
	}

}
