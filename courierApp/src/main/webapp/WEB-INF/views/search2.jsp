<%@page import="java.sql.*"%>
	<%
		String consultant = request.getParameter("info").toString();
	System.out.println(consultant);
			try {
		System.out.println(consultant);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.13:1521:xe", "COURIER",
				"oracle");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(
				"select shipperphone,shippername,shippercompany,shipperaddress from new_book_info where shipperphone = '"
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
			System.out.println(phone+name+company+address);
		}
		} catch (Exception e) {
			System.out.println(e);
		}
	%>