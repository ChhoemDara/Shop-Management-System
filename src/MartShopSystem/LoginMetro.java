/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MartShopSystem;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class LoginMetro extends javax.swing.JFrame {

    /**
     * @return the xx
     */
    public int getXx() {
        return xx;
    }

    /**
     * @param xx the xx to set
     */
    public void setXx(int xx) {
        this.xx = xx;
    }

    /**
     * @return the xy
     */
    public int getXy() {
        return xy;
    }

    /**
     * @param xy the xy to set
     */
    public void setXy(int xy) {
        this.xy = xy;
    }

    /**
     * Creates new form LoginMetro
     */
    public LoginMetro() {
        initComponents();
        pnlOverlay.setBackground(new Color(0, 0, 0, 200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        second = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        pnlOverlay = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbExit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUserName = new subjtextfiledsk15.SubJTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        cmdSignin = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        pnlLoader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));

        second.setBackground(new java.awt.Color(255, 255, 255));
        second.setLayout(new java.awt.CardLayout());

        pnlLogin.setBackground(new java.awt.Color(32, 33, 35));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOverlay.setBackground(new java.awt.Color(0, 0, 0));
        pnlOverlay.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlOverlayMouseDragged(evt);
            }
        });
        pnlOverlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlOverlayMousePressed(evt);
            }
        });
        pnlOverlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Point Of Sale");
        pnlOverlay.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Learning Design, Create awesome Swing UI");
        pnlOverlay.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        pnlLogin.add(pnlOverlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 640));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bb.jpg"))); // NOI18N
        pnlLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Login");
        pnlLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UserName");
        pnlLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        lbExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbExit.setForeground(new java.awt.Color(255, 255, 255));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconbarCube/Exit (2).png"))); // NOI18N
        lbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        pnlLogin.add(lbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 40, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Facebook_30px_1.png"))); // NOI18N
        pnlLogin.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Instagram_30px.png"))); // NOI18N
        pnlLogin.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Google_30px_1.png"))); // NOI18N
        pnlLogin.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, -1, -1));

        txtUserName.setBackground(pnlLogin.getBackground());
        txtUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });
        pnlLogin.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 330, 40));

        txtPassword.setBackground(pnlLogin.getBackground());
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        pnlLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 330, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");
        pnlLogin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        cmdSignin.setBackground(new java.awt.Color(126, 87, 194));
        cmdSignin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmdSignin.setForeground(new java.awt.Color(255, 255, 255));
        cmdSignin.setText("Sign In");
        cmdSignin.setContentAreaFilled(false);
        cmdSignin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdSignin.setOpaque(true);
        cmdSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSigninActionPerformed(evt);
            }
        });
        pnlLogin.add(cmdSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 100, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Follow us more...");
        pnlLogin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Create New Account...,");
        pnlLogin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(62, 214, 246));
        jLabel16.setText("Sign Up ?");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlLogin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UserName");
        pnlLogin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Root", "Admin", "Sale" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlLogin.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 320, 30));

        second.add(pnlLogin, "card2");

        pnlLoader.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageGIF/spinner.gif"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(47, 195, 148));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Loading...");

        javax.swing.GroupLayout pnlLoaderLayout = new javax.swing.GroupLayout(pnlLoader);
        pnlLoader.setLayout(pnlLoaderLayout);
        pnlLoaderLayout.setHorizontalGroup(
            pnlLoaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoaderLayout.createSequentialGroup()
                .addGroup(pnlLoaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoaderLayout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoaderLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1986, 1986, 1986))
        );
        pnlLoaderLayout.setVerticalGroup(
            pnlLoaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoaderLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addGap(47, 47, 47))
        );

        second.add(pnlLoader, "card3");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(second, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(second, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(915, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int xx,xy;
    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        try{
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lbExitMouseClicked

    private void pnlOverlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOverlayMousePressed
        try{
            xx=evt.getX();
            xy=evt.getY();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlOverlayMousePressed

    private void pnlOverlayMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOverlayMouseDragged
        try{
            int x=evt.getXOnScreen();
            int y=evt.getYOnScreen();
            this.setLocation(x-xx, y-xy);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlOverlayMouseDragged

    private void cmdSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSigninActionPerformed
        try{
            String server="localhost";
            String db="dbmart";
            String user=txtUserName.getText();
            String pass=String.valueOf(txtPassword.getPassword());
            DataCon.connectionDB(server, db, user, pass);
            Statement s=DataCon.getDataCon().createStatement();
            ResultSet r=s.executeQuery("select * from tbluserlogin where usUsername='"+user+"' and usPassword='"+pass+"'");
            
            pnlLoader.setVisible(true);
            pnlLogin.setVisible(false);
            if(r.next()){
                new java.util.Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    MainFrame.main(null);
                    dispose();
                }
                },1000*5);
            }else{
                new java.util.Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    LoginMetro msl=new LoginMetro();
                    msl.setVisible(true);
                    dispose();
   
                    }
                },1000*5);
                //JOptionPane.showMessageDialog(this, "Incorrect User and Password");
            }
            r.close();
            s.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSigninActionPerformed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        try{
            if(evt.getKeyChar()==10)
                txtPassword.grabFocus();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        try{
            if(evt.getKeyChar()==10)
                cmdSignin.grabFocus();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyTyped

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMetro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton cmdSignin;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbExit;
    private javax.swing.JPanel pnlLoader;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlOverlay;
    private javax.swing.JPanel second;
    private javax.swing.JPasswordField txtPassword;
    private subjtextfiledsk15.SubJTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
