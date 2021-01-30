package Sorting;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class backJoon_2870 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파싱문제
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		String result = "";

		// 연속된 숫자만 해당 가능!
		for(int i=0;i<N;i++) {
			String s = scanner.next();
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)>=48&&s.charAt(j)<=57) {
					result += s.charAt(j);
				}
				else {
					if(!result.equals("")) {
						BigInteger b = new BigInteger(result);
						list.add(b);
						result = "";
					}
				}
			}
			
			if(!result.equals("")) {
				BigInteger b = new BigInteger(result);
				list.add(b);
				result = "";
			}	
		}
			
		Collections.sort(list);

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
