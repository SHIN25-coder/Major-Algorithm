package backJoon;

import java.util.Scanner;

public class 폴리오미노 {
	
	static String result ="";
	static boolean judge = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String temp = "";
		
		int i=0;
		
		while(true) {
			
			if(i==s.length()) {
				stackmethod(temp);
				break;
			}
			if(s.charAt(i)=='X') {
				temp += s.charAt(i);
			}
			else {
				stackmethod(temp);
				result+='.';
				temp = "";
			}
			i++;
		}
		
		if(judge==true) {
			System.out.println("-1");
		}
		else {
			System.out.println(result);
		}
	}
	
	// 주요함수 
	public static void stackmethod(String s) {
		
		String temp = "";
		
		if(s.length()%2!=0) {
			judge = true;
		}
		else {
			
			for(int i=0;i<s.length();i++) {
				temp += s.charAt(i);
				if(temp.length()%4==0) {
					result += "AAAA";
					temp = "";
				}
				else if(temp.length()%4==2&&i==s.length()-1) {
					result+="BB";
					temp = "";
				}
			}
		}
		
	}

}
