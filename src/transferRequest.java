import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class transferRequest {
	
	           static String recieverAddress = homePage.accTextFieldt.getText();
	           static String Tamount = homePage.amountField.getText();


	public static void transfer() {

		 try {  
	     		
             Connection connection =  connector.getConnection();  
             //Preapared Statement -- get recievers detail 
             PreparedStatement Pstatement=connection.prepareStatement("SELECT NAME,BALANCE,EMAIL  FROM customer WHERE EMAIL=? ");
            
             //Specifying the values of it's parameter
             Pstatement.setString(1,recieverAddress);
             ResultSet result = Pstatement.executeQuery();
    	        if(result.next()) 
    	             {    double userBalance=  LoginSession.balance;
    	         	       double recieverBalance = result.getDouble("BALANCE"); 
    	                     double amount= Double.parseDouble(Tamount);
    	                      
    	       // update user balance 
    	                     double g = operator.differenceOF(userBalance,amount);
    	                     operator.updateStatus(g,LoginSession.useremail);
    	                  
    	    
    	           // update recievers balance
                       double newBalance = operator.addOF(recieverBalance,amount);
    	                 operator.updateStatus( newBalance,result.getString("EMAIL"));
             
           
    	 }
    	 else                  
    		 JOptionPane.showMessageDialog(null,"Something went wrong! Operation Failed");
    	 } catch (SQLException e1) {
              e1.printStackTrace(); 
              } 
		
	}

}
