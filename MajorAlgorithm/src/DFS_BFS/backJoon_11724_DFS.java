package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class backJoon_11724_DFS {
	
	public static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	public static boolean visited[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// 방향 없는 그래프가 주어졌을때 연결 요소의 개수를 구하는 프로그램을 작성하시오.
		
		int N = scan.nextInt(); // 정점의 개수
		int M = scan.nextInt(); // 간선의 개수
		
		int count = 0;
		visited = new boolean[N+1];
		
		for(int i=0;i<N+1;i++) {
			list.add(new ArrayList<Integer>());
		}
			
		// 노드삽입
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
