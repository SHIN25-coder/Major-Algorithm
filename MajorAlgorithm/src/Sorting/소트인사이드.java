package backJoon;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class 소트인사이드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		int[] array = new int[N.length()];
		String result = "";
		
		
		for(int i=0;i<N.length();i++) {
			array[i] = (int)N.charAt(i)-'0';
		}
		
		Arrays.sort(array);
		
		for(int j=array.length-1;j>=0;j--) {
			result += array[j];
		}
		
		System.out.println(result);
	}

}
