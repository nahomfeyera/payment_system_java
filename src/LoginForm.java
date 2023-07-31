
import javax.swing.*;



import java.awt.event.*;
import java.awt.*;

 
public class LoginForm implements ActionListener {
    JFrame frame;
   
    JLabel nameLabel=new JLabel("WELCOME"); 
    JLabel passwordLabel=new JLabel("PASSWORD :");
    JLabel emailLabel=new JLabel("EMAIL :");
    JTextField nameTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JTextField emailTextField=new JTextField();
    JButton registerButton=new JButton("REGISTER");
    JButton resetButton=new JButton("RESET");
    JButton loginButton=new JButton("LOGIN");
    
    JLabel back_ground =new JLabel();
    ImageIcon backgr = new ImageIcon(getClass().getResource("images/bg5.jpg"));
 
 
    LoginForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Login Form");
        frame.setBounds(40,60,400,450);
        frame.getContentPane().setBackground(Color.white);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    public void setLocationAndSize()
    {
        nameLabel.setBounds(180,20,60,100);
        passwordLabel.setBounds(20,110,100,70);
        emailLabel.setBounds(20,80,100,70);
        passwordField.setBounds(130,140,200,23);
        emailTextField.setBounds(130,108,200,23);
        loginButton.setBounds(100,200,100,25);
        loginButton.setBackground(Color.red);
        registerButton.setBounds(240,200,100,25);
        registerButton.setBackground(Color.orange);
        resetButton.setBounds(140,240,150,25);
        resetButton.setBackground(Color.white);
        
         back_ground.setBounds(0,0,400,450);
         back_ground.setIcon(backgr);
    }
    public void addComponentsToFrame()
    {    
    	
        frame.add(nameLabel);
        frame.add(passwordLabel);
        frame.add(emailLabel);
        frame.add(nameTextField);
        frame.add(passwordField);
        frame.add(emailTextField);
        frame.add(loginButton);
        frame.add(registerButton);
        frame.add(resetButton);
        frame.add(back_ground);
    }
    public void actionEvent()
    {
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        loginButton.addActionListener(this);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton)
        {   

@SuppressWarnings("deprecation")
boolean yes=operator.isLogin(emailTextField.getText(),passwordField.getText());
  if(yes)
  {  
      //Executing query
  	frame.setVisible(false);
  	new homePage(); 
  }
 else
  {
      JOptionPane.showMessageDialog(null,"Username or password did not match");
  }
 
 
        }
        if(e.getSource()==resetButton)
        {
            //Clearing Fields
           
            passwordField.setText("");
          
            emailTextField.setText("");
        } 
        if(e.getSource()==registerButton)
        {
            //go to registration
              frame.setVisible(false);
        	 new RegistrationForm();
        }
 
    }
}

