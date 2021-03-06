import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution1251 {
	static int N; 
	static int[] parent; 
	static boolean[] visit;
	static ArrayList<Edge> mst;
	static PriorityQueue<Edge> pq;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T;tc++) {
			N = sc.nextInt();
			int[] x = new int[N];
			int[] y = new int[N];
			visit = new boolean[N + 1];
			parent = new int[N + 1];
			pq = new PriorityQueue<>(new EdgeComparator());
			mst = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				x[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				y[i] = sc.nextInt();
			}
			double E = sc.nextDouble();
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if ( i == j ) {
						continue;
					}
					long value = (long)(Math.pow(x[i]-x[j],2)+(long)Math.pow(y[i]-y[j],2));
					pq.add(new Edge(i,j,value));
				}
			}
			kruskal();
			double sum = 0;
			
			for(int i=0; i<mst.size(); i++) {
				sum += mst.get(i).value * E;
			}
			System.out.printf("#%d %.0f\n",tc,sum);
		}
	}
	
	static void kruskal() {
		for(int i=1; i<N; i++) { 
			parent[i] = i;
		}
		int len = pq.size();
		for(int i=0; i<len; i++) {
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
		int start, end;
		long value;

		Edge(int s, int e, long v) {
			start = s;
			end = e;
			value = v;
		}
		@Override
		public String toString() {
			return "Edge [start=" + start + ", end=" + end + ", value=" + value + "]\n";
		}
	}
}
