package gym_management_system;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Customer_information implements ActionListener 
{
	JFrame f5;
	String x[] ={"Customer Id","Name","Father's name","Email","Address","Contact no","Receipt_no","Payment Plan","Gender","Height","Weight","Remarks","catg.","Trainer name"};
    JButton bt;
    JPanel p1,p2,p3;
    JLabel l1,l2;
    JTextField tf1;
    
    String y[][]= new String[30][15];
    int i=0,j=0;
    JTable t;
    Font f1,f;
	

	public Customer_information() {
		// TODO Auto-generated constructor stub
		f5=new JFrame();
		
		   
	       f5.setVisible(true);
	       f5.setSize(1920,800);
	       f5.setLayout(new BorderLayout());
	       f5.setTitle("Customer Information");
	     // f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      t= new JTable(y,x);
	      t.setEnabled(false);
          t.setBackground(Color.BLACK);
          t.setForeground(Color.WHITE);
          f1= new Font("Lucida Fax",Font.BOLD,25);
          f= new Font("MS UI GOTHIC",Font.BOLD,15);
          
          JScrollPane sp= new JScrollPane(t);
          l1= new JLabel("Delete any Customer ?");
          l1.setHorizontalAlignment(JLabel.CENTER);
          l1.setFont(f1);
          l1.setForeground(Color.yellow);
          
           l2= new JLabel("Customer ID");
          l2.setFont(f1);
          l2.setForeground(Color.GRAY);

          p1= new JPanel();
          p1.setLayout(new GridLayout(1,1,10,10));
          p1.add(l1);

          tf1= new JTextField();
          bt=new JButton("Delete Customer");
          tf1.setFont(f);
          bt.setFont(f);

          bt.addActionListener(this);
          bt.setBackground(Color.BLACK);
          bt.setForeground(Color.RED);
          
         

          p2= new JPanel();
          p2.setLayout(new GridLayout(1,3,10,10));
          p2.add(l2);
          p2.add(tf1);
          p2.add(bt);

          p3=new JPanel();
          p3.setLayout(new GridLayout(2,1,10,10));
          p3.add(p1);
          p3.add(p2);

          p1.setBackground(Color.BLACK);
          p2.setBackground(Color.BLACK);
          p3.setBackground(Color.BLACK);

          f5.add(p3,"South");
          f5.add(sp);
         
          try
          {
              Connectionclass obj = new Connectionclass();
              String q= "select * from add_customer";
              ResultSet rest = obj.stm.executeQuery(q);
              while (rest.next())
              {
                  y[i][j++]=rest.getString("Cutomer_id");
                  y[i][j++]=rest.getString("Name");
                  y[i][j++]=rest.getString("Father_name");
                  y[i][j++]=rest.getString("Email");
                  y[i][j++]=rest.getString("Address");
                  y[i][j++]=rest.getString("Contact_no");
                  y[i][j++]=rest.getString("Receipt_no");
                  y[i][j++]=rest.getString("Payment_plan");
                  y[i][j++]=rest.getString("Gender");
                   y[i][j++]=rest.getString("Height");
                  y[i][j++]=rest.getString("Weight");
                  y[i][j++]=rest.getString("Remark");
                  
                  y[i][j++]=rest.getString("Member_category");
                  y[i][j++]=rest.getString("Trainer_name");
                  i++;
                  j=0;
              }
          }
              catch(Exception e)
              {
            	  System.out.println(e);
              }
        
		   //f5.setExtendedState(JFrame.MAXIMIZED_BOTH);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Customer_information();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt)
		{
			int id=Integer.parseInt(tf1.getText());
			try
			{
				Connectionclass ob=new Connectionclass();
				String q="delete from add_customer where Cutomer_id='"+id+"'";
				String p="delete from pay_customer where Cutomer_id='"+id+"'";
				ob.stm.execute(p);
				ob.stm.execute(q);
				f5.dispose();
				new Customer_information();
				
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		
	}

}
