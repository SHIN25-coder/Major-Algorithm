package Prime;

import java.util.Scanner;

public class backJoon_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0; int prime = 0;
		
		//소수를 찾는 프로그램, 소수란 1과 자기자신을 제외한 나머지 공약수가 없음 
		
		while(N>0) {
			int num = scan.nextInt();
		
			for(int i=1;i<=num;i++) {
				
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				prime++;
			}
			count = 0;
			N--;
		}
		
		System.out.println(prime);
	}

}
