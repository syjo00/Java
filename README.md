# java
java error 정리

---

```
int a = 10
error : Syntax error, insert ";" to complete calVariableDeclarationStatement
```

- 원인 : 자바는 모든 문장의 끝에 ;를 기재해야 한다. 입력하지 않으면 컴파일 오류가 발생한다.
- 해법 : " ; "를 찍는다.

```
java: cannot find symbol
```
- 에러내용 : 컴파일 에러
- 해결방법 : intelli j 사용의 경우 Run/Debug Configurations를 수정

```
입력내용 : int java = 45;
          System.out.printf("프로그램 시장에서 자바가 차지하는 점유율은 %d%입니다.",java);
※ error : Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '입'

```
- 에러내용 : 45%를 입력하고자 할 때 %문자 입력을 잘못함.
- 해결방법 :  System.out.printf("프로그램 시장에서 자바가 차지하는 점유율은 %d%%입니다.",java);로 입력

```
 입력내용 : System.out.printf("%,d"\n,100000);
 ※ error : java: illegal character: '\'
```
- 내용 : \n을 ""밖에 적음
- 해결방법 : System.out.printf("%d\n",10000)으로 입력
- 참고 :"%,d"는 1000단위 , 표현

```
입력내용 : short s2 = 10;
       	 byte b2;
         b2 = s2;
※ error : Type mismatch: cannot convert from short to byte

```
- 내용 : 형변환 , short를 byte로 형변환할 수 없음.
- 해결방법 : b2 = (byte)s2;

```
입력내용 :

package com.test.question.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q004 {

	public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("사용자가 페달을 발은 횟수 : \n");
    String pedal = reader.readLine();
    int result = Integer.parseInt(pedal);

    double wheelRound = (2*Math.PI*13)*0.0254; // 못풀었던 부분

    System.out.printf
    ("사용자가 총 %,d회 페달을 밟아 자전거가 총 &%,.3fM를 달렸습니다.\n",pedal,wheelRound*result);

에러내용 :

사용자가 페달을 발은 횟수 :
1000
사용자가 총 Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.String
at java.base/java.util.Formatter$FormatSpecifier.failConversion(Formatter.java:4426)
at java.base/java.util.Formatter$FormatSpecifier.printInteger(Formatter.java:2938)
at java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:2892)
at java.base/java.util.Formatter.format(Formatter.java:2673)
at java.base/java.io.PrintStream.format(PrintStream.java:1209)
at java.base/java.io.PrintStream.printf(PrintStream.java:1105)
at com.test.question.q3.Q004.main(Q004.java:28)

```
- 문제 :  요구사항 4] 자전거가 있다. 자전거의 바퀴는 지름이 26인치이다.
      	 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
         입력 :  사용자가 페달을 밟은 횟수 : 1000
      	 출력 : 사용자가 총 1000회 페달을 밟아 자전거가 총 3,000m를 달렸습니다.

- 내용 : BufferedReader reader = new BufferedReader(new InputStreamReader(System.in());
       → BufferedReader class 에러

- 해결방법 모름

```
입력내용 :

byte a = 10;
byte b = 20;
byte c = a +b;

※ error : incompatible types: possible lossy conversion from int to byte

```
- 내용 : 컴파일 에러라 발생함. 명시적으로 형변환이 필요함.
- 해결방법 : byte = (byte) (a+b);

```		
[Method]
	public static void main(String[] args) {
		
		test();// 메소드를 호출
		
		
	}//main메소드
	
	public static void test() {
		
		System.out.println("사과");
	}//test메소드
	
	public static void test() { 
		
		※ error : Duplicate method test() in type Overloading_Practice
		
		System.out.println("딸기");
		
	}//test 메소드
	
```
- 에러내용 : Duplicate method test()
- 설명 : 메소드가 중복되어 test()가 호출될 떄 System.out.println("사과");를 출력해야 하는지,
         System.out.println("딸기");를 출력해야하는지 알 수 없음
- 해결 방법 : test()메소드와 test2()메소드를 만든다.-> 각각 호출하는 메소드르 따로 만든다.

```
[Method]
public static void main(String[] args) {
		
		test(10);
		
	}
	
	public static void test(int n ) {
		
		System.out.println(n);
	}
	
	public static void test(int m) {//Duplicate method test(int)
		
		System.out.println(m);
	}
```
- 에러내용 : Duplicate method test(int)
- 설명 : 메소드가 중복되어 test()가 호출될 떄 System.out.println(n);를 출력해야 하는지,
        System.out.println(m);을 출력해야하는지 알 수 없음
- 해결방법 : 메소드명을 test(int n),test1(int m)을 만드거나 메소드 내의 인자를 test(int n),test(long m)으로 인자의 자료형을 수정한다.

```
[문자열비교] 변수.equals()

public class Q0003 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 : ");
		
		String letter = reader.readLine();
		
		String papa = "Father";
		
						
	★	if (letter =="F") || letter =="f") {
			
			System.out.printf("%s",papa); ★
		}
```
- 에러내용 : System.out.printf("%s",papa);가 력되지 않음
- 에러발생 이유 : 문자열 비교를 잘못 입력함.
- 문자열 비교 방법 : 다음과 같이 입력

```
			if (letter.equals("F") || letter.equals("f") {
						
			System.out.printf("%s",papa);
```      

```
[문자열,String]

String txt = "안녕하세요.";


		 for(int i=0; i<14; i++) { 
			 System.out.println(txt.charAt(i));
		 }
	※ Error : java.lang.StringIndexOutOfBoundsException: index 6, length 6
```
- "안녕하세요"의 "안"은 charAt(0),"녕"은 charAt(1),"하"는 charAt(2), "세"은 charAt(3),"요"는 charAt(4),
  "."은 chatAt(5)이다.
- 에러원인 : txt.charAt(6)~ txt.char(14)까지는 문자열이 없으므로 에러가 발생한다.
- 수정내용 : for(int i=0 ; i<6 ; i++)

```
//논리형 배열(boolean)
		boolean[ ] list4 = new boolean[3];
		list4[0] = true;
		System.out.println(list4[0]); 

출력 : true		
			
//논리형 배열(boolean)
		boolean[ ] list4 = new boolean[3];
		list4[4] = true;
		System.out.println(list4[0]);
		
※ error: java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3		
		
```
- 0~3까지의 공간이 있는데 list4[4]로 4번쨰 공간을 출력할수 없으므로 "Index 4 out of bounds for length 3"에러가 남.	

```
[Class]

public static void main(String[] args) {

Item item1 = null;
Item item2 = new Item;
Item item3;


item1.setColor("노랑");
System.out.println(item1.getColor());

※ Error : java.lang.NullPinterException or NullReferenceException or 널참조

}

class Item {
	private String name;
	private String color;
	private int price;

	public String getName() {
			return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getColor() {
	return color;
	}

	public void setColor(String Color){
	this.color = color;
	}

	public int getPrice(){
	return price;
	}

	public void setPrice(int price) {
	this.price = price;
	}
}

```
- 에러사항 : java.lang.NullPinterException or NullReferenceException or 널참조
- 에러원인 : 지역변수("Item1 = null")를 초기화하지 않았기 때문에 애러가 발생함.

```
[Static Method]

public class Ex39 {

	
	public static void main(String[] args) {
	
	//1. 객체변수 접근
	Static item1 = new StaticItem();
	item1.a = 100;
	item1.aaa();
	
	//2. 정적변수 접근 -> 클래스 이름을 통해서 접근
	
	StaticItem.b = 200;
	
	StaticItem.bbb();
	
	}

	class StaticItem {
	
	public int   =10;
	public static int b=100;
	
	public void aaa() {
	
		System.out.println(this.a); //같은 객체 내부이기 떄문에 this생략이 가능
		System.out.println(StaticItem.b); //같은 클래스 내부이기 때문에 생략이 가능
	
	}//aaa
	
	public static void bbb() {
	
		System.out.println(this.a); ★★★
		System.out.println(StaticItem.b);		
	
	}//bbb
	
```
- 에러내용 : Cannot use this in a static context  ★★★
- 에러발생이유 : bbb()메소드에서 변수 a는 static메소드에서 사용할 수 없다.

```
[constructor]

class Data1 {

        int value;
        
}//Data1

public class Data2 {

    int value;

    Data2(int x) {//매개변수가 있는 생성자

        value = x;

       }
       
}//Data2

public class ConstructorTest {

    public static void main(String[] args) {

       Data1 d1 = new Data1();
       Data2 d2 = new Data2(); 
       
※ Data2 d2 compile error : onstructor Data2 in class Constructor.Data2 cannot be applied to given types;
       
    }

}//ConstructorTest

```
- 에러발생 이유 : Data1에는 정의되어 있는 생성자가 없었지만 Data2에는 Data2(int x) 생성자가 정의되어 있으므로 
                 기본 생성자가 추가되지 않는다.컴파일러가 기본 생성자를 추가해주는 경우는 '클래스 내에서 생성자가
		 하나도 없을 때' 이다.    			   			   
- 에러 수정 : Data2 d2 = new Data2() -> Data2 d2 = new Data2(10);으로 수정

```	
	[Exception]
	
	public class ExceptionEx2 {	
		public static void main(String[] args){
		
		    int number = 100;
		    int result = 0;
		
		    for(int i =0; i<10; i++){
		        result = number/ (int) (Math.random() *10);
		        System.out.println(result);
		    }
	
		}//main
	}//class
	
	※ Error :Exception in thread "main" java.lang.ArithmeticException: / by zero
	   at Exception.ExceptionEx2.main(ExceptionEx2.java:11)
  
```
- Error : ArithmeticException
- 에러설명 : 산술연산 과정에서 발생하는 에러이며 정수는 0으로 나누는 것은 금지되어 있기 때문에 발생하는 에러이다. 
  하지만 실수를 0으로 나누는 것은 금지되어 있지 않으며 예외가 발생하지 않는다.

```
 	[try - catch] ArithmeticException 예외가 발생하지 않는 방법
 	
 	public static void main(String[] args){

        int number = 100;
        int result = 0;

        for(int i=0; i<10; i++){

            try{
            
                result= number/(int) (Math.random()*10);
                
                System.out.println(result);
                
            } catch (ArithmeticException e){
            
                System.out.println("0");
                
            }//try - catch의 끝

        }//for

    }//main   

```
- 위처럼 입력하면 ArithmeticException 예외가 발생하지 않는다.

```
[stack]

  Stack<String> stack = new Stack<String>();
		
		//요소 추가
		stack.push("빨강");
		stack.push("파랑");
		stack.push("노랑");
		
		//요소개수
		System.out.println(stack.size());
		
		//요소 읽기(+삭제)
		System.out.println(stack.pop()); //노랑
		System.out.println(stack.size()); //2
		
		System.out.println(stack.pop()); //파랑
		System.out.println(stack.size()); //1
		
		System.out.println(stack.pop()); //빨강
		System.out.println(stack.size()); //0
		
		System.out.println(stack.pop()); 		
		System.out.println(stack.size());
		
		※ error :  java.util.EmptyStackException
		
```

- 에러원인 : stack안에 더이상 데이터가 없는데 데이터를 읽었기 때문에 EmptyStackexception에러가 발생한다.
- 해결방법 : stack.push("주황"); 데이터를 추가한 후 System.out.println(stack.pop()); 다시 읽는다.

```
[Queue]

Queue <String>queue = new Queue <String>();

※ error : Cannot instantiate the type Queue<String>

```
- 에러원인 : Queue는 객체를 생성할 수 없다.
- 해결방법 : Queue<String> queue = new LinkedList<String>(); 

```
[final]

	int a = 10; //일반변수
	final int b= 20; // final변수
	
	System.out.println(a);
	System.out.println(b);
	
	a=30;
	b=40;

※ error : The final local variable b cannot be assigned. 
  It must be blank and not using a compound assignment.

```
- 에러원인 : final 변수는 수정할 수 없다.		

```
[final]

final class FinalParent {
	
	public final void test() {
		System.out.println("부모 행동");
	}
	
}


class FinalChild extends FinalParent {	

	※ error : The type FinalChild cannot subclass the final class FinalParent           
		
    @Override
    public void test() { 

    System.out.println("자식 행동");

    ※ error :Cannot override the final method from FinalParent

    }//test
    
}//FinalParent
```
- 에러발생 원인 : final클래스는 상속을 할 수 없으며, 클래스 안의 메소드는 Override될 수 없다.

```
[array]

  //요구사항] int 숫자 -> 1~10까지 저장

int [] num = new int[10];

//배열 안에 방 10개 -> 숫자대입
//배열 탐색
	for(int i =0; i< num.length; i++){
	    num[i] = i+1;
	}

//출력
System.out.println(num[0]);
System.out.println(num[1]);
System.out.println(num[2]);
System.out.println(num[3]);
System.out.println(num[9]);

System.out.println(num[10]);
※ error : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
				    
```
- 에러원인 : 변수 num의 방의 개수는 10개(0번~9번방)이기 때문에 10번방은 범위를 벗어났으므로
            "ArrayIndexOutOfBoundsException"에러가 발생했다.
```
[for문]	
				
int num = 10;				    
		
if(num>0) {//1번 if문
	
	//지역변수(if문을 지역으로)
	String result = "통과";
	
	if(num>0){//2번 if문
	
		String result2 = "통과":
	
	}//2번 if문
	System.out.println(result2);
	
}//1번 if문		    
System.out.println(result);
	
※ 에러 : result cannot be resolved to a variable.

```
- 에러원인 : 변수를 출력할 때는 제어문 내에서 출력을 해야한다.	
- 해결방법 : "System.out.println(result);"은 1번 if문 내에 포함되어야 하고, "System.out.println(result2);"은 		2번 if문 내에 포함되어야 한다.

```
	
	
