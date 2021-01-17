package Greedy;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] array = {500,100,50,10,5,1};
		
		int count = 0; 
		int result = 1000-N; 
		
		
		while(true) {
			
			if(result == 0) {
				break;
			}
			else {
				for(int i=0;i<array.length;) {
					if(result<array[i]) {
						i++;
						continue;
					}
					else {
						result = result-array[i];
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
		
		
	}

	}

