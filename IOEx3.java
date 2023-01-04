package IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 {
	
	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		
		ByteArrayInputStream input =null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		//System.out.println("Input Source :" + Arrays.toString(inSrc));
		//Input Source :[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		try {
			
			while(input.available()>0) { //available은 blocking 없이 읽어올 수 있는 바이트 수를 반환한다.
				
				input.read(temp);//읽어온 데이터를 temp에 담는다.
				output.write(temp); //temp의 데이터를 output에 넣음
				
				System.out.println("temp: " +Arrays.toString(temp));
				
				outSrc = output.toByteArray(); //스트림의 내용을 byte 배열로 반환한다.
				printArrays(temp,outSrc);
								
			}//while
			
		}catch(IOException e) {}		
		
		}//main
	
	
		static void printArrays(byte[] temp,byte[] outSrc) {
			
			System.out.println("temp :" +Arrays.toString(temp));
			System.out.println("Output Source :" +Arrays.toString(outSrc));
			
		}
		
	}
	

