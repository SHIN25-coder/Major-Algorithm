package bruteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class backJoon_7568 {
	// ��ġ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] result = new int[N];
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<N;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<N;i++) {
			result[i] = 1;
			list.get(i).add(sc.nextInt());
			list.get(i).add(sc.nextInt());
		}
		
		// Ű�� ��ġ�� ��� ũ�� A�� ��ġ�� B�� ��ġ���� ��ũ��.
		// �׿��� ��쿡�� �׷��� ���Ҽ�����.

		
		for(int i=0;i<list.size();i++) {
			
			int a = list.get(i).get(0); // ������
			int b = list.get(i).get(1); // Ű 
			
			
			for(int j=0;j<list.size();j++) { 
				
				if(a>list.get(j).get(0)&&b>list.get(j).get(1)) {
				
					result[j]++;
				}
				
			}
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
		
	}

}
