

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.awt.*;

 
public class homePage implements ActionListener {
    JFrame frame;
   
    JLabel accountsLabel=new JLabel("CHOOSE ACCOUNT :"); 
    JLabel passwordLabel=new JLabel("PASSWORD");
    JLabel recemailLabel=new JLabel("RECEIVER'S EMAIL :");
    JLabel amount=new JLabel("ENTER AMOUNT :");
    JLabel banksLabel=new JLabel("CHOOSE ACOUNT");
    JLabel lblbanks=new JLabel("CHOOSE  ACOUNT :");
    JLabel banksLbl=new JLabel("CHOOSE ACOUNT :");
    JLabel aboutlbl=new JLabel(" AAIT SCHOOL OF ELECTRICAL AND COMPUTER ENGINEERING\n"
    		+ "OBJECT ORIENTED PROGRAMING WITH JAVA PROJECT\n"
    		+ "BY DANIEL MESFIN, NAHOM FEYERA AND EDOM KELBESA");
    
    
    JLabel transferAmount=new JLabel("T--AMOUNT :");
    // for settings 
    JLabel changePass=new JLabel("CHANGE PASSWORD ");
    JLabel lblChangepass=new JLabel("OLD PASSWORD");
    JLabel lblNewPass=new JLabel("NEW PASSWORD:");
    JLabel confirmPass=new JLabel("CONFIRM PASSWORD: ");

    static JTextField oldPassField=new JTextField();   
    static JTextField newPassField=new JTextField();
    static JTextField confirmPassField=new JTextField();
    JButton changeButton=new JButton("CHANGE");
    JButton resetBtn=new JButton("RESET");
    
   
    
    static String[] Banks={"Commercial Bank Of Ethiopia","Dashen Bank","Awash","Zemen Bank","Nib Bank","Enat Bank"};
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	JComboBox banksComboBox=new JComboBox(Banks);
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	static JComboBox   cBoxbanks=new JComboBox(Banks);
    
    JLabel yourBalance=new JLabel("YOUR BALANCE IS : ");
    JLabel balanceField=new JLabel();
    
    JLabel deposit = new JLabel("DEPOSITE");
    JLabel transfer = new JLabel("TRANSFER");
    JLabel settings = new JLabel("SETTING");
    JLabel balance= new JLabel("BALANCE");
    JLabel services= new JLabel("SERVICES");
    
    JLabel logo= new JLabel("YEGNA");
    JLabel home= new JLabel("HOME");
    JLabel addAccount= new JLabel("ADD BANK ACCOUNT");
    JLabel aboutSection= new JLabel("ABOUT");
    JButton logout=new JButton("LOG OUT");
    
    
    JButton deposite=new JButton("DEPOSITE");
    JButton sendMoney=new JButton("SEND MONEY");
    JButton service=new JButton("SERVICE PAYMENT");
    JButton finish=new JButton("ADD++");
   
    
    
    JTextField accTextField=new JTextField();
    static JTextField accTextFieldt=new JTextField();
    static JTextField amountField=new JTextField();
    static JTextField depositAmount=new JTextField();
    JTextField emailTextField= new JTextField();
    
    static JTextField cardNumber=new JTextField();
    static JTextField CVV=new JTextField();
    JLabel cvvLabel = new JLabel("CVV");
    JLabel cardNumLabel = new JLabel("CARD NUMBER");
    
    JButton depositeButton=new JButton("Deposite");
    JButton resetButton=new JButton("Reset");
    JButton transferButton=new JButton("Transfer");
    
    JPanel controlPanel = new JPanel();
    JPanel dashboard = new JPanel();
    JPanel aboutpanel = new JPanel();
    JPanel depo = new JPanel();
    JPanel trans = new JPanel();
    JPanel balanc = new JPanel();
    JPanel serv = new JPanel();
    JPanel sett = new JPanel();
    JPanel board = new JPanel();
    
    
    JLabel back_ground =new JLabel();
    ImageIcon backgr = new ImageIcon(getClass().getResource("images/bg1.jpg"));
 
    
    // icons 
    ImageIcon icon = new ImageIcon(getClass().getResource("images/deposi.png"));
    ImageIcon icont = new ImageIcon(getClass().getResource("images/send-money.png"));
    ImageIcon icons = new ImageIcon(getClass().getResource("images/setprivec.png"));
    ImageIcon iconb = new ImageIcon(getClass().getResource("images/balance.png"));
    ImageIcon icona = new ImageIcon(getClass().getResource("images/services.png"));
    ImageIcon _logo = new ImageIcon(getClass().getResource("images/profilee.png"));
    //FONTS
    Font f=new Font("Tahoma", Font.BOLD, 15);
    // Border 
    Border blackline = BorderFactory.createLineBorder(Color.black);
   
    
    homePage()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();  
    }
    
    public void createWindow()
     
    {
        frame=new JFrame();
        frame.setTitle("YEGNA PAYMENT");
        frame.setBounds(80, 50, 900, 600);
        frame.getContentPane().setBackground(Color.white);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        
    }
    
    public void setLocationAndSize()
    {   // deposite
        banksLabel.setBounds(80,60,120,50);
        lblbanks.setBounds(80,50,150,50);
        accountsLabel.setBounds(80,90,120,50);
        amount.setBounds(80,200,140,50);
        depositeButton.setBounds(140,300,100,30);
        depositAmount.setBounds(200,210,200,28);
        passwordLabel.setBounds(300,80,100,30);
        cBoxbanks.setBounds(200,100,200,30);
       
        cardNumLabel.setBounds(80,120,120,50);
        cvvLabel.setBounds(80,160,120,50);
        CVV.setBorder(blackline);
        CVV.setBounds(200,170,200,30);
        cardNumber.setBounds(200,130,200,30);
       
        
        yourBalance.setBounds(60,170,120,50);
        balanceField.setBounds(180,175,120,30);
        
        
        logo.setBounds(0,70,250,80);
        logo.setIcon(_logo);
        logo.setVerticalTextPosition(JLabel.BOTTOM);
        logo.setHorizontalTextPosition(JLabel.CENTER);
        logo.setFont(f);
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        logo.setLayout(null);
        
        home.setBounds(0,170,250,40);
        home.setHorizontalTextPosition(JLabel.CENTER);
        home.setVerticalTextPosition(JLabel.BOTTOM);
        home.setForeground(Color.red);
        home.setBorder(blackline);
        home.setFont(new Font("Source Sans Pro Light", Font.BOLD, 18));
        home.setHorizontalAlignment(SwingConstants.CENTER);
        home.setLayout(null);
        
        aboutlbl.setBounds(80,10,600,500);
        aboutlbl.setForeground(Color.black);
        aboutlbl.setHorizontalAlignment(SwingConstants.CENTER);
     
        aboutlbl.setLayout(null);
        
        aboutSection.setBounds(0,210,250,40);
        aboutSection.setHorizontalTextPosition(JLabel.CENTER);
        aboutSection.setVerticalTextPosition(JLabel.BOTTOM);
        aboutSection.setForeground(Color.red);
        aboutSection.setBorder(blackline);
        aboutSection.setFont(new Font("Source Sans Pro Light", Font.BOLD, 18));
        aboutSection.setHorizontalAlignment(SwingConstants.CENTER);
        aboutSection.setLayout(null);
        
        addAccount.setBounds(0,190,200,40);
        addAccount.setHorizontalTextPosition(JLabel.CENTER);
        addAccount.setVerticalTextPosition(JLabel.BOTTOM);
        addAccount.setForeground(Color.red);
        addAccount.setBorder(UIManager.getBorder("DesktopIcon.border"));
        addAccount.setLayout(null); 
        
        logout.setBounds(0,500,180,50);
        logout.setHorizontalTextPosition(JLabel.CENTER);
        logout.setVerticalTextPosition(JLabel.BOTTOM);
        logout.setForeground(Color.red);
        logout.setBorder(blackline);
        logout.setLayout(null);
        //setting components
        changePass.setBounds(60,80,200,50);
        changePass.setFont(new Font("Source Sans Pro Light", Font.BOLD, 18));
        
        lblChangepass.setBounds(80,160,120,50);
        lblNewPass.setBounds(80,190,120,50);
        confirmPass.setBounds(80,220,150,50);
        
        oldPassField.setBounds(230,170,200,28);
        newPassField.setBounds(230,200,200,28);
        confirmPassField.setBounds(230,230,200,28);
        changeButton.setBounds(200,300,110,30);
        resetBtn.setBounds(320,300,110,30);
        
        // containers
        dashboard.setBounds(0, 0, 250, 650);
        dashboard.setBackground(Color.black);      
        dashboard.setLayout(null);
        back_ground.setBounds(0,60,400,800);
        back_ground.setIcon(backgr);
        
        board.setLayout(null);
        board.setBounds(200, 0, 800, 60);
        board.setBackground(Color.black);

        depo.setBounds(200, 40, 700,400);
        depo.setBackground(Color.white);
        depo.setLayout(null);
       
        trans.setBounds(200, 0, 600,600);
        trans.setBackground(Color.white);
        balanc.setBounds(200, 0, 600,600);
        balanc.setBackground(Color.white);  
        serv.setBounds(200, 0, 600,600);
        serv.setBackground(Color.white);
        sett.setBounds(200, 0, 600,600);
        sett.setLayout(null);
        sett.setBackground(Color.white);

        controlPanel.setBounds(250, 60, 800,600);
        controlPanel.setBackground(Color.white); 
        controlPanel.setLayout(null);
        aboutpanel.setBounds(200, 40, 600,500);
        aboutpanel.setBackground(Color.white);   
        aboutpanel.setLayout(null);
     
        accTextFieldt.setBounds(200,180,165,23);
        amountField.setBounds(200,220,165,23);
        emailTextField.setBounds(200,140,165,23);
      
        // transfer 
        recemailLabel.setBounds(80,170,120,30);
        transferAmount.setBounds(80,210,120,30);
        transferButton.setBounds(140,300,100,25);
        resetButton.setBounds(280,300,100,25);
         
        deposit.setBounds(44, 70, 120,110);
        deposit.setBackground(Color.white);
        deposit.setBorder(blackline);
        deposit.setIcon(icon);
        deposit.setVerticalTextPosition(JLabel.BOTTOM);
        deposit.setHorizontalTextPosition(JLabel.CENTER);
        deposit.setFont(f);
               
        
        settings.setBounds(200,200,120,110);
        settings.setBorder(UIManager.getBorder("DesktopIcon.border"));
        settings.setIcon(icons);
        settings.setVerticalTextPosition(JLabel.BOTTOM);
        settings.setHorizontalTextPosition(JLabel.CENTER);
        settings.setFont(f);
        
        transfer.setBounds(200,70,120,110);
        transfer.setBorder(UIManager.getBorder("DesktopIcon.border"));
        transfer.setIcon(icont);
        transfer.setVerticalTextPosition(JLabel.BOTTOM);
        transfer.setHorizontalTextPosition(JLabel.CENTER);
        transfer.setFont(f);
        
        
       balance.setBounds(330,70,120,110);
       balance.setBorder(UIManager.getBorder("DesktopIcon.border"));
       balance.setIcon(iconb);
       balance.setVerticalTextPosition(JLabel.BOTTOM);
       balance.setHorizontalTextPosition(JLabel.CENTER);
       balance.setFont(f);
       
       services.setBounds(50,200,120,110);
       services.setBorder(UIManager.getBorder("DesktopIcon.border"));
       services.setIcon(icona);
       services.setVerticalTextPosition(JLabel.BOTTOM);
       services.setHorizontalTextPosition(JLabel.CENTER);
       services.setFont(f);
       
       // connect account
       banksComboBox.setBounds(200,80,165,23);
      
       finish.setBounds(220,200,120,40);
       finish.setBackground(Color.yellow); 
       
        
        //buttons
        deposite.setBounds(50,350,120,40);
        sendMoney.setBounds(200,350,120,40);
        service.setBounds(100,350,120,40);
       
     
    } 
    
    public void addComponentsToFrame()
    {
        
        
    	frame.add(board);
        frame.getContentPane().add(controlPanel); 
        frame.add(dashboard); 
        frame.add(aboutpanel);
        frame.add(trans);
        frame.add(sett);
        frame.add(serv);
        frame.add(depo);
        frame.add(balanc);
        
       
          // main control panel
        controlPanel.add(deposit);
        controlPanel.add(settings);
        controlPanel.add(transfer);
        controlPanel.add(balance);
        controlPanel.add(services);
       
        // dashboard 
        dashboard.add(logo);
        dashboard.add(home);
        dashboard.add(aboutSection);
        dashboard.add(logout);
        dashboard.add(back_ground);
       
       
     
        
    }     public void addComponentabout() {
    	aboutpanel.add(aboutlbl);   	
    }
          
    public void addComponentsett() {
	     
	       sett.add(changePass);   
	       sett.add(newPassField);
	       sett.add(oldPassField);
	       sett.add(confirmPassField   );
	       sett.add( resetBtn  );
	       sett.add(  changeButton  );
	    
	       sett.add( lblNewPass);
	       sett.add( confirmPass);
	       sett.add(lblChangepass);
}      
        // deposite panel
    public void addComponentsdepo() {
    	
        depo.setLayout(null);
        depo.add(cardNumber);
        depo.add(cvvLabel);
        depo.add(CVV);
        depo.add(cBoxbanks);
        depo.add(cardNumLabel);
        depo.add(accTextField);
        depo.add(depositAmount);
         depo.add(depositeButton);
         depo.add(amount);
         depo.add(accountsLabel);
         depo.add(resetButton);
    	
    }     
         // transfer
    public void addComponentstrans() {
    	
        trans.setLayout(null);
        trans.add(accTextFieldt);
        trans.add(amountField);
        trans.add(transferButton);
        trans.add(transferAmount);
        trans.add(recemailLabel);
        trans.add(resetButton);
    	
    }   // balance panel
    public void addComponentsbalanc() {
    	balanc.setLayout(null);
    	balanc.add(balanceField);
    	balanc.add(yourBalance);
    	String bal =Double.toString(LoginSession.balance); 
    	balanceField.setText(bal);
    }
       
    public void actionEvent()
    {
        transferButton.addActionListener(this);
        resetButton.addActionListener(this);
        depositeButton.addActionListener(this);
        changeButton.addActionListener(this);
        resetBtn.addActionListener(this);
       
       
      home.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {
 	     
      	controlPanel.setVisible(true); 
      	aboutpanel.setVisible(false);
      	serv.setVisible(false);
      	depo.setVisible(false);
    	sett.setVisible(false);
    	balanc.setVisible(false);
    	
      }
  	});  
      
      aboutSection.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {
    	  addComponentabout();
        	controlPanel.setVisible(false); 
        	aboutpanel.setVisible(true);
        	serv.setVisible(false);
        	depo.setVisible(false);
      	    sett.setVisible(false);
         	balanc.setVisible(false);
         	trans.setVisible(false);
        }
    	});
      
      
      
      deposit.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {
    	     addComponentsdepo();
         	 controlPanel.setVisible(false);
        	 depo.setVisible(true);
        	 trans.setVisible(false);
        	 serv.setVisible(false);
         	 sett.setVisible(false);
        	 balanc.setVisible(false);
        	 aboutpanel.setVisible(false);
		}
	});
        transfer.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) { 
        	addComponentstrans();
        	controlPanel.setVisible(false);
        	depo.setVisible(false);
        	trans.setVisible(true);
        	serv.setVisible(false);
        	sett.setVisible(false);
        	balanc.setVisible(false);
		}
	});
        services.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) { 
        	controlPanel.setVisible(false);
        	depo.setVisible(false);
        	trans.setVisible(false);
        	serv.setVisible(true);
        	sett.setVisible(false);
        	balanc.setVisible(false);
        	aboutpanel.setVisible(false);
		}
	}); 
        settings.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) { 
        	addComponentsett();
        	controlPanel.setVisible(false); 
        	depo.setVisible(false);
        	trans.setVisible(false);
        	serv.setVisible(false);
        	sett.setVisible(true);
        	balanc.setVisible(false);
        	aboutpanel.setVisible(false);
		}
	});
        balance.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) { 
		 balanceRequest.setBalance();
        	addComponentsbalanc();
		controlPanel.setVisible(false);
    	depo.setVisible(false);
    	trans.setVisible(false);
    	serv.setVisible(false);
    	sett.setVisible(false);
    	balanc.setVisible(true);
    	aboutpanel.setVisible(false);
	}
});
        
        
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==depositeButton)
        {    
            Deposite.makeDeposite();
        }   
        
        
        if(e.getSource()==resetButton)
        {
        	//Clearing Fields
            amountField.setText("");
            accTextFieldt.setText("");
            emailTextField.setText("");
        } 
         // Tranfer method 
        if(e.getSource()==transferButton)
        { 
          	transferRequest.transfer();
        }   
       
       // change password
        if(e.getSource()==changeButton)
            {  
        	  configSetting.changePassword();  	
            } 
          if(e.getSource()==resetBtn) {    
        	 oldPassField.setText("");
        	 newPassField.setText("");
        	 confirmPassField.setText("");
        }
     }
}


