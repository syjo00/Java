package algorithm;

import java.util.Scanner;

//int형 고정 길이 큐의 사용 예
public class IntQueueTester {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		IntQueue s = new IntQueue(64); //최대 64개를 인큐할 수 있는 큐
		
		
		while(true) {
			System.out.println();
			System.out.printf("현재 데이터 개수 : %d / %d\n",s.size(),s.getCapacity());
			System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)종료");
			
			int menu = scan.nextInt();
			if(menu ==0 ) break;
			
			int x;
			switch(menu) {
				case 1 :
					System.out.print("데이터 :");
					x = scan.nextInt();
					try {
						s.enque(x);
					} catch (IntQueue.OverflowIntQueueException e) {
						System.out.println("큐가 가득찼습니다.");
					}
					
					break;
					
				case 2 :
					x = s.deque();
					System.out.println("디큐한 데이터는 " +x + "입니다.");
					
					try {
						x= s.deque();
						System.out.println("디큐한 데이터는" + x +"입니다.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어있습니다.");
					}
					
					break;
					
				case 3 :
					try {
						x = s.peek();
						System.out.println("피큐한 데이터는 " + x + "입니다.");						
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어있습니다.");
					}
					
					break;
					
				case 4 :
					s.dump();
					break;
			}//switch
			
		}
		
	}
	
}
