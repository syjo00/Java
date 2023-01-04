package IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
/*
 <<ByteArrayInputStream/ByteArrayOutputStream>>은 바이트배열에 데이터를 
 입출력하는데 사용되는 스트림이다. 주로 다른 곳에 입출력 하기 전에
 데이터를 임시로 바이트 배열에 담아서 변환 등의 작업을 하는 데에 사용된다 
 */


public class IOEx1 {
	
		
		public static void main(String[] args) {
			
		byte[] inSrc = {1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read())!=-1) { //input을 호출한 반환값을 변수 data에 저장한다, 데이터에 저장한 값이 -1이 아닌지 비교한다.
			output.write(data); //void write(int b)
		}
			
		
		outSrc = output.toByteArray(); //스트림의 내용을 byte 배열로 반환한다.
		
		System.out.println("Input Source :"+Arrays.toString(inSrc));
		System.out.println("output Source :"+Arrays.toString(outSrc));
		
			
		//Input Source :[1, 2, 3, 4, 5, 6, 7, 8, 9]
		//output Source :[1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		}
		
}
