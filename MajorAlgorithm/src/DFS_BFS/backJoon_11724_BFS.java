package DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class backJoon_11724_BFS {
	
	public static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	public static boolean[] visited;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		visited = new boolean[N+1];
		int count = 0;
		
		for(int i=0;i<N+1;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=1;i<M+1;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		

		for(int i=1;i<visited.length;i++) {
			if(visited[i]==false) {
				count++;
				bfs(i);
			}
		}
		System.out.println(count);
	}
	
	public static void bfs(int node) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(node);
		
		visited[node] = true;
		
		while(!q.isEmpty()) {
			int x = q.poll();
			//System.out.print(x+" ");
			for(int i=0;i<list.get(x).size();i++) {
				int y = list.get(x).get(i);
				if(!visited[y]) {
					q.offer(y);
					visited[y] = true;
				}
			}
		}
		
	}

}
