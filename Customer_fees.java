package gym_management_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class Customer_fees implements ActionListener{
   JFrame f9;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9; 
    JButton bt1,bt2;
    Choice ch1,ch2;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JPanel p1,p2,p3;
	public Customer_fees() {
		
	   f9=new JFrame();
	       f9.setTitle("Custome Fees");
	        f9.setSize(670,300);
	         f9.setLocation(270,250);
	        f9.setResizable(false);
	        f9.setVisible(true);
	        f9.setLayout(new BorderLayout());
	        
	       Font f1 = new Font("Lucida Fax", Font.BOLD, 25);
	       Font f = new Font("MS UI Gothic", Font.BOLD, 18);
	       ImageIcon img = new ImageIcon("G:\\vedant\\5th semester\\Advanced Java Programming\\eclipce java code\\gym_management_system\\src\\gym_management_system\\fees_customer.png");
	       Image im = img.getImage().getScaledInstance(140, 200, Image.SCALE_DEFAULT);
	       l6 = new JLabel(new ImageIcon(im));
	       
	       l1= new JLabel("Customer Id");
	       l2= new JLabel("Name");
	       l3= new JLabel("Category");
	       l7= new JLabel("Month");
	       l4= new JLabel("Charge fees per month");
	       l5= new JLabel("Pay Fees");
	       l9= new JLabel("Trainer Name");
	       l5.setFont(f1);
	       l5.setHorizontalAlignment(JLabel.CENTER);

	       tf1= new JTextField();
	       tf2= new JTextField();
	       tf3= new JTextField();
	       tf4= new JTextField();
	       tf6= new JTextField();
	       
	       l1.setFont(f);
	       l2.setFont(f);
	       l3.setFont(f);
	       l4.setFont(f);
	       l7.setFont(f);
	       l9.setFont(f);
	       
	       tf1.setFont(f);
	       tf2.setFont(f);
	       tf3.setFont(f);
	       tf4.setFont(f);
	       tf6.setFont(f);
	       
	       l1.setForeground(Color.WHITE);
	       l2.setForeground(Color.WHITE);
	       l3.setForeground(Color.WHITE);
	       l4.setForeground(Color.WHITE);
	       l7.setForeground(Color.WHITE);
	       l9.setForeground(Color.WHITE);
	       l5.setForeground(Color.WHITE);
	       
	       ch1= new Choice();
	       try
	       {
	       Connectionclass obj =new Connectionclass();
           String q= "select Cutomer_id from add_customer";
           ResultSet rest = obj.stm.executeQuery(q);
        while(rest.next())
        {
            ch1.add(rest.getString("Cutomer_id"));
        }
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
	       ch1.addMouseListener(new MouseAdapter()
	       {
	           @Override
	           public void mouseClicked(MouseEvent arg)
	           {
	               int id= Integer.parseInt(ch1.getSelectedItem());
	               try
	               {
	                   Connectionclass obj1 =new Connectionclass();
	                   String q1= "select * from add_customer where Cutomer_id='"+id+"'";
	                   ResultSet rest1 = obj1.stm.executeQuery(q1);
	                   while(rest1.next())
	                   {
	                       tf1.setText(rest1.getString("Name"));
	                       tf2.setText(rest1.getString("Member_category"));
	                       tf6.setText(rest1.getString("Trainer_name"));
	         
	                    }
	                   
	               }
	               catch(Exception exx)
	               {
	                   exx.printStackTrace();
	               }
	           }
	       });
	       
	       ch1.setFont(f);
	       
	       ch2= new Choice();
	       ch2.add("January");
	       ch2.add("February");
	       ch2.add("March");
	       ch2.add("April");
	       ch2.add("May");
	       ch2.add("June");
	       ch2.add("July");
	       ch2.add("August");
	       ch2.add("September");
	       ch2.add("October");
	       ch2.add("November");
	       ch2.add("December");
	         
	       ch2.setFont(f);
	       
	       bt1=new JButton("Submit");
	       bt2=new JButton("Cancel");
	       
	       bt1.setBackground(Color.BLACK);
	       bt1.setBackground(Color.CYAN);
	       bt2.setBackground(Color.BLACK);
	       bt2.setBackground(Color.RED);
	       
	       bt1.addActionListener(this);
	       bt2.addActionListener(this);

	       p1= new JPanel();
	       p1.setLayout(new GridLayout(1,1,10,10));
	       p1.add(l5);
	       
	       p2= new JPanel();
	       p2.setLayout(new GridLayout(7,2,10,10));
	       p2.add(l1);
	       p2.add(ch1);
	       p2.add(l2);
	       p2.add(tf1);
	       p2.add(l3);
	       p2.add(tf2);
	       p2.add(l9);
	       p2.add(tf6);
	       p2.add(l7);
	       p2.add(ch2);
	       p2.add(l4);
	       p2.add(tf3);
	       p2.add(bt1);
	       p2.add(bt2);
	    
	      p3=new JPanel();
	      p3.setLayout(new GridLayout(1,1,10,10));
	      p3.add(l6);
	      
	      p1.setBackground(Color.BLACK);
	      p2.setBackground(Color.BLACK);
	      p3.setBackground(Color.BLACK);
	      
	        
	  
	    f9.add(p1,"North");
	    f9.add(p2,"Center");
	    f9.add(p3,"West");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Customer_fees();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String id= ch1.getSelectedItem();
        String name=tf1.getText();
        String category=tf2.getText();
       float fees=Float.parseFloat(tf3.getText());
        String trainer_name=tf6.getText();
    String month =ch2.getSelectedItem();
    try{
                 
    	Connectionclass obj2= new Connectionclass();
        if(e.getSource()==bt1)
        {
        	
          
            String q1="select Cutomer_id from pay_customer where Cutomer_id= '"+id+"'";
            
            ResultSet res=obj2.stm.executeQuery(q1);
            int tid=1;
            while(res.next())
            {
            tid=res.getInt(1);
          
            }
            System.out.println(tid);
            
            if(tid==1)
            {
            	System.out.println("insert");
                
                String q2="insert into pay_customer values('"+id+"','"+name+"','"+category+"','"+fees+"','"+month+"','"+trainer_name+"')";
                obj2.stm.executeUpdate(q2);
                JOptionPane.showMessageDialog(null,"Your fees data adds Successfully  :");
                f9.dispose();

            }
            else {
            	System.out.println("up");

            	String q3="update pay_customer set Name='"+name+"',Category='"+category+"',fees='"+fees+"',month='"+month+"',Trainer_name='"+trainer_name+"' where Cutomer_id='"+id+"'";
            	obj2.stm.execute(q3);
                JOptionPane.showMessageDialog(null,"Your fees data update Successfully  :");
            }
     if(e.getSource()==bt2)
     {
    	 f9.dispose();
     }
		
	}
    }
    catch(Exception exx)
    {
        exx.printStackTrace();
    }

}
}
