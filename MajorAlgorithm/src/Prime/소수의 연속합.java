package Prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backJoon_1644 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int count = 0;
		int result = 0;
		int[] prime = new int[4000010];
		
		for(int i=2;i<=N;i++) {
			prime[i] = i;
		}
		
		// 에라토스테네스의 체 
		for(int i=2;i<=N;i++) {
			if(prime[i] == 0 ) continue;
			for(int j=i+i;j<=N;j+=i) {
				prime[j]=0;
			}
		}
		
		int prime2[] = new int[N];
		int num = 0;
		
		for(int i=2;i<=N;i++) {
			if(prime[i]!=0) { num++; prime2[num] = i;}
		}
		
		// 소수리스트 완성 
		for(int i=num;i>0;i--) {
			for(int j=i;j>=0;j--) {
				
				result += prime2[j];
				
				if(result == N) { result = 0; count++; break;}
				if(result>N) { result=0; break;}
				if(result<N&&j==0) { result = 0; break;}
			
			}
		}
		
		System.out.println(count);
	}

}
