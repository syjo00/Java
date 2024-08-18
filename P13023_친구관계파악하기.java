package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class P13023_친구관계파악하기 {
	
	static boolean visited[];
	static ArrayList<Integer>[] A;
	static boolean arrive;
		
	public static void main(String[] args) {
		
		int N;
		int M;
		arrive = false;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		A = new ArrayList[N];
		
		visited = new boolean[N];
		for(int i=0;i<N;i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<M;i++) {
			int S = scan.nextInt();
			int E = scan.nextInt();
			A[S].add(E);
			A[E].add(S);
		}
		
		for(int i=0;i<N;i++) {
			DES(i,1);
			if(arrive)
				break;
		}
		if(arrive)
			System.out.println("1");
		else
			System.out.println("0"); //5의 깊이가 없다면 0출력
		
	}

	private static void DES(int now, int depth) { //DFS 구현하기
		
		if(depth == 5 || arrive) {//depth가 5가 되면 프로그램 종료
			arrive = true;
			return;
		}
		visited[now] = true;
		for(int i : A[now]) {
			if(!visited[i]) {
				DES(i,depth +1);	//재귀 호출이 될 떄마다 depth를 1씩 증가
			}
		}
		visited[now] = false;
	}

	
}
