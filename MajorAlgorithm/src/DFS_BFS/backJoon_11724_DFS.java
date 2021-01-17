package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class backJoon_11724_DFS {
	
	public static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	public static boolean visited[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// ���� ���� �׷����� �־������� ���� ����� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int N = scan.nextInt(); // ������ ����
		int M = scan.nextInt(); // ������ ����
		
		int count = 0;
		visited = new boolean[N+1];
		
		for(int i=0;i<N+1;i++) {
			list.add(new ArrayList<Integer>());
		}
			
		// ������
		for(int i=1;i<M+1;i++) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();

			list.get(a).add(b);
			list.get(b).add(a);
			
		}
		
		
		for(int i=1;i<visited.length;i++) {
			if(visited[i]==false) {
				count++;
				dfs(i);
			}
		}
		
		System.out.println(count);
		
			
	}
	
	public static void dfs(int node) {
		
		if(!visited[node]) {
			visited[node] = true;
			for(int i=0;i<list.get(node).size();i++) {
				int y = list.get(node).get(i);
				if(visited[node])  dfs(y);
			}
		}

	}

}
