package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1377_버블소트1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		
		mData[] A = new mData[N];
		
		
		for(int i =0; i<N;i++) {
			
		}
		
	}//main
	
	class mData implements Comparable<mData>{
		
		int value;
		int index;
		
		public mData(int value,int index) {
			
			super();
			//많은 프로그래머는 클래스의 생성자에 super()를 명시적으로 호출하는 것을 습관처럼 합니다. 
			//이는 코드를 읽는 사람에게 "여기서 부모 클래스의 생성자를 호출한다"는 것을 명확히 하기 위해서입니다.
			this.value = value;
			this.index = index;
		}
				
		public int compareTo(mData o) { //value기준 오름차순 정렬하기
			return this.value - o.value;
		}
				
	}//mData
	
}
