package backJoon;

import java.util.Arrays;
import java.util.Scanner;

public class 약수{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야한다.
		// 어떤 수 N의 진짜 약수가 모두 주어질때, N을 구하는 프로그램을 작성하시오.
		
		int array[] = new int[N];
		
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		if(array.length==1) {
			// 진짜 약수가 하나일 경우 진짜약수*진짜약수를 하면 약수 A가 된다.
			System.out.println(array[0]*array[0]);
		}
		else {
			// 최대값과 최솟값을 곱하면 약수 A가 된다.
			System.out.println(array[0]*array[array.length-1]);
		}
	}

}
