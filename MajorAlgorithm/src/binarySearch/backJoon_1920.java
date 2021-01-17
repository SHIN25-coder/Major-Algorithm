package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class backJoon_1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		
		// ���� �ʼ�!
		Arrays.sort(array);
		
		int M = sc.nextInt(); // target
		int[] target = new int[M];
		
		for(int i=0;i<M;i++) {
			target[i] = sc.nextInt();
		}
		
		for(int i=0;i<M;i++) {
			
			int result = binarySearch(array,target[i],0,N-1);
			
			if(result==-1) {System.out.println(0);}
			else {System.out.println(1);}
			
		}
		
		
	}
	
	public static int binarySearch(int[] arr,int target,int start,int end) {
		
		
		
		while(start<=end) {
			
			int mid = (start+end)/2;
			// ã�� ��� �߰��� �ε��� ��ȯ
			if(arr[mid]==target) return mid;
			// �߰����� ������ ã���� �ϴ� ���� ���� ��� ���� Ȯ��
			else if(arr[mid]>target) end = mid-1;
			// �߰����� ������ ã���� �ϴ� ���� ū ��� ������ Ȯ�� 
			else start = mid+1;
			
		}
		
		return -1;
	}
}
