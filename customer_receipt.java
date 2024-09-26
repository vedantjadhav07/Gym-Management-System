package gym_management_system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.border.Border;

import java.sql.*;

public class customer_receipt extends JFrame implements WindowListener  {
  
	
	    public customer_receipt() {
	        initComponents();
	    }

	    
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jProgressBar1 = new javax.swing.JProgressBar();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        jLabel6 = new javax.swing.JLabel();
	        jLabel7 = new javax.swing.JLabel();
	        jLabel8 = new javax.swing.JLabel();
	        jLabel9 = new javax.swing.JLabel();
	        jLabel10 = new javax.swing.JLabel();
	        jLabel11 = new javax.swing.JLabel();
	        jLabel12 = new javax.swing.JLabel();
	        jLabel13 = new javax.swing.JLabel();
	        jLabel14 = new javax.swing.JLabel();
	        jLabel15 = new javax.swing.JLabel();
	        jLabel16 = new javax.swing.JLabel();
	        jLabel17 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jLabel18 = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
	        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
	        jLabel1.setText("----CUSTOMER RECEIPT---");

	        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
	        jLabel2.setText("Name:-");

	        jLabel3.setText("---------------------------------------------------------------------------");

	        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
	        jLabel5.setText("Cutomer ID:");

	        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        jLabel6.setText("jLabel6");

	        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        jLabel7.setText("jLabel7");

	        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
	        jLabel8.setText("Address:");

	        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        jLabel9.setText("jLabel9");

	        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
	        jLabel10.setText("Contact no:");

	        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        jLabel11.setText("jLabel11");

	        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
	        jLabel12.setText("Payment Plan:");

	        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        jLabel13.setText("jLabel13");

	        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
	        jLabel14.setText("Member Category:");

	        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        jLabel15.setText("jLabel15");

	        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
	        jLabel16.setText("Fee");

	        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        jLabel17.setText("jLabel17");
	        this.addWindowListener(this);

	        jButton1.setBackground(new java.awt.Color(0, 204, 204));
	        jButton1.setText("Ok");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	                System.out.println("Oky customer search");
	                new customer_receipt();
	                dispose();
	            }
	        });

	        jButton2.setBackground(new java.awt.Color(255, 0, 51));
	        jButton2.setText("Cancle");
	        jButton2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					dispose();
					
					
				}
	        	
	        });

	        jLabel18.setText("--------------------------------------------------------------------------");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(37, 37, 37)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addGap(48, 48, 48)
	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
	                                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(23, 23, 23)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(21, 21, 21)
	                                .addComponent(jButton1)
	                                .addGap(18, 18, 18)
	                                .addComponent(jButton2))
	                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(72, 72, 72)
	                        .addComponent(jLabel1)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jLabel3)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(2, 2, 2)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel2)
	                            .addComponent(jLabel6)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jLabel4)))
	                .addGap(18, 18, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel5)
	                    .addComponent(jLabel7))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel8)
	                    .addComponent(jLabel9))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel10)
	                    .addComponent(jLabel11))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel12)
	                    .addComponent(jLabel13))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel14)
	                    .addComponent(jLabel15))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel16)
	                    .addComponent(jLabel17))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel18)
	                .addGap(18, 18, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1)
	                    .addComponent(jButton2))
	                .addGap(28, 28, 28))
	        );

	        pack();
	    }// </editor-fold>                        
       
	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    }                                        

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String args[]) {
	        /* Set the Nimbus look and feel */
	        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	         */
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(customer_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(customer_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(customer_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(customer_receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new customer_receipt().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	     javax.swing.JButton jButton1;
	     javax.swing.JButton jButton2;
	     javax.swing.JLabel jLabel1;
	     javax.swing.JLabel jLabel10;
	     javax.swing.JLabel jLabel11;
	     javax.swing.JLabel jLabel12;
	     javax.swing.JLabel jLabel13;
	     javax.swing.JLabel jLabel14;
	     javax.swing.JLabel jLabel15;
	     javax.swing.JLabel jLabel16;
	     javax.swing.JLabel jLabel17;
	     javax.swing.JLabel jLabel18;
	     javax.swing.JLabel jLabel2;
	     javax.swing.JLabel jLabel3;
	     javax.swing.JLabel jLabel4;
	     javax.swing.JLabel jLabel5;
	     javax.swing.JLabel jLabel6;
	     javax.swing.JLabel jLabel7;
	     javax.swing.JLabel jLabel8;
	     javax.swing.JLabel jLabel9;
	     javax.swing.JProgressBar jProgressBar1;
	    // End of variables declaration                   
		@Override
		public void windowOpened(WindowEvent e) {
			
			customer_search cs=new customer_search();
			int id=Integer.parseInt(cs.choice1.getSelectedItem());
        	System.out.println(id);
        	Connectionclass ob=new Connectionclass();
        	String q="select * from add_customer where Cutomer_id='"+id+"'";
        	try {
				ResultSet res=ob.stm.executeQuery(q);
                while(res.next())
                {
                	jLabel6.setText(res.getString("Name"));
        			jLabel7.setText(res.getString("Cutomer_id"));
        			jLabel9.setText(res.getString("Address"));
        			jLabel11.setText(res.getString("Contact_no"));
        			jLabel13.setText(res.getString("Payment_plan"));
        			jLabel15.setText(res.getString("Member_category"));
        			
        			
        		
                }
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	String q2="Select fees from pay_customer where Cutomer_id='"+id+"'";
        	try
        	{
        		ResultSet res2=ob.stm.executeQuery(q2);
        		while(res2.next())
        		{
        			jLabel17.setText(res2.getString("fees"));
        		}
        		
        	}
        	catch(Exception e2)
        	{
        		System.out.println(e);
        	}
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
