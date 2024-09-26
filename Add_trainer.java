package gym_management_system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Add_trainer implements ActionListener {
   JFrame f4;
	JLabel t_welcome,t_name,t_fathername,t_email,t_addres,t_contact,t_receipt_no,t_payment_plan,
	t_gender,t_height,t_weight,t_remark,t_member_category,t_img;
    JTextField t_name_t,t_fathername_t,t_email_t,t_address_t,t_contact_t,t_receipt_no_t,t_payment_plan_t,
	t_height_t,t_weight_t,t_remark_t;
     JButton t_submit,t_cancle;
     Choice t_gender_l,t_member_category_t;
     GridBagConstraints gck=new GridBagConstraints();
 	GridBagLayout gb=new GridBagLayout();


	public Add_trainer() {
		// TODO Auto-generated constructor stub
		f4=new JFrame();
		f4.setVisible(true);
		f4.setSize(800,900);
		f4.setLayout(gb);
		f4.setBackground(Color.BLUE);
		f4.setTitle("ADD Trainer");
		f4.setLocationRelativeTo(null);
		

        

  		t_welcome=new JLabel("Welcome Trainer");

		t_welcome.setForeground(Color.orange);
        t_welcome.setFont(new Font("Arial", Font.BOLD, 20));
		gck.gridx=0;
		gck.gridy=0;
		
		gck.gridwidth=3;
		gb.setConstraints(t_welcome,gck);
		f4.add(t_welcome);

		ImageIcon imgf3=new ImageIcon("G:\\vedant\\5th semester\\Advanced Java Programming\\eclipce java code\\gym_management_system\\src\\gym_management_system\\customer.jpg");
        t_img=new JLabel(imgf3);
		//c_img.setForeground(Color.green);
		gck.gridx=0;
		gck.gridy=1;
	    gck.gridwidth=1;
		gck.gridheight=13;
		gb.setConstraints(t_img,gck);
		f4.add(t_img);
		gck.gridheight=1;



		t_name=new JLabel("Name");
		t_name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_name.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=1;
		gck.ipadx=10;
	    gck.ipady=10;
		gck.gridwidth=1;
		gck.insets=new Insets(10,10,10,10);
	    gb.setConstraints(t_name,gck);
		f4.add(t_name);
	

		t_name_t=new JTextField(20);
		t_name_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=1;
		gck.ipadx=10;
	    gck.ipady=10;
		gck.insets=new Insets(10,10,10,10);
		gck.gridwidth=1;
	    gb.setConstraints(t_name_t,gck);
		f4.add(t_name_t);

		t_fathername=new JLabel("Father's Name");
		t_fathername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_fathername.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=2;
		gck.ipadx=10;
	    gck.ipady=10;
		gck.gridwidth=1;
	    gb.setConstraints(t_fathername,gck);
		f4.add(t_fathername);

		t_fathername_t=new JTextField(20);
		t_fathername_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=2;
		gck.gridwidth=1;
	    gb.setConstraints(t_fathername_t,gck);
		f4.add(t_fathername_t);

		t_email=new JLabel("Email");
		t_email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_email.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=3;
		gck.gridwidth=1;
	    gb.setConstraints(t_email,gck);
		f4.add(t_email);

		t_email_t=new JTextField(20);
		t_email_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=3;
		gck.gridwidth=1;
	    gb.setConstraints(t_email_t,gck);
		f4.add(t_email_t);
		t_email_t.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e)
			{
				String email=t_email_t.getText();
				String email_reg="^[a-zA-Z0-9_+&*-]+(?:\\."+"a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.) [a-zA-Z]{2,7}$";
				if(email.matches(email_reg)==false)
				{
					JOptionPane.showMessageDialog(null, "Enter valid Email ID");

				}
						
			}
		});


		t_addres=new JLabel("Address");
		t_addres.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_addres.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=4;
		gck.gridwidth=1;
	    gb.setConstraints(t_addres,gck);
		f4.add(t_addres);

		t_address_t=new JTextField(20);
		t_address_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=4;
		gck.gridwidth=1;
	    gb.setConstraints(t_address_t,gck);
		f4.add(t_address_t);

		t_contact=new JLabel("Contact no.");
		t_contact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_contact.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=5;
		gck.gridwidth=1;
	    gb.setConstraints(t_contact,gck);
		f4.add(t_contact);

		t_contact_t=new JTextField(20);
		t_contact_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=5;
		gck.gridwidth=1;
	    gb.setConstraints(t_contact_t,gck);
		f4.add(t_contact_t);
		t_contact_t.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e)
			{
				String contact=t_contact_t.getText();
				String contact_reg="\\d{10}";
				if(contact.matches(contact_reg)==false)
				{
					JOptionPane.showMessageDialog(null, "Enter valid contact number");

				}
						
			}
		});

		t_receipt_no=new JLabel("Receipt_no");
		t_receipt_no.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_receipt_no.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=6;
		gck.gridwidth=1;
	    gb.setConstraints(t_receipt_no,gck);
		f4.add(t_receipt_no);
		

		t_receipt_no_t=new JTextField(20);
		t_receipt_no_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=6;
		gck.gridwidth=1;
	    gb.setConstraints(t_receipt_no_t,gck);
		f4.add(t_receipt_no_t);
t_receipt_no_t.addMouseListener(new MouseAdapter() {
			
			public void mouseExited(MouseEvent e)
			{
			int id=1;
			 id=Integer.parseInt(t_receipt_no_t.getText());
			Connectionclass ob=new Connectionclass();
			String q="select Trainer_id from add_trainer where Trainer_id='"+id+"'";
			ResultSet res;
			try {
				res = ob.stm.executeQuery(q);
				while(res.next())
				{
					if(id==1)
					{
						JOptionPane.showMessageDialog(null, "Enter receipt id");
                      
					if(res.getInt(1)==id)
					{
						JOptionPane.showMessageDialog(null, "Select another receipt id(already exits)");

					}
					}
					
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println(e1);
			}
			
			}
			
		});

		t_payment_plan=new JLabel("Payment Plan (Month)");
		t_payment_plan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_payment_plan.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=7;
		gck.gridwidth=1;
	    gb.setConstraints(t_payment_plan,gck);
		f4.add(t_payment_plan);

		t_payment_plan_t=new JTextField(20);
		t_payment_plan_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=7;
		gck.gridwidth=1;
	    gb.setConstraints(t_payment_plan_t,gck);
		f4.add(t_payment_plan_t);

		t_gender=new JLabel("Gender");
		t_gender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_gender.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=8;
		gck.gridwidth=1;
	    gb.setConstraints(t_gender,gck);
		f4.add(t_gender);


		t_gender_l=new Choice();
		 t_gender_l.add("Male");
		 t_gender_l.add("Female");
		t_gender_l.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=8;
		gck.gridwidth=1;
		gck.fill=GridBagConstraints.HORIZONTAL;
	    gb.setConstraints(t_gender_l,gck);
		f4.add(t_gender_l);

		gck.fill=0;


		t_height=new JLabel("Height");
		t_height.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_height.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=9;
		gck.gridwidth=1;
	    gb.setConstraints(t_height,gck);
		f4.add(t_height);
		
		t_height_t=new JTextField(20);
		t_height_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=9;
		gck.gridwidth=1;
	    gb.setConstraints(t_height_t,gck);
		f4.add(t_height_t);

		t_weight=new JLabel("Weight");
		t_weight.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_weight.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=10;
		gck.gridwidth=1;
	    gb.setConstraints(t_weight,gck);
		f4.add(t_weight);

		t_weight_t=new JTextField(20);
        t_weight_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=10;
		gck.gridwidth=1;
	    gb.setConstraints(t_weight_t,gck);
		f4.add(t_weight_t);

		t_remark=new JLabel("Remark");
		t_remark.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_remark.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=11;
		gck.gridwidth=1;
	    gb.setConstraints(t_remark,gck);
		f4.add(t_remark);

	    t_remark_t=new JTextField(20);
		t_remark_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=11;
		gck.gridwidth=1;
	    gb.setConstraints(t_remark_t,gck);
		f4.add(t_remark_t);


		t_member_category=new JLabel("Membership Category");
		t_member_category.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_member_category.setForeground(Color.BLUE);
		gck.gridx=1;
		gck.gridy=12;
		gck.gridwidth=1;
	    gb.setConstraints(t_member_category,gck);
		f4.add(t_member_category);

		t_member_category_t=new Choice();
		t_member_category_t.add("Public");
		t_member_category_t.add("Private");
		t_member_category_t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gck.gridx=2;
		gck.gridy=12;
		gck.gridwidth=1;
		gck.gridheight=1;
		gck.fill=GridBagConstraints.HORIZONTAL;

	    gb.setConstraints(t_member_category_t,gck);
		f4.add(t_member_category_t);

		

        t_submit=new JButton("Submit");
		t_submit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t_submit.addActionListener(this);
		gck.gridx=1;
		gck.gridy=14;
		gck.gridwidth=1;
		gck.fill=GridBagConstraints.HORIZONTAL;
	    gb.setConstraints(t_submit,gck);
		f4.add(t_submit);
		
		t_cancle=new JButton("Cancle");
		t_cancle.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		t_cancle.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e)
			{
				f4.dispose();
			}
		});
		gck.gridx=2;
		gck.gridy=14;
		gck.gridwidth=1;
		gck.insets=new Insets(10,40,10,40);
	    gb.setConstraints(t_cancle,gck);
		f4.add(t_cancle);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Add_trainer();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==t_submit)
		{
			String name=t_name_t.getText();
			String fname=t_fathername_t.getText();
			String email=t_email_t.getText();
			String address=t_address_t.getText();
			String contact=t_contact_t.getText();
			String receipt=t_receipt_no_t.getText();
			String pay=t_payment_plan_t.getText();
			String gender=t_gender_l.getSelectedItem();
			Float height=Float.parseFloat(t_height_t.getText());
			int weight=Integer.parseInt(t_weight_t.getText());
			String remark=t_remark_t.getText();
			String member_cat=t_member_category_t.getSelectedItem();
			
			try
			{
				Connectionclass con=new Connectionclass();
				
				String sql="insert into add_trainer values('"+receipt+"','"+name+"','"+fname+"',"
						+ "'"+email+"','"+address+"','"+contact+"','"+receipt+"','"+pay+"','"+gender+"',"
						+ "'"+height+"','"+weight+"','"+remark+"','"+member_cat+"')";
				con.stm.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "Data inserted......");
				f4.dispose();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}

}
