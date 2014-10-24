/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phieunhaphang;

import DAO.MatHangDao;
import POJO.MatHang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hai
 */
public class DSMat_Hang extends javax.swing.JFrame {



    
    public DSMat_Hang() {
        initComponents();
        loadTableDSMH();
        lMsg.setText("");
    }

    public DSMat_Hang(JFrame callingFrame) {      
        initComponents();
        loadTableDSMH();
        lMsg.setText("");
        this.callingFrame = callingFrame;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btChon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSMathang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfMatHang = new javax.swing.JTextField();
        btXoa = new javax.swing.JButton();
        btHuyChon = new javax.swing.JButton();
        btThem = new javax.swing.JButton();
        lMsg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btChon.setText("Chon");
        btChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChonActionPerformed(evt);
            }
        });

        tbDSMathang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mat Hang", "Ma Mat Hang"
            }
        ));
        jScrollPane1.setViewportView(tbDSMathang);

        jLabel1.setText("Ten Mat Hang");

        btXoa.setText("Xoa");

        btHuyChon.setText("Huy Chon");

        btThem.setText("Them");

        lMsg.setForeground(new java.awt.Color(255, 0, 51));
        lMsg.setText("message:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("Danh Sach Mat Hang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btThem))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btChon)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btHuyChon)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lMsg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btXoa))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel3)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThem))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXoa)
                    .addComponent(btChon)
                    .addComponent(btHuyChon)
                    .addComponent(lMsg))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonActionPerformed
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
           System.out.println("PHieu nhap hang " + PNH.MatHang.getTenMH());
           PNH.tfNhaCC.setText(PNH.MatHang.getTenMH());
//           PNH.tfNhaCC.setText("sao ko vo");
        }
        this.dispose();
    }//GEN-LAST:event_btChonActionPerformed

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
            java.util.logging.Logger.getLogger(DSMat_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSMat_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSMat_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSMat_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSMat_Hang().setVisible(true);
            }
        });
    }

    private JFrame callingFrame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChon;
    private javax.swing.JButton btHuyChon;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMsg;
    private javax.swing.JTable tbDSMathang;
    private javax.swing.JTextField tfMatHang;
    // End of variables declaration//GEN-END:variables
}
