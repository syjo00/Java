package algorithm;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class P2164_카드 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Queue<Integer> myQueue = new LinkedList<>();
		int N = sc.nextInt();
		
		//카드를 큐에 저장하기
		for(int i=0;i<=N;i++) {
			myQueue.add(i);
		}
		
		//카드가 1장 남을 때까지
		while(myQueue.size()>1) {
			
			//맨 위의 카드를 버림
			myQueue.poll();
			//맨 위의 카드를 가장 아래 카드 밑으로 이동
			myQueue.add(myQueue.poll());
			
		}
		//마지막으로 남은 카드 출력
		System.out.println(myQueue.poll());
		
		
	}

}
