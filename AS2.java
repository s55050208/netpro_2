package webpage;


import java.io.*;
import java.util.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;



/**
 *
 * @author Sutticha
 */
public class webpage extends javax.swing.JFrame {
static String[] sLink = new String[100];
static int count=0;
static int cot=1;
static String x;

    /**
     * Creates new form webpage
     */
    public webpage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kritchat Rojanaphruk s5050208@kmitl.ac.th  - Java Web Browser (Network Programming Class Assignment)");

        jButton1.setText("get link");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        jScrollPane2.setViewportView(jTextPane2);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel2.setText("Thread");

        jLabel3.setText("HTTP header");

        jLabel1.setText("URL1");

        jLabel4.setText("URL2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(226, 226, 226)
                        .addComponent(jLabel4)
                        .addGap(223, 223, 223))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
                RunnableDemo R1 = new RunnableDemo( "left");
                R1.start();
                RunnableDemo R2 = new RunnableDemo( "right");
                R2.start();
       
        
         /*String tLink = jTextField1.getText();
        count++;
        sLink[count] = tLink;
        try {
        jTextPane1.setPage(sLink[count]);
        }
         catch (IOException e) {
        jTextPane1.setContentType("text/html");
        jTextPane1.setText("<html>Could not load "+tLink+" </html>");
        } */
    
    }                                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
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
            java.util.logging.Logger.getLogger(webpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(webpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(webpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(webpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new webpage().setVisible(true);
                
                
            }
        });
        
        
        
        
    }
    


   private class RunnableDemo extends webpage implements Runnable {
   private Thread t;
   private String threadName;
   
   RunnableDemo( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
       jTextArea1.append("Creating " +  threadName+"\n");
       //x=jTextArea1.getText();
       
   }
   
   public void run()  {
      System.out.println("Running " +  threadName );
      
      jTextArea1.append("Running " +  threadName+"\n" );
      
      try {
         for(int i = 1; i <=1; i++) {
            System.out.println("Thread: " + threadName + ", " + "getLink");
           
            
             jTextArea1.append("Thread: " + threadName + ", " + "getLink\n");
             
            getLink(threadName);

            Thread.sleep(50);
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
         
         jTextArea1.append("Thread " +  threadName + " interrupted.\n");
         
     }
     System.out.println("Thread " +  threadName + " exiting.");
     
     jTextArea1.append("Thread " +  threadName + " exiting.\n");
     
   }
   
   public void start ()
   {
      System.out.println("Starting " +  threadName );
      jTextArea1.append("Starting " +  threadName +"\n");
      
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
         
      }
   }
   public void getLink(String name)
   {
       
       String tLink;
       
       if(cot==1)
       {tLink = jTextField1.getText(); cot++;
       System.out.println(name+" show"+tLink);
       jTextArea1.append(name+" show "+tLink+"\n");
        count++;
        sLink[count] = tLink;
        try {
        jTextPane1.setPage(sLink[count]);
        count++;
        }
         catch (IOException e) {
        jTextPane1.setContentType("text/html");
        jTextPane1.setText("<html>Could not load "+tLink+" </html>");
        } 
        
        
        try {
 
            URL obj = new URL(tLink);
            URLConnection conn = obj.openConnection();
            Map<String, List<String>> map = conn.getHeaderFields();
 
            System.out.println("Printing All Response Header for URL: "
                    + obj.toString() + "\n");
            jTextArea2.append("Printing All Response Header for URL: "
                    + obj.toString() + "\n");
 
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                jTextArea2.append(entry.getKey() + " : " + entry.getValue()+"\n");
            }
 
            System.out.println("\nGet Response Header By Key ...\n");
            jTextArea2.append("\nGet Response Header By Key ...\n");
            List<String> contentLength = map.get("Content-Length");
 
            if (contentLength == null) {
                System.out
                .println("'Content-Length' doesn't present in Header!");
                jTextArea2.append("'Content-Length' doesn't present in Header!\n");
            } else {
                for (String header : contentLength) {
                    System.out.println("Content-Lenght: " + header);
                     jTextArea2.append("\nContent-Lenght: " + header);
                }
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
       }
        else
       { tLink = jTextField2.getText();
        System.out.println(name+" show"+tLink);
        jTextArea1.append(name+" show "+tLink+"\n");
         count++;
         sLink[count] = tLink;
         try {
         jTextPane2.setPage(sLink[count]);
         }
         catch (IOException e) {
         jTextPane2.setContentType("text/html");
         jTextPane2.setText("<html>Could not load "+tLink+" </html>");
        } 
       
       
         try {
 
            URL obj = new URL(tLink);
            URLConnection conn = obj.openConnection();
            Map<String, List<String>> map = conn.getHeaderFields();
 
            System.out.println("Printing All Response Header for URL: "
                    + obj.toString() + "\n");
            jTextArea2.append("Printing All Response Header for URL: "
                    + obj.toString() + "\n");
 
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                jTextArea2.append(entry.getKey() + " : " + entry.getValue()+"\n");
            }
 
            System.out.println("\nGet Response Header By Key ...\n");
            jTextArea2.append("\nGet Response Header By Key ...\n");
            List<String> contentLength = map.get("Content-Length");
 
            if (contentLength == null) {
                System.out
                .println("'Content-Length' doesn't present in Header!");
                jTextArea2.append("'Content-Length' doesn't present in Header!\n");
            } else {
                for (String header : contentLength) {
                    System.out.println("Content-Lenght: " + header);
                     jTextArea2.append("\nContent-Lenght: " + header);
                }
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
         
         
       }
   }
}
   
        

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration                   
}
