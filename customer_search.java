package gym_management_system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;

import java.sql.*;

public class customer_search extends JFrame {

	
	    public customer_search() {
	        initComponents();
	    }

	   
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jLabel2 = new javax.swing.JLabel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        choice1 = new java.awt.Choice();
	        jTextField1 = new javax.swing.JTextField();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        try
		       {
		       Connectionclass obj =new Connectionclass();
	           String q= "select Cutomer_id from add_customer";
	           ResultSet rest = obj.stm.executeQuery(q);
	        while(rest.next())
	        {
	            choice1.add(rest.getString("Cutomer_id"));
	        }
	       }
	       catch(Exception ex)
	       {
	           ex.printStackTrace();
	       }
	        choice1.addMouseListener(new MouseAdapter()
		       {
		           @Override
		           public void mouseClicked(MouseEvent arg)
		           {
		               int id= Integer.parseInt(choice1.getSelectedItem());
		               try
		               {
		                   Connectionclass obj1 =new Connectionclass();
		                   String q1= "select Name from add_customer where Cutomer_id='"+id+"'";
		                   ResultSet rest1 = obj1.stm.executeQuery(q1);
		                   while(rest1.next())
		                   {
		                	   jTextField1.setText(rest1.getString("Name"));
		         
		                    }
		                   
		               }
		               catch(Exception exx)
		               {
		                   exx.printStackTrace();
		               }
		           }
		       });
		       
	       

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
	        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
	        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
	        jLabel2.setText("----CUSTOMER RECEIPT---");

	        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
	        jLabel1.setText("Customer ID:");

	        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
	        jLabel3.setText("Customer_Name");

	        jTextField1.setText("jTextField1");
	        jTextField1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTextField1ActionPerformed(evt);
	            }
	        });

	        jButton1.setBackground(new java.awt.Color(153, 255, 255));
	        jButton1.setText("Print");
	        jButton1.setActionCommand("Print");

	        jButton2.setBackground(new java.awt.Color(255, 51, 0));
	        jButton2.setText("Cancle");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                
	            	int id= Integer.parseInt(choice1.getSelectedItem());
	                new customer_receipt().setVisible(true);
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

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(27, 27, 27)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel3))
	                .addGap(55, 55, 55)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jButton1)
	                        .addGap(18, 18, 18)
	                        .addComponent(jButton2))
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                        .addComponent(choice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
	                .addContainerGap(58, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(97, 97, 97))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(16, 16, 16)
	                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(31, 31, 31)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel1)
	                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(24, 24, 24)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(38, 38, 38)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1)
	                    .addComponent(jButton2))
	                .addContainerGap(91, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
	    }                                           

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String args[]) {
	       
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(customer_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(customer_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(customer_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(customer_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	       
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new customer_search().setVisible(true);
	            }
	        });
	    }

	                    
	     java.awt.Choice choice1;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JTextField jTextField1;
	    // End of variables declaration                   
	}
