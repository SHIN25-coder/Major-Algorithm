package backJoon;

import java.util.Arrays;
import java.util.Scanner;

public class ���{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// ��� A�� N�� ��¥ ����� �Ƿ���, N�� A�� ����̰�, A�� 1�� N�� �ƴϾ���Ѵ�.
		// � �� N�� ��¥ ����� ��� �־�����, N�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int array[] = new int[N];
		
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		if(array.length==1) {
			// ��¥ ����� �ϳ��� ��� ��¥���*��¥����� �ϸ� ��� A�� �ȴ�.
			System.out.println(array[0]*array[0]);
		}
		else {
			// �ִ밪�� �ּڰ��� ���ϸ� ��� A�� �ȴ�.
			System.out.println(array[0]*array[array.length-1]);
		}
	}

}
