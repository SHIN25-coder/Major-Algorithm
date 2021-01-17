package DFS_BFS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class backJoon_11725{
	
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	public static boolean[] visited;
	public static int[] parents;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0;i<=N;i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		visited = new boolean[graph.size()];
		parents = new int[N+1];
		
		for(int j=1;j<N;j++) {
			int node = scan.nextInt();
			int node2 = scan.nextInt();
			graph.get(node).add(node2);
			graph.get(node2).add(node);
		}
		
		dfs(1);
		
		for(int i=2;i<N+1;i++) {
			System.out.println(parents[i]);
		}

	}

	public static void dfs(int x) {
		// TODO Auto-generated method stub
		if(!visited[x]) {
			visited[x] = true; 

		// 현대 노드와 연결된 다른 노드를 재귀적으로 방문
			for(int i=0;i<graph.get(x).size();i++) {
				int y = graph.get(x).get(i);
				if(visited[y]) parents[x] = y;
				dfs(y);
		}
	
		}
	}

}
