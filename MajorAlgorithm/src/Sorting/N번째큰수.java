package backJoon;

import java.util.Arrays;
import java.util.Scanner;

public class N번째큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] array = new int[10];
		
		for(int i=0;i<T;i++) {
			for(int j=0;j<array.length;j++) {
				array[j] = sc.nextInt();
			}
			Arrays.sort(array);
			System.out.println(array[array.length-3]);
		}
	}

}
