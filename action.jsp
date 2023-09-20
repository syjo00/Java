<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<!DOCTYPE html>
<html>
<style>
	h2{		
		text-align:center	
	}

</style>

<head>
    <meta charset="UTF-8">
    <title>검색 결과</title>
</head>
<body>
    <h2>Book Information List Search</h2>
    <table width="800" border="1" align="center">
        <tr align="center">
            <td width="100">ISBN</td>
            <td width="100">Title</td>
            <td width="100">Author</td>
            <td width="100">Publisher</td>
            <td width="100">Price</td>
            <td width="100">Category</td>
            <td width="100">Description</td>
        </tr>
        <%
            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            try {
                String driver = "oracle.jdbc.OracleDriver";
                String url = "jdbc:oracle:thin:@localhost:1521:xe";
                String dbId = "master";
                String dbPass = "1234";

                Class.forName(driver);
                conn = DriverManager.getConnection(url, dbId, dbPass);

                String searchType = request.getParameter("searchType");
                String searchValue = request.getParameter("searchValue");
	
              //조건문
              if(searchType.equals("title")){
            	  
            	  String sql = "SELECT * FROM books_info WHERE " + searchType + " LIKE ? ";
                  pstmt = conn.prepareStatement(sql);
                  pstmt.setString(1,"%"+searchValue+"%");
                  rs = pstmt.executeQuery();
            	  
              }
            
             else if(searchType.equals("author")){
            	  
            	  String sql = "SELECT * FROM books_info WHERE " + searchType + " LIKE ? ";
                  pstmt = conn.prepareStatement(sql);
                  pstmt.setString(1,"%"+searchValue+"%");
                  rs = pstmt.executeQuery();
            	  
              }
                
                while (rs.next()) {
                    String isbn = rs.getString("isbn");
                    String title = rs.getString("title");
                    String author = rs.getString("author");
                    String publisher = rs.getString("publisher");                    
                    String price = rs.getString("price");                   
                    String category = rs.getString("category");
                    String description = rs.getString("description");
        
               
        
        %>
        
        <tr align="center">
            <td width="80"><%= isbn %></td>
            <td width="80"><%= title %></td>
            <td width="80"><%= author %></td> 
            <td width="80"><%= publisher %></td>
            <td width="80"><%= price %></td>                     
            <td width="100"><%= category %></td>
            <td width="100"><%= description %></td>
        </tr>
        <%
                } // while
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException sqle) {
                    }
                }

                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException sqle) {
                    }
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException sqle) {
                    }
                }
            }
        %>
    </table>
</body>
</html>
