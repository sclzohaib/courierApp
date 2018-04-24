<%@ page import="java.sql.*"%>

<%
	String s = request.getParameter("val");
	if (s == null || s.trim().equals("")) {
		out.print("Please enter id");
	} else {
		int id = Integer.parseInt(s);
		out.print(id);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.17:1521:xe", "COURIER",
					"oracle");
			PreparedStatement ps = con.prepareStatement("select * from emp1 where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				out.print(rs.getInt(1) + " " + rs.getString(2));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
%>