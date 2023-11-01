package algorithm;

import java.util.Scanner;

//브루트-포스법으로 문자열 검색
class BFmatch {
	
	//브루트-포스법으로 문자열 검색하는 메서드
	static int bfMatch(String txt,String pat) {
		
		int pt = 0;
		int pp = 0;
		
		while(pt !=txt.length() && pp!=pat.length()) {
		
			if(txt.charAt(pt) == pat.charAt(pp)){
				
				pt++;
				pp++;
				
			}else {
				pt = pt-pp+1;
				pp=0;
			}	
			
		}//while
		
		if(pp ==pat.length()) 
			
			return pt-pp; //검색성공
		
		return -1;//검색실패
	
	}//bfMatch메서드
	
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("텍스트 : "); //텍슽트용 문자열
		
		String s1 = stdIn.next();
		
		System.out.print("패턴 : "); //패턴용 문자열
		
		String s2 = stdIn.next();
		
		int idx = bfMatch(s1,s2);//문자열 s1에서 문자열 s2검색
		
		if(idx == -1) 
			System.out.println("테스트에 패턴이 없습니다.");
		
		else {			
			
			//일치하는 문자 바로 앞까지의 문자 개수를 반각 문자로 환산하여 구함
			int len = 0;
			
			for(int i=0;i<idx;i++)
				
				len+=s1.substring(i,i+1).getBytes().length;
			
			len+=s2.length();
			
		}
		
		System.out.println((idx+1)+"번째 문자열ㄹ부터 일치합니다.");
		System.out.println("텍스트 : " +s1);
		  System.out.printf("패턴 : %s%n", s2);	
		
		
	}//main


}
