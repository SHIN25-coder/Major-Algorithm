package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class backJoon_10867 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        
        ArrayList<Integer> array = new  ArrayList<Integer>();
		int cnt = 0;
		
		
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
		for(int i=0;i<num;i++) {
			
			int a = Integer.parseInt(st.nextToken());
			cnt = 0;
			
			for(int j=0;j<=i;j++) {
				if(array.contains(a)) {
					cnt++; break; 
				}
				if(cnt==0) {
					array.add(a); cnt = 0;
				}
			}
		}
		
		Collections.sort(array);
	
		for(int i=0;i<array.size();i++) {
			System.out.print(array.get(i)+" ");
		}
		
	}
}
