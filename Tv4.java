package Class;

class TvTest4 {

	public static void main(String[] args) {
		
		TV[] tvArr = new TV[3]; //길이가 3인 Tv객체배열
		
		
		//Tv객체를 생성해서 Tv객체배열의 각 요소에 저장
		for(int i=0;i<tvArr.length;i++) {
			tvArr[i]= new TV();
			tvArr[i].channel = i+10; //tvArr[i]의 channel에 i+10저장			
			
		}
		
		
		for(int i=0;i<tvArr.length;i++) {
			tvArr[i].chnnelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}

	}//main
	
}

	class TV{
		
		String color;
		boolean power;
		int channel;
		
		void powe(){power=!power;}
		void chnnelUp(){++channel;}
		void channelDown(){--channel;}
	
	}


