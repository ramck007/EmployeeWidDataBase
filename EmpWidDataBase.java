import java.util.*;

//import java.io.Serializable;
import java.sql.*;

public class EmpWidDataBase {

	public static void main(String[] args) throws SQLException {
		
		//employee e[]=new employee[2];
		System.out.println("Enter the Employee details");
		Scanner sc= new Scanner(System.in);
		int id; String name,location; long number;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");
			Statement smt = con.createStatement();
			System.out.println("Enter Y to Start");
			char ch=sc.next().charAt(0);
			EmpWidDataBase empd = new EmpWidDataBase(); 
			if(ch=='y'||ch=='Y') {
				System.out.println("1.Select all \n 2.Insert \n 3.Update \n 4.Delete");
				int n=sc.nextInt();
				while(n!=0) {
					if(n<=4) {
				switch(n) {
				case 1:	String sql1 = "select * from emp;";
						ResultSet rs= smt.executeQuery(sql1);
						while(rs.next()) {
							System.out.println("Employee id       : "+rs.getInt(1)+"\nEmployee Name     : "+rs.getString(2)+"\nEmployee Number   : "+rs.getLong(3)+"\nEmployee Location : "+rs.getString(4));
							System.out.println();
						}
						break;
				case 2: System.out.println("Enter the Employee ID"); 
				  		id = sc.nextInt();
				  		System.out.println("Enter the Employee Name"); 
				  		name= sc.nextLine();
				  		sc.nextLine();
				  		System.out.println("Enter the Employee Number");
				  		number = sc.nextLong();
				  		System.out.println("Enter the Employee Location"); 
				  		location= sc.next();
				  		String sql = "insert into emp values(?,?,?,?);"; 
				  		PreparedStatement stmt = con.prepareStatement(sql); 
				  		stmt.setInt(1,id);
				  		stmt.setString(2, name);
				  		stmt.setLong(3, number); 
				  		stmt.setString(4, location);
				  		stmt.execute();
				  		break;
				default: System.out.println("Enter values between 1 to 2");break;
				
				}
				}
					else {
						System.out.println("Enter between 1 to 4");
					}
					System.out.println("Enter the Key");
					 n=sc.nextInt();
					 if(n>4) {
						 break;
					 }
			}}
			else {
					System.out.println("OOPS Wrong Press");
				}
			
				
				con.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		/*	for(int i=0;i<3;i++) {
			  System.out.println("Enter the Employee ID"); 
			  id = sc.nextInt();
			  System.out.println("Enter the Employee Name"); 
			  name= sc.next();
			  System.out.println("Enter the Employee Number");
			  number = sc.nextLong();
			  System.out.println("Enter the Employee Location"); 
			  location= sc.next();
			  String sql = "insert into emp values(?,?,?,?);"; 
			  PreparedStatement stmt = con.prepareStatement(sql); 
			  stmt.setInt(1,id);
			  stmt.setString(2, name);
			  stmt.setLong(3, number); 
			  stmt.setString(4, location);
			  stmt.execute();
			}
			 System.out.println("Enter the id to get the Employee Details");
			 int k= sc.nextInt(); 
		//int i = 2;
		String sql1 = "select * from emp where id =";
		String sql2 = sql1+k+";";*/
		/*
		 * String sql1 = "select * from emp;"; ResultSet rs= smt.executeQuery(sql1);
		 * while(rs.next()) { System.out.println("Employee id       : "+rs.getInt(1)
		 * +"\nEmployee Name     : "+rs.getString(2)+"\nEmployee Number   : "+rs.getLong
		 * (3)+"\nEmployee Location : "+rs.getString(4)); System.out.println(); }
		 */
		
	//	System.out.println("Executed");
			
			
			
		/*
		 * //ResultSet rs=smt.executeQuery("Create Database sample"); // ResultSet
		 * rs=smt.executeQuery("select * from samp1"); while(rs.next()) {
		 * System.out.println(rs.getInt(1)+" "+rs.getInt(2)); }
		 */
			
			
		

		/*for(int i=0;i<2;i++) {
			System.out.println("Enter the Employee ID");
			id = sc.nextInt();
			System.out.println("Enter the Employee Name");
			name= sc.next();
			System.out.println("Enter the Employee Number");
			number = sc.nextLong();
			System.out.println("Enter the Employee Location");
			location= sc.next();
			System.out.println("");*/
			
		//	e[i]=new employee(id,name,number,location);
		
		//}
		
		
		
		/*
		 * ObjectInputStream inputStream = new ObjectInputStream(new
		 * FileInputStream("empfile")); Object obj=null;
		 * 
		 * while((obj=inputStream.readObject()) instanceof endoffile==false ) {
		 * System.out.println("Employee id       : "+((employee)obj).id);
		 * System.out.println("Employee Name     : "+((employee)obj).name);
		 * System.out.println("Employee Number   : "+((employee)obj).number);
		 * System.out.println("Employee Location : "+((employee)obj).location);
		 * System.out.println(""); }
		 */
	}
}

