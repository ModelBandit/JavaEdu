package DBTest;

//import java.io.*;
import java.sql.*;
//import java.sql.CallableStatement;

public class BookList {
	Connection con;

	public BookList() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String pwd = "tiger";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 콘솔에서 로드시 jar 라이브러리 문제로 터짐
			//java -cp bin;C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6_g.jar DBTest/BookList
			
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("데이터베이스 연결 준비 ...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void sqlRun() {
		String query = "SELECT * FROM Book";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("bNO \tbNAME \t Publisher\tPrice");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getInt(4) + "\t");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookList bl = new BookList();
		bl.sqlRun();
	}

}
