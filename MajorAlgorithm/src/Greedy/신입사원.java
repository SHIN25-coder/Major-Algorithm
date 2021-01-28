package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[][] array;
		
		
		for(int i=0;i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			array = new int[N][2];
			for(int j=0;j<N;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				while(st.hasMoreTokens()) {
					array[j][0] = Integer.parseInt(st.nextToken());
					array[j][1] = Integer.parseInt(st.nextToken());
				}
			}
			// 주요함수 
			recursive(array);
		
		}
	
	}
	
	public static void recursive(int[][] array) {
		
		// 이차원배열 정렬 
		int result = 1;
		
		Arrays.sort(array,new Comparator<int[]>() {

			public int compare(int[] arg0, int[] arg1) {
				// TODO Auto-generated method stub
				return arg0[0]-arg1[0];
			}
			
		});
			
		int min = array[0][1]; // 최솟값설정
		
		for(int i=1;i<array.length;i++) {
			// 최솟값보다 다음에 원소가 더 작은 경우 -> 신규사원
			if(array[i][1]<min) {
				min = array[i][1];
				result++;
			}
		}
		
		System.out.println(result);
		
}
}

