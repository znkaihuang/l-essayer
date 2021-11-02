//
// DATABASE: l_essayer
// CREATE TABLE IndexTable (
//	word VARCHAR(50) NOT NULL, 
//  type VARCHAR(10) NOT NULL,
//  lable VARCHAR(30),
//  generate_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
// ) 

package lessayer.database;

import java.sql.*;

public class SQLDatabase {
	
	public SQLDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		      Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/l_essayer",
		    		  "zkhuang", "!Ohmygod123");
            System.out.println("Connected");
            Statement stat = conn.createStatement();
            
            // Insert data
            // int num = stat.executeUpdate("insert into IndexTable (word, type) values ('chien', 'noun');");
            
            // Search data and print the search result
            // ResultSet resultSet = stat.executeQuery("Select * From IndexTable");
            //
            // while (resultSet.next()) {
            //    String word =  resultSet.getString("word");
            //    String type =  resultSet.getString("type");
            //    String label =  resultSet.getString("label");
            //    Date generate_date =  resultSet.getDate("generate_date");
            //  
            //	System.out.println("================================");
            //	System.out.println(word);
            //	System.out.println(type);
            //  System.out.println(label);
            //  System.out.println(generate_date);
            //  System.out.println("================================");
            // }
            
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
