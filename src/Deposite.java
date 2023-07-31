import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Deposite {

	public static void makeDeposite() {
		String bank = homePage.cBoxbanks.getSelectedItem().toString();
		 String cardNum = homePage.cardNumber.getText();
		  String cvv = homePage.CVV.getText();
		   String amount = homePage.depositAmount.getText();
		
		    try {
			
		       Connection connection =  connector.getConnection();  
		  	 //Preapared Statement
                PreparedStatement Pstatement=connection.prepareStatement("SELECT CVV,AMOUNT,CARDOWNER FROM BANK WHERE BRANCH=? AND CARDNUMBER=? AND CVV=?");
            
                //Specifying the values of it's parameter
              Pstatement.setString(1,bank);
               Pstatement.setString(2,cardNum);
                  Pstatement.setString(3,cvv);
                    ResultSet result = Pstatement.executeQuery();
           
            //Checking for the Password match
            if(result.next())
              {
                //Executing query
                 double x = result.getDouble("AMOUNT");
                  double z = Double.parseDouble(amount);
                     if(x>=z){
                	   operator.deposit(z);
                	    operator.updatebanks(x-z, cvv);
                	
                	}
                     else  JOptionPane.showMessageDialog(null,"NOT ENOUGH AMOUNT ");
                 }
               else
            {
                JOptionPane.showMessageDialog(null,"INVALID CARD ");
            }

        } catch (SQLException e1) {
            e1.printStackTrace();
        }


	}
}
