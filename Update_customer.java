package gym_management_system;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

import com.mysql.cj.protocol.Resultset;
public class Update_customer extends JFrame implements ActionListener, MouseListener {

	JFrame f7;
	JLabel c_welcome,c_name,c_fathername,c_email,c_addres,c_contact,c_receipt_no,c_payment_plan,c_gender,c_height,c_weight,c_remark,c_member_category,c_trainer_name,c_img,customer_id;
	JTextField c_name_t,c_fathername_t,c_email_t,c_address_t,c_contact_t,c_receipt_no_t,c_payment_plan_t,c_height_t,c_weight_t,c_remark_t,cutomer_id_t;
	JButton c_submit,c_cancle;
	Choice c_gender_l,customer_id_c,c_trainer_name_t,c_member_category_t;
	GridBagConstraints gck=new GridBagConstraints();
	GridBagLayout gb=new GridBagLayout();

	public Update_customer() {
		

			// TODO Auto-generated constructor stub
			f7=new JFrame();
			f7.setVisible(true);
			f7.setSize(800,900);
			f7.setLayout(gb);
			f7.setBackground(Color.BLUE);
			f7.setTitle("ADD CUSTOMER");
			f7.setLocationRelativeTo(null);
			

	        

	  		c_welcome=new JLabel("Update Customer");

			c_welcome.setForeground(Color.orange);
	        c_welcome.setFont(new Font("Arial", Font.BOLD, 20));
			gck.gridx=0;
			gck.gridy=0;
			
			gck.gridwidth=3;
			gb.setConstraints(c_welcome,gck);
			f7.add(c_welcome);

			ImageIcon imgf3=new ImageIcon("G:\\vedant\\5th semester\\Advanced Java Programming\\eclipce java code\\gym_management_system\\src\\gym_management_system\\customer.jpg");
	        c_img=new JLabel(imgf3);
			gck.gridx=0;
			gck.gridy=1;
		    gck.gridwidth=1;
			gck.gridheight=14;
			gb.setConstraints(c_img,gck);
			f7.add(c_img);
			gck.gridheight=1;


			customer_id=new JLabel("Customer ID");
			customer_id.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			customer_id.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=1;
			gck.ipadx=10;
		    gck.ipady=10;
			gck.gridwidth=1;
			gck.fill=GridBagConstraints.HORIZONTAL;
			gck.insets=new Insets(10,10,10,10);
		    gb.setConstraints(customer_id,gck);
			f7.add(customer_id);

			customer_id_c=new Choice();
			
			try
	        {
	            Connectionclass obj3=new Connectionclass();
	            String q3="select Cutomer_id from add_customer";
	            ResultSet rest3=obj3.stm.executeQuery(q3);
	            while(rest3.next())
	            {
	                customer_id_c.add(rest3.getString("Cutomer_id"));
	            }
	        }
	        catch(Exception ee)
	        {
	            ee.printStackTrace();
	        }
			customer_id_c.addMouseListener(this);
					
					
				
			customer_id.setHorizontalAlignment(2);
			customer_id_c.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=1;
			gck.gridwidth=1;
		    gb.setConstraints(customer_id_c,gck);
			f7.add(customer_id_c);

			c_name=new JLabel("Name");
			c_name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_name.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=2;
			gck.ipadx=10;
		    gck.ipady=10;
			gck.gridwidth=1;
			gck.insets=new Insets(10,10,10,10);
		    gb.setConstraints(c_name,gck);
			f7.add(c_name);

			c_name_t=new JTextField(20);
			c_name_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=2;
			gck.ipadx=10;
		    gck.ipady=10;
			gck.insets=new Insets(10,10,10,10);
			gck.gridwidth=1;
		    gb.setConstraints(c_name_t,gck);
			f7.add(c_name_t);

			c_fathername=new JLabel("Father's Name");
			c_fathername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_fathername.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=3;
			gck.ipadx=10;
		    gck.ipady=10;
			gck.gridwidth=1;
		    gb.setConstraints(c_fathername,gck);
			f7.add(c_fathername);

			c_fathername_t=new JTextField(20);
			c_fathername_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=3;
			gck.gridwidth=1;
		    gb.setConstraints(c_fathername_t,gck);
			f7.add(c_fathername_t);

			c_email=new JLabel("Email");
			c_email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_email.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=4;
			gck.gridwidth=1;
		    gb.setConstraints(c_email,gck);
			f7.add(c_email);

			c_email_t=new JTextField(20);
			c_email_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=4;
			gck.gridwidth=1;
		    gb.setConstraints(c_email_t,gck);
			f7.add(c_email_t);

			c_addres=new JLabel("Address");
			c_addres.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_addres.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=5;
			gck.gridwidth=1;
		    gb.setConstraints(c_addres,gck);
			f7.add(c_addres);

			c_address_t=new JTextField(20);
			c_address_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=5;
			gck.gridwidth=1;
		    gb.setConstraints(c_address_t,gck);
			f7.add(c_address_t);

			c_contact=new JLabel("Contact no.");
			c_contact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_contact.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=6;
			gck.gridwidth=1;
		    gb.setConstraints(c_contact,gck);
			f7.add(c_contact);

			c_contact_t=new JTextField(20);
			c_contact_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=6;
			gck.gridwidth=1;
		    gb.setConstraints(c_contact_t,gck);
			f7.add(c_contact_t);

			c_receipt_no=new JLabel("Receipt_no");
			c_receipt_no.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_receipt_no.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=7;
			gck.gridwidth=1;
		    gb.setConstraints(c_receipt_no,gck);
			f7.add(c_receipt_no);

			c_receipt_no_t=new JTextField(20);
			c_receipt_no_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=7;
			gck.gridwidth=1;
		    gb.setConstraints(c_receipt_no_t,gck);
			f7.add(c_receipt_no_t);

			c_payment_plan=new JLabel("Payment Plan (Month)");
			c_payment_plan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_payment_plan.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=8;
			gck.gridwidth=1;
		    gb.setConstraints(c_payment_plan,gck);
			f7.add(c_payment_plan);

			c_payment_plan_t=new JTextField(20);
			c_payment_plan_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=8;
			gck.gridwidth=1;
		    gb.setConstraints(c_payment_plan_t,gck);
			f7.add(c_payment_plan_t);

		

			c_height=new JLabel("Height");
			c_height.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_height.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=9;
			gck.gridwidth=1;
		    gb.setConstraints(c_height,gck);
			f7.add(c_height);
			
			c_height_t=new JTextField(20);
			c_height_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=9;
			gck.gridwidth=1;
		    gb.setConstraints(c_height_t,gck);
			f7.add(c_height_t);

			c_weight=new JLabel("Weight");
			c_weight.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_weight.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=10;
			gck.gridwidth=1;
		    gb.setConstraints(c_weight,gck);
			f7.add(c_weight);

			c_weight_t=new JTextField(20);
	        c_weight_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=10;
			gck.gridwidth=1;
		    gb.setConstraints(c_weight_t,gck);
			f7.add(c_weight_t);

			c_remark=new JLabel("Remark");
			c_remark.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_remark.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=11;
			gck.gridwidth=1;
		    gb.setConstraints(c_remark,gck);
			f7.add(c_remark);

		    c_remark_t=new JTextField(20);
			c_remark_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=11;
			gck.gridwidth=1;
		    gb.setConstraints(c_remark_t,gck);
			f7.add(c_remark_t);


			c_member_category=new JLabel("Membership Category");
			
			c_member_category.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_member_category.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=12;
			gck.gridwidth=1;
		    gb.setConstraints(c_member_category,gck);
			f7.add(c_member_category);

			c_member_category_t=new Choice();
			c_member_category_t.add("Public");
			c_member_category_t.add("Private");
			c_member_category_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=12;
			gck.gridwidth=1;
			gck.gridheight=1;
		    gb.setConstraints(c_member_category_t,gck);
			f7.add(c_member_category_t);

			c_trainer_name=new JLabel("Trainer name");
			c_trainer_name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_trainer_name.setForeground(Color.BLUE);
			gck.gridx=1;
			gck.gridy=13;
			gck.gridwidth=1;
		    gb.setConstraints(c_trainer_name,gck);
			f7.add(c_trainer_name);

			c_trainer_name_t=new Choice();
			c_trainer_name_t.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e)
				{
					
					try
					{
						Connectionclass obn=new Connectionclass();
						String q="select Name from add_trainer";
						ResultSet res=obn.stm.executeQuery(q);
						while(res.next())
						{
			                c_trainer_name_t.add(res.getString("Name"));

							
						}
					}
					catch(Exception ee)
					{
						System.out.println(ee);
					}
				}
			});
			c_trainer_name_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			gck.gridx=2;
			gck.gridy=13;
			gck.gridwidth=1;
			gck.fill=GridBagConstraints.HORIZONTAL;
		    gb.setConstraints(c_trainer_name_t,gck);
			f7.add(c_trainer_name_t);

	        c_submit=new JButton("Update Data ");
			c_submit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			c_submit.addActionListener(this);
			gck.gridx=1;
			gck.gridy=14;
			gck.gridwidth=1;
			gck.fill=GridBagConstraints.HORIZONTAL;
		    gb.setConstraints(c_submit,gck);
			f7.add(c_submit);

			c_cancle=new JButton("Cancle");
			c_cancle.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			
			c_cancle.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e)
				{
					f7.dispose();
				}
			});
			gck.gridx=2;
			gck.gridy=14;
			gck.gridwidth=1;
			gck.insets=new Insets(10,20,10,20);
		    gb.setConstraints(c_cancle,gck);
			f7.add(c_cancle);

	        
	     
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Update_customer();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==c_submit)
		{
			String name=c_name_t.getText();
			String fname=c_fathername_t.getText();
			String email=c_email_t.getText();
			String address=c_address_t.getText();
			String contact=c_contact_t.getText();
			
			String pay=c_payment_plan_t.getText();
			
			Float height=Float.parseFloat(c_height_t.getText());
			int weight=Integer.parseInt(c_weight_t.getText());
			String remark=c_remark_t.getText();
			String member_cat=c_member_category_t.getSelectedItem();
			
			
			try
			{
				Connectionclass ob=new Connectionclass();
				String q="update add_customer set Name='"+name+"',Father_name='"+fname+"',Email='"+email+"',"
						+ "Address='"+address+"',Contact_no='"+contact+"',Payment_plan='"+pay+"',Height='"+height+"',Weight='"+weight+"',"
								+ "Remark='"+remark+"',Member_category='"+member_cat+"'";
				
				ob.stm.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"Data Updated");
				f7.dispose();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		try
		{
			int id=Integer.parseInt(customer_id_c.getSelectedItem());
			Connectionclass ob=new Connectionclass();
			String q="select * from add_customer where Cutomer_id='"+id+"'";
			ResultSet res=ob.stm.executeQuery(q);
			
			while(res.next())
			{
			c_name_t.setText(res.getString("Name"));
			c_fathername_t.setText(res.getString("Father_name"));
			c_email_t.setText(res.getString("Email"));
			c_address_t.setText(res.getString("Address"));
			c_contact_t.setText(res.getString("Contact_no"));
			c_receipt_no_t.setText(res.getString("Receipt_no"));
			c_payment_plan_t.setText(res.getString("Payment_plan"));
			c_height_t.setText(res.getString("Height"));
			c_weight_t.setText(res.getString("Weight"));
			c_remark_t.setText(res.getString("Remark"));
			
			}
			
		}
		 catch(Exception ee)
        {
            ee.printStackTrace();
        }
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
