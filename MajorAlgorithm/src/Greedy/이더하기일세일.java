package backJoon;

import java.util.Arrays;
import java.util.Scanner;

public class 이더하기일세일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] array = new int[N];
		int tmp = 0; int cnt = 1; int result = 0;
		
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		for(int i=array.length-1;i>=0;i--) {
		
			if(cnt==3) {
				result += tmp;
				cnt = 1; tmp = 0;
			}
			else if(cnt<3&&i==0) {
				tmp += array[i];
				result += tmp;
			}
			else {
				tmp += array[i];
				cnt++;
			}
		}
		
		System.out.println(result);
	}

}
