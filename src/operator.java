import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class operator {

   // return variable needs to be resolved
   public static boolean isLogin(String _email, String passwrd) {

      try {

         // Creating Connection Object
         Connection connection = connector.getConnection();

         // Preapared Statement
         PreparedStatement Pstatement = connection.prepareStatement(
               "SELECT NAME,FATHERNAME,PASSWRD,BALANCE,EMAIL  FROM customer WHERE EMAIL=? AND PASSWRD=?");
         // Specifying the values of it's parameter
         Pstatement.setString(1, _email);
         Pstatement.setString(2, passwrd);

         ResultSet result = Pstatement.executeQuery();

         // Checking for the Password match

         while (result.next()) {

            LoginSession.userName = result.getString("NAME");
            LoginSession.fatherName = result.getString("FATHERNAME");
            LoginSession.balance = result.getDouble("BALANCE");
            LoginSession.useremail = result.getString("EMAIL");
            LoginSession.userpass = result.getString("PASSWRD");

            return true;
         }

      } catch (SQLException e1) {
         e1.printStackTrace();
      }
      return false;
   }

   // method for transactions
   public static double differenceOF(double x, double y) {

      double difference = x - y;
      return difference;
   }

   // can add
   public static double addOF(double x, double y) {

      double rslt = x + y;
      return rslt;
   }

   public void dispose() {
      // Clearing Fields
   }

   // Deposite method
   public static void deposit(double a) {

      try {
         double d = LoginSession.balance + a;
         String updatBal = Double.toString(d);

         // Creating Connection Object
         Connection connection = connector.getConnection();

         // update recievers balance
         PreparedStatement Pstattment = connection.prepareStatement("update customer set BALANCE=?" + "where EMAIL=? ");
         Pstattment.setString(2, LoginSession.useremail);
         Pstattment.setString(1, updatBal);

         Pstattment.executeUpdate();
         JOptionPane.showMessageDialog(null, " DEPOSIT SUCCESFUL!!");

      } catch (SQLException e1) {
         e1.printStackTrace();
      }
   }

   // password changer
   public static void passChanger(String a, String b) {
      try {

         // Creating Connection Object
         Connection connection = connector.getConnection();

         // update recievers balance
         PreparedStatement Pstattment = connection.prepareStatement("update customer set PASSWRD=?" + "where EMAIL=? ");
         Pstattment.setString(2, b);
         Pstattment.setString(1, a);

         Pstattment.executeUpdate();
         JOptionPane.showMessageDialog(null, " Password Changed!");

      } catch (SQLException e1) {
         e1.printStackTrace();
      }
   }

   // sender and reciever account balance updated
   public static void updateStatus(double a, String b) {
      try {

         String updateBal = Double.toString(a);

         // Creating Connection Object
         Connection connection = connector.getConnection();

         // Preapared Statement
         PreparedStatement Pstatement = connection
               .prepareStatement("SELECT NAME,PASSWRD,BALANCE,EMAIL  FROM customer WHERE EMAIL=?");

         // Specifying the values of it's parameter
         Pstatement.setString(1, b);
         ResultSet result = Pstatement.executeQuery();

         if (result.next()) {
            // update recievers balance
            PreparedStatement Pstattment = connection
                  .prepareStatement("update customer set BALANCE=?" + "where EMAIL=? ");
            Pstattment.setString(1, updateBal);
            Pstattment.setString(2, b);

            Pstattment.executeUpdate();
            JOptionPane.showMessageDialog(null, " balance checked operation secessful");

         }
      } catch (SQLException e1) {
         e1.printStackTrace();
      }
   }

   //
   public static void updatebanks(double a, String b) {

      try {
         String updateBal = Double.toString(a);

         // Creating Connection Object
         Connection connection = connector.getConnection();

         // Preapared Statement
         PreparedStatement Pstatement = connection.prepareStatement("SELECT AMOUNT  FROM bank WHERE CVV=?");

         // Specifying the values of it's parameter
         Pstatement.setString(1, b);

         ResultSet result = Pstatement.executeQuery();

         if (result.next()) {
            // update recievers balance
            PreparedStatement Pstattment = connection.prepareStatement("update bank set amount=?" + "where cvv=? ");
            Pstattment.setString(1, updateBal);
            Pstattment.setString(2, b);

            Pstattment.executeUpdate();
            JOptionPane.showMessageDialog(null, " balance checked operation secessful");

         }
      } catch (SQLException e1) {
         e1.printStackTrace();
      }
   }
}
