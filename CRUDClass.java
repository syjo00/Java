package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;





public class CRUDClass {
	
	 static Connection conn;
	 static PreparedStatement pstmt;
	 static ResultSet rs;
	 static Scanner sc = new Scanner(System.in);
	


	public static void main(String[] args) {
		
		
		Total total = new Total();
		
		total.loading();
		
		total.menu();
	

	}//main
	
}//CRUD Class

class Total  extends CRUDClass{
	
	public void loading() {
		
	
			//1.Driver loading
			String driver = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String account = "system";
			String pw = "1234";
		
			
			
			try {
				
				Class.forName(driver);
				System.out.println("드라이버로드 성공");
				
				
				try {
					
					conn = DriverManager.getConnection(url,account,pw);
					System.out.println("연결 성공했습니다.");
					
				} catch (Exception e) {
					System.out.println("연결 실패했습니다.");
				}
				
			
			}catch(Exception e) {
				
				System.out.println("드라이버 로드 실패");
			
			}	
			
		
	}//loading()
	
	
	public void menu() {
		
		System.out.println("이동할 메뉴 : 1:조회, 2: 데이터 추가, 3: 데이터 수정, 4: 데이터 삭제");
		
		
		int menu = sc.nextInt();	
		
		if(menu == 1) {
			select();
		}else if(menu == 2){
			insert();
		}else if(menu == 3){
			update();
		}else if(menu == 4) {
			delete();
		}else if(menu == 5) {
			exit();
		}

		
	}

	

	public void exit() {
		
		System.out.println("시스템 종료");
		System.exit(0);
		
	}


	public void update() {	
		
		
		System.out.println("업데이트할 이름을 입력하세요.");
		
		String name=sc.next();
		
		System.out.println("업데이트할 나이를 입력하세요.");
		
		int age = sc.nextInt();
		
		System.out.println("업데이트할 ID를 입력하세요.");
		
		int id= sc.nextInt();
		
		
		//sql 명령 실행
		try {
			
			String sql ="update member set name=?,age=? where id = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,name);
			pstmt.setInt(2,age);
			pstmt.setInt(3,id);
			
			pstmt.executeUpdate();
			
			System.out.println("데이터 업데이트를 성공했습니다.");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("데이터 업데이트를 실패했습니다.");
			
		}finally {
			
			if(pstmt!=null) {
				
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			
			if(conn!=null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}//finally
		
		loading();
		menu();
		
	}//update();
	

	public void delete() {
		
		System.out.println("삭제할 데이터의 id :");
		
		int id = sc.nextInt();
		
		try {
			
			String sql = "delete from member where id = ?";
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,id);
			
			pstmt.executeUpdate();
					
			System.out.println("데이터 삭제 성공");
			
		} catch (Exception e) {
			
			System.out.println("데이터 삭제 실패");
			
		}finally{
			
			if(conn!=null) {
				
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}//conn
			
			if(pstmt!=null) {
				
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}//pstmt
			
			
		}//finally
		
		
		loading();
		menu();
		
	}//delete()



	public void select() {
		

		//SQL 명령 실행
		try {
			
			String sql ="select * from member";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			System.out.println("조회가 성공하였습니다.");
			
		}catch(Exception e){
			
			System.out.println("조회가 실패하였습니다.");
			
		}
		
		//3.조회명령 결과 확인
		System.out.println("============================================");
		System.out.println("ID\tNAME\tAGE");
		System.out.println("============================================");

		
		try {
			
			while(rs.next()) {
				
				//테이블 생성 시 컬럼 데이터
			int id = rs.getInt("id");
		    String name = rs.getString("name");
			int	 age = rs.getInt("age");	
				 
				 System.out.println(id +"\t"+name+"\t"+age);
				
			}
			
		System.out.println("============================================");
			
		} catch (SQLException e) {
			
			e.printStackTrace();			
			
		}
		
		
		loading();
		menu();
		
	}//select()
	
	
	public void insert() {
		
		System.out.println("ID를 입력하세요.");
		
		int id= sc.nextInt();
		
		System.out.println("이름을 입력하세요.");
		
		String name=sc.next();
		
		System.out.println("나이를 입력하세요.");
		
		int age = sc.nextInt();
		
		
		// SQL 명령 실행
		
				try {
					
					String sql ="insert into member values(?,?,?)";
					
					pstmt = conn.prepareStatement(sql);
					
					
					//첫번째 ?
					pstmt.setInt(1,id);
					
					//두번째 ?
					pstmt.setString(2,name);
					
					//세번째 ?
					pstmt.setInt(3,age);
					
					pstmt.executeUpdate();
					
					System.out.println("데이터 추가가 성공하였습니다.");
					
				}catch(Exception e){
					
					e.printStackTrace();
					System.out.println("데이터 추가가 실패하였습니다.");
					
				}finally {
					
					if(pstmt!=null) {
						
						try {
							pstmt.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					}//pstmt 끝
					
					
					if(conn!=null) {
						
						try {
							
							conn.close();
							
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					}
					
					
				}//finally끝
				
				
				loading();
				menu();
						
	}//insert() 끝
	
	
	
}//Total Class
