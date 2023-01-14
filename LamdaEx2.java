package Lamda;

//람다식의 타입과 형변환


@FunctionalInterface
interface MyFunction2 {
	void myMethod(); //추상메서드
}


public class LamdaEx2 {

	public static void main(String[] args) {
		
	MyFunction f = () ->{};	//MyFunction f = (MyFunction)(()->{});
	
	Object obj = (MyFunction) (()->{}); //Object타입으로 형변환이 생략됨.
	
	String str = ((Object) (MyFunction) (() -> {})).toString();
	
	System.out.println(f);  //Lamda.LamdaEx2$$Lambda$23/0x00000008000c03f8@3b6eb2ec --> 출력
	System.out.println(obj); //Lamda.LamdaEx2$$Lambda$24/0x00000008000c0610@1e643faf --> 출력 
	System.out.println(str); //Lamda.LamdaEx2$$Lambda$25/0x00000008000c0828@6a5fc7f7 --> 출력
	
	//System.out.println(()->{}); 에러. 람다식은 Object 타입으로 형변환이 되지 않음.
	System.out.println((MyFunction)(() -> {})); //Lamda.LamdaEx2$$Lambda$26/0x00000008000c0a40@7a79be86 -->출력
	//System.out.println((MyFunction)(()->{}).toString()); //에러 : The target type of this expression must be a functional interface
	System.out.println(((Object)(MyFunction)(()->{})).toString()); //Lamda.LamdaEx2$$Lambda$27/0x00000008000c0c58@b684286 --> 출력
	
	
	}

}
