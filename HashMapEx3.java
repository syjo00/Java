package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {

	@SuppressWarnings("rawtypes") //*노란색 경고 제외
	static HashMap phoneBook  = new HashMap();
	
	public static void main(String args[]) {
		
		addPhoneNo("친구","이자바","010-111-1111");
		addPhoneNo("친구","김자바","010-111-1111");
		addPhoneNo("친구","김자바","010-111-1111");
		addPhoneNo("친구","김대리","010-111-1111");
		addPhoneNo("친구","김대리","010-111-1111");
		addPhoneNo("친구","박과장","010-111-1111");
		addPhoneNo("친구","이과장","010-111-1111");
		addPhoneNo("세탁","010-111-1111");

		printList();
		
	}//main
	


	//그룹에 전화번호를 추가하는 메서드
	@SuppressWarnings("unchecked") 
	static void addPhoneNo(String groupName, String name, String tel) {
		
		addGroup(groupName);
		
		@SuppressWarnings("rawtypes")
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
		
		
	}

	
	//그룹을 추가하는 메서드
	@SuppressWarnings({ "unchecked", "rawtypes" })
	static void addGroup(String groupName) {
		
		if(!phoneBook.containsKey(groupName)) 
			phoneBook.put(groupName, new HashMap());
			
		
	}
	

	private static void addPhoneNo(String name, String tel) {
		
		addPhoneNo("기타",name,tel);
			
	}

	
			//전화번호부 전체를 출력하는 메서드
			 @SuppressWarnings("rawtypes")
			static void printList() {
				
				Set set = phoneBook.entrySet(); //entrySet(): 키와 값을 함께 가져오는 메서드
				Iterator it = set.iterator();
				
				while(it.hasNext()) { //hasNext()메서드는 boolean타입으로 반환
					
				 Map.Entry e = (Map.Entry)it.next(); //next()메서드는 아무 타입으로 반환가능
				 
				 Set subSet = ((HashMap)e.getValue()).entrySet();
				 Iterator subIt = subSet.iterator();
				 
				while(subIt.hasNext()) {
					
					Map.Entry subE = (Map.Entry)subIt.next();
					
					String telNo = (String)subE.getKey();
					String name = (String)subE.getValue();
					System.out.println(name +" "+telNo);
				}
				
					System.out.println();
					
			}
				 
					
		}//printList()
			
		 
	}//class


