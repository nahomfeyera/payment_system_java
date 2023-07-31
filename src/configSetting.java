import javax.swing.JOptionPane;

public class configSetting {
	
	static String oldP = homePage.oldPassField.getText();
	static String nwP = homePage.newPassField.getText();
	static String confirmP = homePage.confirmPassField.getText();
	
public static void changePassword() {
	
	if(nwP.equals(confirmP)) {  
		if(LoginSession.userpass.equals(oldP)) {
		  operator.passChanger(confirmP,LoginSession.useremail); } 
		else { JOptionPane.showMessageDialog(null,"PLEASE  ENTER YOUR CURRENT PASSWORD CORRECTLY!"); }
		
	} 
	else {
		JOptionPane.showMessageDialog(null,"PASSWORD DID NOT MATCH! TRY AGAIN");
		
	}
}
}
