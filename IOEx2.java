package IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {

	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		
		ByteArrayInputStream  input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		//output = new ByteArrayOutputStream(outSrc); <- byte[] outSrc = {1,2,3,4,5}일 때
		//The constructor ByteArrayOutputStream(byte[]) is undefined 에러가 남.
		
		
		input.read(temp,0,temp.length); //읽어온 데이터를 temp에 담는다.
		output.write(temp,5,5); //temp[5]부터 5개의 데이터를 write한다. -- >>output 에 넣음
				
		outSrc = output.toByteArray();  //스트림의 내용을 byte 배열로 반환한다.
		
		System.out.println("Input Source :" +Arrays.toString(inSrc));
		System.out.println("Output Sourcd :" +Arrays.toString(outSrc));
		System.out.println("temp :"+Arrays.toString(temp));
		
		
		/**출력 데이터**/
		
		//Input Source :[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		//Output Sourcd :[5, 6, 7, 8, 9]
		//temp :[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		
	}

}
