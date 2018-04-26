<%@page import="java.sql.*"%>
	<%	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.13:1521:xe", "COURIER",
			"oracle");
	Statement stmt = conn.createStatement();
	
	String consultant = request.getParameter("info").toString();
	String action=request.getParameter("action").toString();
	if(action.equals("origin")){
		try {
			ResultSet rs = stmt.executeQuery(
					"select DESCRIPTION from CS_CITY where CITY_NO = '"
							+ consultant + "'");
			while (rs.next()) {
				String city=rs.getString(1);
				out.println("");
				out.println(city);
				System.out.println("result  "+city);
			}
			} catch (Exception e) {
				System.out.println(e);
			}
		
	}
	else{
			try {
		ResultSet rs = stmt.executeQuery(
				"select CNSGPHONE,CNSGNAME,CNSGCOMPANY,CNSGADDRESS from new_book_info where CNSGPHONE = '"
						+ consultant + "'");
		while (rs.next()) {
			String phone=rs.getString(1);
			String name=rs.getString(2);
			String company=rs.getString(3);
			String address=rs.getString(4);	
			out.println("");
			out.println(name);
			out.println(company);
			out.println(address);
			out.println(phone);
			System.out.println("result  "+phone+name+company+address);
		}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	%>