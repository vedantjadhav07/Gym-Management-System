package gym_management_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;
public class Trainer_fees implements ActionListener {
	JFrame f10;
	JLabel l1,l2,l3,l4,l5,l6; 
    JButton bt1,bt2;
    Choice ch1,ch2;
    JTextField tf1,tf2,tf3;
    JPanel p1,p2,p3;
	public Trainer_fees() {
		
	    f10=new JFrame();
	        f10.setTitle("Trainer fees");
	        f10.setSize(670,300);
	        f10.setLocation(270,250);
	        f10.setResizable(false);
	        f10.setVisible(true);
	       Font f1 = new Font("Lucida Fax", Font.BOLD, 25);
	       Font f = new Font("MS UI Gothic", Font.BOLD, 18);
	       ImageIcon img = new ImageIcon("G:\\vedant\\5th semester\\Advanced Java Programming\\eclipce java code\\gym_management_system\\src\\gym_management_system\\fees_trainer2.png");
	       Image im = img.getImage().getScaledInstance(170, 230, Image.SCALE_DEFAULT);
	       l6 = new JLabel(new ImageIcon(im));
	       
	       l1= new JLabel("Trainer Id");
	       l2= new JLabel("Name");
	       l3= new JLabel("Category");
	       l4= new JLabel("Charge fees per client");
	       l5= new JLabel("Trainer Fees");
	       l5.setFont(f1);
	       l5.setHorizontalAlignment(JLabel.CENTER);
	       
	       tf1= new JTextField();
	       tf2= new JTextField();
	       tf3= new JTextField();
	  
	       l1.setFont(f);
	       l2.setFont(f);
	       l3.setFont(f);
	       l4.setFont(f);
	    
	       tf1.setFont(f);
	       tf2.setFont(f);
	       tf3.setFont(f);
	   
	       l1.setForeground(Color.WHITE);
	       l2.setForeground(Color.WHITE);
	       l3.setForeground(Color.WHITE);
	       l4.setForeground(Color.WHITE);
	       l5.setForeground(Color.YELLOW);

	    ch1= new Choice();
	    try{
	        Connectionclass obj =new Connectionclass();
	        String q= "select Trainer_id from add_trainer";
	        ResultSet rest = obj.stm.executeQuery(q);
	        while(rest.next())
	        {
	            ch1.add(rest.getString("Trainer_id"));
	        }
	      }
	    catch(Exception ex)
	    {
	        ex.printStackTrace();
	    }
	    ch1.addMouseListener(new MouseAdapter() {
	    public void mouseClicked(MouseEvent ee)
	    		{
	    	int id= Integer.parseInt(ch1.getSelectedItem());
            try
            {
                Connectionclass obj1 =new Connectionclass();
                String q1= "select * from add_trainer where Trainer_id='"+id+"'";
                ResultSet rest1 = obj1.stm.executeQuery(q1);
                while(rest1.next())
                {
                    tf1.setText(rest1.getString("Name"));
                    tf2.setText(rest1.getString("Membership_category"));
                 }
                
            }
            catch(Exception exx)
            {
                exx.printStackTrace();
            }
	    		}
	});
	    
	    
	    ch1.setFont(f);
	    
	    bt1 = new JButton("Submit");
	    bt2 = new JButton("Cancel");
	      
	    bt1.setFont(f);
	    bt2.setFont(f);
	    
	    bt1.setBackground(Color.BLACK);
	    bt1.setForeground(Color.CYAN);
	    bt2.setBackground(Color.BLACK);
	    bt2.setForeground(Color.RED);
	 
	    bt1.addActionListener(this);    
	    bt2.addActionListener(this);
	    
	    p1= new JPanel();
	    p1.setLayout(new GridLayout(1,1,10,10));
	    p1.add(l5);
	    
	    p2= new JPanel();
	    p2.setLayout(new GridLayout(5,2,10,10));
	    p2.add(l1);
	    p2.add(ch1);
	    p2.add(l2);
	    p2.add(tf1);
	    p2.add(l3);
	    p2.add(tf2);
	    p2.add(l4);
	    p2.add(tf3);
	    p2.add(bt1);
	    p2.add(bt2);
	    
	    p3= new JPanel();
	    p3.setLayout(new GridLayout(1,1,10,10));
	    p3.add(l6);

	    p1.setBackground(Color.BLACK);
	    p2.setBackground(Color.BLACK);
	    p3.setBackground(Color.BLACK);
	    
	    f10.setLayout(new BorderLayout());
	    
	    f10.add(p1,"North");
	   f10.add(p2,"Center");
	    f10.add(p3,"West");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Trainer_fees();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(ch1.getSelectedItem());
        String name=tf1.getText();
        String category=tf2.getText();
        float fees =Float.parseFloat(tf3.getText());
        try {
        	  Connectionclass obj2= new Connectionclass();
            if(e.getSource()==bt1)
            {
            	
              
                String q1="select Trainer_id from fee_trainer where Trainer_id= '"+id+"'";
                
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
                    
                    String q2="insert into fee_trainer values('"+id+"','"+name+"','"+category+"','"+fees+"')";
                    obj2.stm.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Your fees data adds Successfully  :");
                    f10.dispose();

                }
                else {
                	System.out.println("up");

                	String q3="update fee_trainer set Name='"+name+"',Category='"+category+"',fees='"+fees+"' where Trainer_id='"+id+"'";
                	obj2.stm.execute(q3);
                    JOptionPane.showMessageDialog(null,"Your fees data update Successfully  :");
                }
            }
            if(e.getSource()==bt2)
            {
            	f10.dispose();
            }
        } 
        catch (Exception ex) {
            System.out.println(ex);
        }
		
	}

}
