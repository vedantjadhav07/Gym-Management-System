package gym_management_system;

import java.awt.Choice;
import java.sql.*;
import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.*;
public class Add_customer implements ActionListener{
	JFrame f3;
	JLabel c_welcome,c_name,c_fathername,c_email,c_addres,c_contact,c_receipt_no,c_payment_plan,c_gender,c_height,c_weight,c_remark,c_member_category,c_trainer_name,c_img;
	JTextField c_name_t,c_fathername_t,c_email_t,c_address_t,c_contact_t,c_receipt_no_t,c_payment_plan_t,c_height_t,c_weight_t,c_remark_t;
	JButton c_submit,c_cancle;
	Choice c_gender_l,c_member_category_t,c_trainer_name_t;
	GridBagConstraints gck=new GridBagConstraints();
	GridBagLayout gb=new GridBagLayout();


	public Add_customer() {
		// TODO Auto-generated constructor stub
		f3=new JFrame();
		f3.setVisible(true);
		f3.setSize(800,900);
		f3.setLayout(gb);
		f3.setBackground(Color.BLUE);
		f3.setTitle("ADD CUSTOMER");
		f3.setLocationRelativeTo(null);
		

        

  		c_welcome=new JLabel("Welcome Future BodyBuilder");

		c_welcome.setForeground(Color.orange);
        c_welcome.setFont(new Font("Arial", Font.BOLD, 20));
		gck.gridx=0;
		gck.gridy=0;
		
		gck.gridwidth=3;
		gb.setConstraints(c_welcome,gck);
		f3.add(c_welcome);

		ImageIcon imgf3=new ImageIcon("G:\\vedant\\5th semester\\Advanced Java Programming\\eclipce java code\\gym_management_system\\src\\gym_management_system\\customer.jpg");
        c_img=new JLabel(imgf3);
		gck.gridx=0;
		gck.gridy=1;
	    gck.gridwidth=1;
		gck.gridheight=13;
		gb.setConstraints(c_img,gck);
		f3.add(c_img);
		gck.gridheight=1;



		c_name=new JLabel("Name");
		c_name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_name.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=1;
		gck.ipadx=10;
	    gck.ipady=10;
		gck.gridwidth=1;
		gck.insets=new Insets(10,10,10,10);
	    gb.setConstraints(c_name,gck);
		f3.add(c_name);

		c_name_t=new JTextField(20);
		c_name_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=1;
		gck.ipadx=10;
	    gck.ipady=10;
		gck.insets=new Insets(10,10,10,10);
		gck.gridwidth=1;
	    gb.setConstraints(c_name_t,gck);
		f3.add(c_name_t);

		c_fathername=new JLabel("Father's Name");
		c_fathername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_fathername.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=2;
		gck.ipadx=10;
	    gck.ipady=10;
		gck.gridwidth=1;
	    gb.setConstraints(c_fathername,gck);
		f3.add(c_fathername);

		c_fathername_t=new JTextField(20);
		c_fathername_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=2;
		gck.gridwidth=1;
	    gb.setConstraints(c_fathername_t,gck);
		f3.add(c_fathername_t);

		c_email=new JLabel("Email");
		c_email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_email.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=3;
		gck.gridwidth=1;
	    gb.setConstraints(c_email,gck);
		f3.add(c_email);

		c_email_t=new JTextField(20);
		c_email_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=3;
		gck.gridwidth=1;
	    gb.setConstraints(c_email_t,gck);
		f3.add(c_email_t);
		c_email_t.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e)
			{
				String email=c_email_t.getText();
				String email_reg="^[a-zA-Z0-9_+&*-]+(?:\\.\"+\"a-zA-Z0-9_+&*-]+)*@\"+\"(?:[a-zA-Z0-9-]+\\.) [a-zA-Z]{2,7}$";
				if(email.matches(email_reg)==false)
				{
					JOptionPane.showMessageDialog(null, "Enter valid Email ID");

				}
						
			}
		});

		c_addres=new JLabel("Address");
		c_addres.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_addres.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=4;
		gck.gridwidth=1;
	    gb.setConstraints(c_addres,gck);
		f3.add(c_addres);

		c_address_t=new JTextField(20);
		c_address_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=4;
		gck.gridwidth=1;
	    gb.setConstraints(c_address_t,gck);
		f3.add(c_address_t);

		c_contact=new JLabel("Contact no.");
		c_contact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_contact.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=5;
		gck.gridwidth=1;
	    gb.setConstraints(c_contact,gck);
		f3.add(c_contact);

		c_contact_t=new JTextField(20);
		
		
		c_contact_t.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e)
			{
				String contact=c_contact_t.getText();
				String contact_reg="\\d{10}";
				if(contact.matches(contact_reg)==false)
				{
					JOptionPane.showMessageDialog(null, "Enter valid contact number");

				}
						
			}
		});
		c_contact_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=5;
		gck.gridwidth=1;
	    gb.setConstraints(c_contact_t,gck);
		f3.add(c_contact_t);

		c_receipt_no=new JLabel("Receipt_no");
		c_receipt_no.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_receipt_no.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=6;
		gck.gridwidth=1;
	    gb.setConstraints(c_receipt_no,gck);
		f3.add(c_receipt_no);

		c_receipt_no_t=new JTextField(20);
		c_receipt_no_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=6;
		gck.gridwidth=1;
	    gb.setConstraints(c_receipt_no_t,gck);
		f3.add(c_receipt_no_t);
		
			c_receipt_no_t.addMouseListener(new MouseAdapter() {
				
				public void mouseExited(MouseEvent e)
				{
				
				int id=Integer.parseInt(c_receipt_no_t.getText());
				Connectionclass ob=new Connectionclass();
				String q="select Cutomer_id from add_customer where Cutomer_id='"+id+"'";
				ResultSet res;
				try {
					res = ob.stm.executeQuery(q);
					while(res.next())
					{
						if(res.getInt(1)==id)
						{
							JOptionPane.showMessageDialog(null, "Selecet another receipt id(already exits)");

						}
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				}
				
			});
		
		c_payment_plan=new JLabel("Payment Plan (Month)");
		c_payment_plan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_payment_plan.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=7;
		gck.gridwidth=1;
	    gb.setConstraints(c_payment_plan,gck);
		f3.add(c_payment_plan);

		c_payment_plan_t=new JTextField(20);
		c_payment_plan_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=7;
		gck.gridwidth=1;
	    gb.setConstraints(c_payment_plan_t,gck);
		f3.add(c_payment_plan_t);

		c_gender=new JLabel("Gender");
		c_gender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_gender.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=8;
		gck.gridwidth=1;
		
	    gb.setConstraints(c_gender,gck);
		f3.add(c_gender);
		gck.fill=0;


		c_gender_l=new Choice();
		 c_gender_l.add("Male");
		 c_gender_l.add("Female");
		c_gender_l.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=8;
		gck.gridwidth=1;
		gck.fill=GridBagConstraints.HORIZONTAL;
	    gb.setConstraints(c_gender_l,gck);
		f3.add(c_gender_l);
		gck.fill=0;


		c_height=new JLabel("Height");
		c_height.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_height.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=9;
		gck.gridwidth=1;
	    gb.setConstraints(c_height,gck);
		f3.add(c_height);
		
		c_height_t=new JTextField(20);
		c_height_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=9;
		gck.gridwidth=1;
	    gb.setConstraints(c_height_t,gck);
		f3.add(c_height_t);

		c_weight=new JLabel("Weight");
		c_weight.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_weight.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=10;
		gck.gridwidth=1;
	    gb.setConstraints(c_weight,gck);
		f3.add(c_weight);

		c_weight_t=new JTextField(20);
        c_weight_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=10;
		gck.gridwidth=1;
	    gb.setConstraints(c_weight_t,gck);
		f3.add(c_weight_t);

		c_remark=new JLabel("Remark");
		c_remark.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_remark.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=11;
		gck.gridwidth=1;
	    gb.setConstraints(c_remark,gck);
		f3.add(c_remark);

	    c_remark_t=new JTextField(20);
		c_remark_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=11;
		gck.gridwidth=1;
	    gb.setConstraints(c_remark_t,gck);
		f3.add(c_remark_t);


		c_member_category=new JLabel("Membership Category");
		c_member_category.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_member_category.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=12;
		gck.gridwidth=1;

	    gb.setConstraints(c_member_category,gck);
		f3.add(c_member_category);

		c_member_category_t=new Choice();
		c_member_category_t.add("Public");
		c_member_category_t.add("Private");
		c_member_category_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=12;
		gck.gridwidth=1;
		gck.gridheight=1;
		gck.fill=GridBagConstraints.HORIZONTAL;

	    gb.setConstraints(c_member_category_t,gck);
		f3.add(c_member_category_t);

		c_trainer_name=new JLabel("Trainer name");
		c_trainer_name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_trainer_name.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=13;
		gck.gridwidth=1;
	    gb.setConstraints(c_trainer_name,gck);
		f3.add(c_trainer_name);

		c_trainer_name_t=new Choice();
		try
        {
            Connectionclass obj3=new Connectionclass();
            String q3="select  Name from add_trainer";
            ResultSet rest3=obj3.stm.executeQuery(q3);
            while(rest3.next())
            {
                c_trainer_name_t.add(rest3.getString("Name"));
            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
		c_trainer_name_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=13;
		gck.gridwidth=1;
	    gb.setConstraints(c_trainer_name_t,gck);
		f3.add(c_trainer_name_t);

        c_submit=new JButton("Submit");
		c_submit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c_submit.addActionListener(this);
		
		gck.gridx=1;
		gck.gridy=14;
		gck.gridwidth=1;
		gck.fill=GridBagConstraints.HORIZONTAL;
	    gb.setConstraints(c_submit,gck);
		f3.add(c_submit);

		c_cancle=new JButton("Cancle");
		c_cancle.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		c_cancle.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e)
			{
				f3.dispose();
			}
		});
		gck.gridx=2;
		gck.gridy=14;
		gck.gridwidth=1;
		gck.insets=new Insets(10,20,10,20);
	    gb.setConstraints(c_cancle,gck);
		f3.add(c_cancle);

	}
	public static void main(String args[])
	{
		new Add_customer();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//String msg=e.getActionCommand();
		if(e.getSource()==c_submit)
		{
			
			String name=c_name_t.getText();
			String fname=c_fathername_t.getText();
			String email=c_email_t.getText();
			String address=c_address_t.getText();
			String contact=c_contact_t.getText();

			String receipt=c_receipt_no_t.getText();
			String pay=c_payment_plan_t.getText();
			String gender=c_gender_l.getSelectedItem();
			Float height=Float.parseFloat(c_height_t.getText());
			int weight=Integer.parseInt(c_weight_t.getText());
			String remark=c_remark_t.getText();
			String member_cat=c_member_category_t.getSelectedItem();
			String trainer_name=c_trainer_name_t.getSelectedItem();
			
			try
			{
				Connectionclass con=new Connectionclass();
				
				String sql="insert into add_customer values('"+receipt+"','"+name+"','"+fname+"',"
						+ "'"+email+"','"+address+"','"+contact+"','"+receipt+"','"+pay+"','"+gender+"',"
						+ "'"+height+"','"+weight+"','"+remark+"','"+member_cat+"','"+trainer_name+"')";
				con.stm.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "Data inserted......");
				f3.dispose();
				
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "Check all data filled or not");
				System.out.println(e1);
			}
		}
	}

}
