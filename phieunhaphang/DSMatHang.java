/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phieunhaphang;

import DAO.MatHangDao;
import DAO.NhaCCDao;
import POJO.MatHang;
import POJO.NhaCungCap;
//import POJO.NhaCungCap;
import java.util.*;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import phieunhaphang.ArrayHelper;
import phieunhaphang.checkMissingField;

public class DSMatHang extends javax.swing.JFrame {

    public DSMatHang(JFrame callingFrame) {
        this.callingFrame = callingFrame;
        initComponents();
        loadTableDSMH();
        lMsg.setText("");
    }
    
    public DSMatHang() {  
        initComponents();
        loadTableDSMH();
        lMsg.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btChonMathang = new javax.swing.JButton();
        btHuyChon = new javax.swing.JButton();
        tfMathang = new javax.swing.JTextField();
        btXoaMathang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btThemhang = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lMsg = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDSMathang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btChonMathang.setText("Chọn");
        btChonMathang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChonMathangActionPerformed(evt);
            }
        });

        btHuyChon.setText("Hủy Chọn");

        tfMathang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMathangActionPerformed(evt);
            }
        });

        btXoaMathang.setText("Xóa");
        btXoaMathang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaMathangActionPerformed(evt);
            }
        });

        jLabel1.setText("Mặt hàng");

        btThemhang.setText("Thêm");
        btThemhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemhangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 30)); // NOI18N
        jLabel4.setText("Danh Sách Mặt Hàng");

        lMsg.setForeground(new java.awt.Color(255, 0, 0));
        lMsg.setText("message");

        tbDSMathang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Mặt Hàng", "Mã Mặt Hang"
            }
        ));
        jScrollPane2.setViewportView(tbDSMathang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(tfMathang, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(btThemhang))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btChonMathang)
                        .addGap(25, 25, 25)
                        .addComponent(btHuyChon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lMsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btXoaMathang)))
                .addGap(0, 93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMathang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThemhang)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btChonMathang)
                    .addComponent(btHuyChon)
                    .addComponent(lMsg)
                    .addComponent(btXoaMathang))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btChonMathangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonMathangActionPerformed
        MatHang MH;
        MatHangDao MatHangDao = new MatHangDao();
        DefaultTableModel model = (DefaultTableModel) tbDSMathang.getModel();
        int index = tbDSMathang.getSelectedRow();
        if(index != -1){
           Integer MaMH =  Integer.parseInt(model.getValueAt(index, 1).toString());
           System.out.println(MaMH);
           MH = MatHangDao.getMatHang(MaMH);
           System.out.println(MH.getTenMH());
           PhieunhaphangFrame PNH = (PhieunhaphangFrame)this.callingFrame;
           PNH.MatHang = MH;
           PNH.tfNhaCC.setText(PNH.MatHang.getTenMH());
        }
        this.dispose();
    }//GEN-LAST:event_btChonMathangActionPerformed

    private void tfMathangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMathangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMathangActionPerformed

    private void btThemhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemhangActionPerformed
        lMsg.setText("");
        DefaultTableModel model = (DefaultTableModel) tbDSMathang.getModel();
        String fields[] = new String[]{tfMathang.getText()};
        Object[] fieldsObj = (Object[]) fields;
        
        Object[] rowData = ArrayHelper.appendValue(fieldsObj, false);
        checkMissingField chk = new checkMissingField();
        if(!chk.checkMissingField(fields)){
            model.addRow(rowData);
        } else {
            lMsg.setText("Bạn điền thiếu 1 hay nhiều fields.");
//            lMsg = new JLabel();
        }
    }//GEN-LAST:event_btThemhangActionPerformed

    private void btXoaMathangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaMathangActionPerformed
           DefaultTableModel model = (DefaultTableModel) tbDSMathang.getModel();
           model.getValueAt(1, 2);
           if(tbDSMathang.getSelectedRow() == -1){
               if(tbDSMathang.getRowCount() == 0){
                   lMsg.setText("Bang dang trong");
               }else{
                   lMsg.setText("Xin chon hang");
               }
           }else{
               model.removeRow(tbDSMathang.getSelectedRow());
           }
    }//GEN-LAST:event_btXoaMathangActionPerformed

    private void loadTableDSMH(){
                MatHangDao mhDao = new MatHangDao();
        List<MatHang> MatHangs = mhDao.getAllMatHang();
                
        DefaultTableModel model = (DefaultTableModel) tbDSMathang.getModel();
        int i = 0;
        for(MatHang MatHang: MatHangs){
            List<String> fields= new ArrayList<String>();
            fields.add(MatHang.getTenMH());
            fields.add(MatHang.getMaMH().toString());
//            Object[] fieldsObj = (Object[]) fields;
            model.addRow(fields.toArray());
        }
    }
    
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
            java.util.logging.Logger.getLogger(DSMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSMatHang().setVisible(true);
            }
        });
    }

    private JFrame callingFrame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChonMathang;
    private javax.swing.JButton btHuyChon;
    private javax.swing.JButton btThemhang;
    private javax.swing.JButton btXoaMathang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lMsg;
    private javax.swing.JTable tbDSMathang;
    private javax.swing.JTextField tfMathang;
    // End of variables declaration//GEN-END:variables
}
