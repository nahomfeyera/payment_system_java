import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class balanceRequest {
 
	public static void  setBalance()
 {      
	 String passwrd =LoginSession.userpass;  
	 String _email = LoginSession.useremail;
	 try {
         
		 //Creating Connection Object
         Connection connection =  connector.getConnection();  
         //Preapared Statement
         PreparedStatement Pstatement=connection.prepareStatement("SELECT BALANCE FROM customer WHERE EMAIL=? AND PASSWRD=?");
         //Specifying the values of it's parameter
         Pstatement.setString(1,_email);
         Pstatement.setString(2,passwrd);         
        
         ResultSet result = Pstatement.executeQuery();
         
         //Checking for the Password match
          
         	while(result.next()){
                 LoginSession.balance = result.getDouble("BALANCE");
         	}  	
   
 }    catch (SQLException e1) {
     e1.printStackTrace(); 
  }  
 }
}
