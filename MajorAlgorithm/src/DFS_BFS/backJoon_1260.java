package DFS_BFS;

import java.util.Scanner;
import java.util.*;

public class backJoon_1260 {
	
	public static ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
	public static boolean dfsvisited[];
	public static boolean bfsvisited[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 정점의 개수
		int M = sc.nextInt(); // 간선의 개수
		int v = sc.nextInt(); // 탐색을 시작할 정점의 번호
		
		dfsvisited = new boolean[N+1];
		bfsvisited = new boolean[N+1];
		
		for(int i=0;i<N+1;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		// 노드 삽입
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		dfs(v); 
		System.out.println();
		bfs(v);
	}

	public static void dfs(int node) {
		// TODO Auto-generated method stub
		if(!dfsvisited[node]) {
			System.out.print(node+" ");
			dfsvisited[node] = true;
			
			Collections.sort(list.get(node));
			
			for(int i=0;i<list.get(node).size();i++) {
				int c = list.get(node).get(i);
				if(dfsvisited[node]) 
					dfs(c);
			}
		}
	}

	public static void bfs(int node) {
		Queue<Integer> q= new LinkedList<Integer>();
		q.offer(node);
		
		bfsvisited[node] = true;
		
		while(!q.isEmpty()) {
			
			int x = q.poll();
			System.out.print(x+" ");
			
			Collections.sort(list.get(node));
			
			for(int i=0;i<list.get(x).size();i++) {
				int y = list.get(x).get(i);
				if(!bfsvisited[y]) {
					q.offer(y);
					bfsvisited[y] = true;
				}
			}
		}
	}

}

