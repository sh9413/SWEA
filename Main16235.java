import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
/***
 * 
 * 나무재테크 .. 시뮬레이션 문제
 * 
 * @author sh9413
 *
 */


public class Main16235 {
	static int N;
	static int[] dx = {-1,-1,-1,0,0,+1,+1,+1};
	static int[] dy = {-1,0,+1,-1,+1,-1,0,+1};	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int[][] map = new int[N][N];
		int[][] A = new int[N][N];
		for(int i=0; i<N;i++) {
			for(int j=0; j<N;j++) {
			map[i][j] = 5;
			A[i][j] = sc.nextInt();
			}
		}
		Queue<tree> alive = new LinkedList<>();
		Queue<tree> death = new LinkedList<>();
		PriorityQueue<tree> q = new PriorityQueue<>(new Comparator<tree>() {
			@Override
			public int compare(tree o1, tree o2) {
				if ( o1.age < o2.age ) {
					return -1;
				} else if ( o1.age > o2.age) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		
		for(int i=0; i<M; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			int z = sc.nextInt();
			q.add(new tree(x,y,z));
		}
		for(int k=0; k<K; k++) {
			//// 봄 
			while(!q.isEmpty()) {
				tree tree = q.poll();
				if( map[tree.y][tree.x] >= tree.age ) {
					map[tree.y][tree.x] -= tree.age;
					alive.add(new tree(tree.x,tree.y,tree.age+1));
				} else {
					death.add(new tree(tree.x,tree.y,tree.age));
				}
			}
			while(!alive.isEmpty()) {
				q.add(alive.poll()); // 살아남은 나무 기록
			}
			//// 여름
			while(!death.isEmpty()) {
				tree tree = death.poll();
				map[tree.y][tree.x] += (tree.age/2); 
			}
			
			//// 가을;
			for(tree tree : q) {
				if ( tree.age%5 == 0 ) {
					for(int dir=0; dir<8; dir++) {
						int tempX = tree.x+dx[dir];
						int tempY = tree.y+dy[dir];
						if( InRange(tempX,tempY)) {
							alive.add(new tree(tempX,tempY,1));
						}
					}
				}
			}
			while(!alive.isEmpty()) {
				q.add(alive.poll()); // 추가된 나무 기록
			}
			//// 겨울
			for(int i=0; i<N;i++) {
				for(int j=0; j<N;j++) {
					map[i][j] += A[i][j];
				}
			}
		}
		
		System.out.println(q.size());
	}
	

	public static boolean InRange(int x,int y) {
		if( y >= 0 && x >= 0 && y < N && x < N ) {
			return true;
		}
		return false;
	}
	
	
	public static class tree {
		int x;
		int y; 
		int age;
		public tree(int X,int Y,int Age) {
			x=X;
			y=Y;
			age=Age;
		}
		@Override
		public String toString() {
			return "tree [x=" + x + ", y=" + y + ", age=" + age + "]";
		}
	}
}
