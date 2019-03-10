import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution3124 {
	static int N, E;
	static int[] parent; 
	static boolean[] visit;
	static ArrayList<Edge> mst;
	static PriorityQueue<Edge> pq;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T;tc++) {
			N = sc.nextInt();
			E = sc.nextInt();
			
			visit = new boolean[N+1];
			parent = new int[N+1];
			pq = new PriorityQueue<>(new EdgeComparator());
			mst = new ArrayList<>();
			
			for(int e=0; e<E; e++) {
				int st = sc.nextInt();
				int end = sc.nextInt();
				int value = sc.nextInt();
				pq.add(new Edge(st,end,value));
			}
			
			kruskal();
			long sum = 0;
			for(int i=0; i<mst.size(); i++) {
				sum += mst.get(i).value;
			}
			System.out.println("#"+tc+" "+sum);
		}
	}
	
	static void kruskal() {
		for(int i=1; i<=N; i++) {
			parent[i] = i;
		}
		
		for(int i=0; i<E; i++) {
			Edge edge = pq.poll(); 
			if(find(edge.start) == find(edge.end)) { 
				continue;
			}
			union(edge.start, edge.end); 
			mst.add(edge);
		}
		
	}

	static int find(int n) { 
		if (parent[n] == n) {
			return n;
		}
		parent[n] = find(parent[n]);
		return parent[n];
	}
	static void union(int n1, int n2) { 
		int p1 = find(n1);
		int p2 = find(n2);

		if (p1 != p2) {
			parent[p1] = p2;
		}
	}

	static class EdgeComparator implements Comparator<Edge> {
		@Override
		public int compare(Edge o1, Edge o2) {
			return o1.value > o2.value ? 1 : -1;
		}

	}
	
	static class Edge { 
		int start, end, value;

		Edge(int s, int e, int v) {
			start = s;
			end = e;
			value = v;
		}
	}
}
