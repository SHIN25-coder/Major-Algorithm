package bruteForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class backJoon_2309 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> array = new ArrayList<Integer>();
		int result = 0; int total = 0; int N = 0; int M =0;
		
		for(int i=0;i<=8;i++) {
			
			array.add(scan.nextInt());
			total += array.get(i);
			
		}
		
		for(int i=0;i<array.size();i++) {
			for(int j = i+1;j<array.size();j++) {
				result = array.get(i)+array.get(j);
				if(total-result==100) {
					N = array.get(i);
					M = array.get(j);
					i = array.size()-1;
					break;
				}
			}
		}
		
		array.remove(array.indexOf(N));
		array.remove(array.indexOf(M));

		Collections.sort(array);
		
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
	
	}

}
