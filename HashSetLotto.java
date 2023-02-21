package HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class HashSetLotto {
	
	public static void main(String[] agrs) {
		
		Set set = new HashSet();
		
		for(int i=0; set.size()<6;i++) {
			
			int num = (int) (Math.random()*45) +1;
			set.add(new Integer(num));
			
		}
		
		List list = new LinkedList(set);
		Collections.sort(list); //Collection클래스의 sort(List list)를 사용함.
		System.out.println(list); //출력 :[12, 14, 16, 19, 20, 24]

		
		
	}
	
}
