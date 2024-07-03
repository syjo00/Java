package algorithm;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
public class P11659_구간합구하기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		
		int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 5 3 입력
		int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 10 20 30 40 50 입력 
		
		long[] S = new long[suNo + 1];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		//숫자개수 만큼 반복하기
		for(int i=1;i<=suNo;i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken()); //합 배열 생성하기
		}
		
		//질의 개수만큼 반복하기
		for(int q=0; q<quizNo;q++) {
			//질의의 범위 받기
			stringTokenizer = new StringTokenizer(bufferedReader.readLine()); //1 3 입력
			int i = Integer.parseInt(stringTokenizer.nextToken()); //stringTokenizer() :띄어쓰기를 구분화하여 토큰화한다.
			int j = Integer.parseInt(stringTokenizer.nextToken());
			
			//구간의 합을 출력함
			System.out.println(S[j]-S[i-1]);
		}
		
		
	}

}
