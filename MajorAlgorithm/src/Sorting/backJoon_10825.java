package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class backJoon_10825 {
	
	/*
	 * 국어 점수가 감소하는 순서로
	 * 국어 점수가 같으면 영어 점수가 증가하는 순서로 
	 * 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
	 * 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[][] array = new String[N][4];
		
		for(int i=0;i<array.length;i++) {
			array[i][0] = scan.next();
			array[i][1] = scan.next(); // 국어점수
			array[i][2] = scan.next(); // 영어점수
			array[i][3] = scan.next(); // 수학점수
 		}
		
		// 2차원 배열이라면 해당 함수로 비교 
		Arrays.sort(array,new Comparator<String[]>() {
			// compare함수를 어떻게 정의하느냐에 따라서 달라진다. I
			public int compare(String[] o1,String[] o2) {
				// 1. 국어 점수가 감소하는 순서
				if(Integer.compare(Integer.parseInt(o2[1]),Integer.parseInt(o1[1])) == 0) {
					
					if(Integer.compare(Integer.parseInt(o1[2]),Integer.parseInt(o2[2])) == 0 ) {
						
						if(Integer.compare(Integer.parseInt(o2[3]),Integer.parseInt(o1[3])) == 0 ) {
						
							return o1[0].compareTo(o2[0]);
							// 국어,영어,수학 점수가 같은 경우 , 
						
						}
						else {
							
							return Integer.compare(Integer.parseInt(o2[3]),Integer.parseInt(o1[3]));
							// 국어,영어가 같은 경우 , 내림차순 정렬 
						}
					}
					else {
						
						return Integer.compare(Integer.parseInt(o1[2]),Integer.parseInt(o2[2]));
						// 국어가 같은 경우 , 오름차순 정렬 
					}
				}
				
				else {
					return Integer.compare(Integer.parseInt(o2[1]),Integer.parseInt(o1[1]));
					// 내림차순 정렬 
				}
					
			}
	
		});
		
	
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i][0]);
		}
		
	}
	}

