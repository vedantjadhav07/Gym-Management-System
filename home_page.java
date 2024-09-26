package gym_management_system;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

public class home_page implements ActionListener
{
     JFrame f2;
	JLabel bgimg;
	MenuBar m;
	Menu master,personal_info,update_info,fee_info,Print,exit;
	MenuItem add_trainer,add_customer;
	MenuItem trainer_info,customer_info;
	MenuItem trainer_update,customer_update;
	MenuItem trainer_fees,customer_fees;
	MenuItem print_c,print_t;
	MenuItem exitm;
	GridBagConstraints gck=new GridBagConstraints();
	GridBagLayout gb=new GridBagLayout();
    
	public home_page() {
		// TODO Auto-generated constructor stub
		 f2=new JFrame();
	       f2.setVisible(true);
	       f2.setSize(2000,2000);
	       f2.setLayout(gb);
	       f2.setTitle("Gym Management System");
	       f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   ImageIcon mainn=new ImageIcon("E:\\Diploma\\5th semester\\Advanced Java Programming\\GYM eclipce java code (source code)\\gym_management_system\\src\\gym_management_system\\main.jpg");
		   bgimg=new JLabel(mainn);
         f2.getContentPane().add(bgimg);
		   f2.setExtendedState(JFrame.MAXIMIZED_BOTH);

         
		   m=new MenuBar();

		   master=new Menu("Master");
		   master.addSeparator();
		   add_trainer =new MenuItem("ADD_Trainer");
		   add_trainer.addActionListener(this);
		   add_trainer.setFont(new Font("Times New Roman", Font.BOLD, 12));         
		   add_customer =new MenuItem("ADD_Customer");
		   add_customer.addActionListener(this);
		   add_customer.setFont(new Font("Times New Roman", Font.BOLD, 12));
		   master.add(add_customer);
		   master.add(add_trainer);

		   personal_info=new Menu("Personal Information");
		   personal_info.addSeparator();
		   personal_info.addActionListener(this);
		   
		   trainer_info=new MenuItem("Trainer Information");
		   trainer_info.setFont(new Font("Times New Roman", Font.BOLD, 12));
		   
		   customer_info=new MenuItem("Customer Information");
		   customer_info.setFont(new Font("Times New Roman", Font.BOLD, 12));
         personal_info.add(customer_info);
		   personal_info.add(trainer_info);

		   update_info=new Menu("Update Information");
		   update_info.addSeparator();
		   trainer_update=new MenuItem("Trainer Update");
		   trainer_update.addActionListener(this);
		   trainer_update.setFont(new Font("Times New Roman", Font.BOLD, 12));
		   
		   customer_update=new MenuItem("Customer Update");
		   customer_update.setFont(new Font("Times New Roman", Font.BOLD, 12));
		   customer_update.addActionListener(this);
		   update_info.add(customer_update);
	       update_info.add(trainer_update);

		   fee_info=new Menu("Fee Information");
		   fee_info.addSeparator();
         trainer_fees=new MenuItem("Trainer Fees");
		   trainer_fees.setFont(new Font("Times New Roman", Font.BOLD, 12));
		   trainer_fees.addActionListener(this);
		   
		   customer_fees=new MenuItem("Customer Fees");
		   customer_fees.setFont(new Font("Times New Roman", Font.BOLD, 12));
		   customer_fees.addActionListener(this);
		   fee_info.add(customer_fees);
		   fee_info.add(trainer_fees);
           
		   Print=new Menu("Print");
		   print_c=new MenuItem("Customer reciept");
		   print_c.setFont(new Font("Times New Roman", Font.BOLD, 12));
		   print_c.addActionListener(this);
		   Print.add(print_c);
		   print_t=new MenuItem("Trainer reciept");
		   print_t.setFont(new Font("Times New Roman", Font.BOLD, 12));
		   print_t.addActionListener(this);
		   Print.add(print_t);


		   
		   exit=new Menu("EXIT");
		   exitm=new MenuItem("EXIT");
		   exitm.addActionListener(this);
		   exitm.setFont(new Font("Times New Roman", Font.BOLD, 12));
		   exit.add(exitm);

		   m.add(master);
		   m.add(personal_info);
		   m.add(update_info);
		   m.add(fee_info);
		   m.add(Print);
		   m.add(exit);

		   f2.setMenuBar(m);




         
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new home_page();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg=e.getActionCommand();
		if(msg.equals("ADD_Customer"))
		{
			
		 new Add_customer();
		

		}
  
      if(msg.equals("ADD_Trainer"))
		{
			new Add_trainer();
		}
		if(msg.equals("Customer Information"))
		{
			new Customer_information();
			
		}
		if(msg.equals("Trainer Information"))
		{
			new Trainer_information();
			
		}
		if(msg.equals("Customer Update"))
		{
			new Update_customer();
			
		}
		if(msg.equals("Trainer Update"))
		{
			new Update_trainer();
			
		}
		
		if(msg.equals("Customer Fees"))
		{
			new Customer_fees();
			
		}
		if(msg.equals("Trainer Fees"))
		{
			new Trainer_fees();
			
		}
		if(msg.equals("EXIT"))
		{
			
			f2.dispose();
			
		}
		if(msg.equals("Customer reciept"))
		{
			new customer_search().setVisible(true);
		}
		if(msg.equals("Trainer reciept"))
		{
			new trainer_search().setVisible(true);
		}
		
	}

}
