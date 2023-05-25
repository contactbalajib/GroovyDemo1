import java.sql.*;
import groovy.sql.Sql
import java.sql.DriverManager






@GrabConfig(systemClassLoader=true)
@Grab(group='mysql', module='mysql-connector-java', version='8.0.13')
//@Grab(group='mysql', module='mysql-connector-java', version='5.1.6')






class DatabaseDemo1 {
   static void main(String[] args) {
	   Class.forName('com.mysql.cj.jdbc.Driver')
	   
	  // Creating a connection to the database
	  def sql = Sql.newInstance('jdbc:mysql://localhost:3306/test', 'balaji', 'Kavin10!', 'com.mysql.cj.jdbc.Driver')
	   //def sql = Sql.newInstance('jdbc:mysql://localhost:3306/test', 'com.mysql.jdbc.Driver')
			
	  // Executing the query SELECT VERSION which gets the version of the database
	  // Also using the eachROW method to fetch the result from the database
   
	  sql.eachRow('SELECT VERSION()'){ row ->
		 println row[0]
	  }
		
	  sql.close()
   }
}
