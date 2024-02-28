package algorithm;

import java.util.Comparator;

public class ArrayLinkedList<E> {
	
	class Node<E>{
		
		private E data; //데이터를 참조
		private int next; //다음 노드를 참조
		private int dnext;
		
		//data와 next를 설정
		void set(E data,int next) {
			this.data = data;
			this.next = next;
		}
			
	}
	
	private Node<E>[] n; //리스트 본체
	private int size;	//리스트의 용량
	private int max;	//사용 중인 꼬리 record
	private int head;
	private int crnt;
	private int deleted;
	private static final int NULL = -1;
	
	
	//생성자
	private ArrayLinkedList(int capacity) {
		head = crnt = max = deleted = NULL;
		
		try {
			n = new Node[capacity];
			for(int i=0;i<capacity;i++)
				n[i] = new Node<E>();
				size = capacity;
		} catch (OutOfMemoryError e) {//배열 생성에 실패
			size = 0;
		}
		
	}
	
	//다음에 삽입하는 record의 인덱스를 구함
	public int getInsertIndex() {
		
		if(deleted == NULL) {//삭제할 record가 없음
			if(max<size)	
				return ++max;	//새 record를 사용
			else
				return NULL;	//용량 넘침
		}else {
			int rec = deleted; //프리 리스트에서
			deleted = n[rec].dnext; //머리 REC을 꺼냄
			return rec;
		}
	}
	
	//record idx를 프리 리스트에 등록
	
	private void deleteIndex(int idx) {
		
		if(deleted == NULL) {	//삭제할 record가 없음
			deleted = idx;	//idx를 프리리스트의
			n[idx].dnext = NULL;
		}else {
			int rec = deleted; //idx를 프리리스트의
			deleted = idx; //머리에 삽입
			n[idx].dnext = rec;
		}
		
	}
	
	//노드를 검색
	public E search(E obj,Comparator<? super E> c) {
		
		int ptr = head;
		
		while(ptr!= NULL) {
 			if(c.compare(obj, n[ptr].data)==0){//검색성공
 				crnt = ptr;
 				return n[ptr].data;
 			}
 			
 			ptr = n[ptr].next;
 		}
		return null;//검색 실패
	}
	
	//머리에 노드를 삽입
	public void addFirst(E obj) {
		
		int ptr = head;
		int rec = getInsertIndex();
		if(rec!=NULL) {
			head = crnt = rec;
			n[head].set(obj, ptr);
		}
	}

	
	//꼬리에 노드 삽입
	public void addLast(E obj) {
		if(head == NULL)
			addFirst(obj);
		else {
			int ptr = head;
			while(n[ptr].next!= NULL) 
				ptr=n[ptr].next;
			int rec = getInsertIndex();
			if(rec!=NULL) {
				n[ptr].next = crnt = rec;
				n[rec].set(obj, NULL);
			}
		}
			
	}//addLast
	
	
	//머리 노드를 삭제
	public void removeFirst() {
		if(head!=NULL) {
			int ptr = n[head].next;
			deleteIndex(head);
			head = crnt = ptr;
		}
			
	}
	
	//꼬리 노드를 삭제
	 public void removeLast() {
			 
		 if(head!=NULL) {
			 if(n[head].next == NULL)
				 removeFirst();
			 else {
				 int ptr = head;
				 int pre = head;
				 
				 while(n[ptr].next != NULL) {
					 pre = ptr;
					 ptr = n[ptr].next;
				 }
	
				 n[pre].next = NULL;
				 deleteIndex(ptr);
				 crnt = pre;
			 }
		 }
	 }
	 
	 //record p를 삭제
	 public void remove(int p) {
		 if(head != NULL) {
			 if(p==head)	//p가 머리노드이면
				 removeFirst();	//머리 노드를 삭제
			 else {
				 
				 int ptr = head;
				 
				 while(n[ptr].next!= p) {
					 ptr = n[ptr].next;
					 if(ptr== NULL) return;
				 }
				 n[ptr].next = NULL;
				 deleteIndex(p);
				 n[ptr].next = n[p].next;
				 crnt =ptr;
			 }
		 }
	 }
	 
	 //선택 노드를 삭제
	 public void removeCurrentNode() {
		 remove(crnt);
	 }
	 
	 
	 //모든 노드를 삭제
	 public void clear() {
		 while(head!=NULL) {
			 removeFirst();
			 crnt = NULL;
		 }
	 }
	 
	 //선택 노드들 하나 뒤쪽으로 진행
	 public boolean next() {
		if(crnt == NULL || n[crnt].next == NULL)
			return false;
		crnt = n[crnt].next;
		return true;
		 
	 }
	 
	 //선택한 노드를 출력
	 public void printCurrentNode() {
		 if(crnt == NULL)
			 System.out.println("선택한 노드가 없습니다.");
		 else
			 System.out.println(n[crnt].data);
	 }
	 
	 //모든 노드를 출력 
	 public void dump() {
		 int ptr = head;
		 while(ptr!=NULL) {
			 System.out.println(n[ptr].data);
			 ptr = n[ptr].next;
		 }
	 }
}
