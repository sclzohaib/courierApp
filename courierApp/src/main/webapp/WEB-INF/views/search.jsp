<%@page import="java.sql.*"%>
	<%	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.13:1521:xe", "COURIER",
			"oracle");
	Statement stmt = conn.createStatement();
	
	String action=request.getParameter("action").toString();
	if(action.equals("origin")){
		String consultant = request.getParameter("info").toString();
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
	else if(action.equals("cnsg")){		
			try {
				String consultant = request.getParameter("info").toString();
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
	else if(action.equals("service")){		
		try {
			String product = request.getParameter("product").toString();
			String service = request.getParameter("service").toString();
			String payment = request.getParameter("payment").toString();
	ResultSet rs = stmt.executeQuery(
			"select charges from cs_rate_card where pay_id = '"
					+ payment + "'" + " and prod_id ='" + product + "'"+ " service_code ='" + service + "'");
	while (rs.next()) {
		String charges=rs.getString(1);
		out.println("");
		out.println(charges);
		System.out.println("result  "+charges);
	}
	} catch (Exception e) {
		System.out.println(e);
	}
}
	%>