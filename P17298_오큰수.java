package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//오큰 수 :스택에 새로 들어오는 수가 top에 존재하는 수보다 크면 그 수는 오큰수가 된다.
//오큰 수를 구한 수열에서 오큰수가 존재하지 않는 숫자에 -1을 출력해야 한다.

public class P17298_오큰수 {

	public static void main(String[] args) throws  IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()); //수열 배열 생성
		
		int[] A = new int[n]; //정답 배열 생성
		
		int[] ans = new int[n];
		
		String[] str = bf.readLine().split(" ");
		
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(str[i]);			
		}
		
		Stack<Integer> myStack = new Stack();
		myStack.push(0); //처음에는 항상 스택이 비어있으므로 최초 값을 push해 초기화
		
		for(int i=0;i<n;i++) {
		
			//스택이 비어있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
			while(!myStack.isEmpty() && A[myStack.peek()]<A[i]) {				
				ans[myStack.pop()] = A[i]; //정답 배열에 오큰수를 현재 수열로 저장하기			
			}		
			myStack.push(i);		
		}
		
		while(!myStack.empty()) {
			//반복문을 다 돌고 나왔는데 스택이 비어있지 않다면 빌 때까지
			ans[myStack.pop()]=-1;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<n;i++) {
			bw.write(ans[i]+" ");
		}
		bw.write("\n");
		bw.flush();
		
	}//main

}//class
