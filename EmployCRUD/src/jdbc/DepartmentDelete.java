package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentDelete {
	public static void main(String[] args) {
	int deptno;
	System.out.println("enter deptno");
	Scanner sc=new Scanner(System.in);
	deptno=sc.nextInt();
	String cmd="delete from department where deptno=?";
	Connection con=DaoConnection.getConnection();
	try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, deptno);
		pst.executeUpdate();
		System.out.println("record deleated");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
