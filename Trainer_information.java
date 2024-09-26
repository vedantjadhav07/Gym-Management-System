package gym_management_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class Trainer_information implements ActionListener {
    JFrame f6;
	JPanel p1,p2,p3;
	JTextField jt1;
	JButton btn;
	JLabel l1,c1;
	Font f1,f;
	JTable t;
	int i=0,j=0;
	String x[]= {"Trainer_id","Name","Fathername","Email","Address","Contact","Receipt_no","Payment_plan","Gender","Height","Weight","Remark,Member_category"};
	String y[][]=new String[30][15];
	public Trainer_information() {
		
		f6=new JFrame();
		f6.setLayout(new BorderLayout());
		f6.setVisible(true);
		f6.setSize(1920,800);
		 f6.setTitle("Trainer Information");
		
		// TODO Auto-generated constructor stub
		t=new JTable(y,x);
		t.setEnabled(false);
		t.setBackground(Color.black);
		t.setForeground(Color.white);
		JScrollPane sp= new JScrollPane(t);
		f1= new Font("Lucida Fax",Font.BOLD,25);
        f= new Font("MS UI GOTHIC",Font.BOLD,15);
        p1=new JPanel();
		l1=new JLabel("Delete any Tainer ?");
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setFont(f1);
		l1.setForeground(Color.yellow);
	    p1.add(l1);
	    
	    p2=new JPanel();
	    c1=new JLabel("Trainer_ID");
	    c1.setForeground(Color.GRAY);
		jt1=new JTextField();
		btn=new JButton("Delete Trainer");
		btn.addActionListener(this);
		 jt1.setFont(f);
         btn.setFont(f);
		p2.setLayout(new GridLayout(1,3,10,10));
		p2.add(c1);
		p2.add(jt1);
		p2.add(btn);
		
		p3=new JPanel();
		p3.setLayout(new GridLayout(2,1,10,10));
		p3.add(p1);
		p3.add(p2);
		
		p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);

		
		
		f6.add(sp);
		f6.add(p3,"South");
		
		 try
         {
             Connectionclass obj = new Connectionclass();
             String q= "select * from add_trainer";
             ResultSet rest = obj.stm.executeQuery(q);
             while (rest.next())
             {
                 y[i][j++]=rest.getString("Trainer_id");
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
                 
                 y[i][j++]=rest.getString("Membership_category");
           
                 i++;
                 j=0;
             }
         }
             catch(Exception e)
             {
           	  System.out.println(e);
             }
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  new Trainer_information();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
		{
			int id=Integer.parseInt(jt1.getText());
			try
			{
				Connectionclass ob=new Connectionclass();
				String q="delete from add_trainer where Trainer_id='"+id+"'";
				String p="delete from fee_trainer where Trainer_id='"+id+"'";
				ob.stm.execute(p);
				ob.stm.execute(q);
				f6.dispose();
				new Trainer_information();
				
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}

}
