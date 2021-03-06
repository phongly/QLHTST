/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phieunhaphang;

import DAO.*;
import POJO.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import phieunhaphang.checkMissingField;
import phieunhaphang.ArrayHelper;

public class DSNhaCungCap extends javax.swing.JFrame {

    /**
     * Creates new form DSMatHang
     */
    public DSNhaCungCap(JFrame callingFrame) {
        this.callingFrame = callingFrame;
        initComponents();
        LoadTable();
        lMsg.setText("");
    }
    public DSNhaCungCap()
    {
        initComponents();
        LoadTable();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSNhaCC = new javax.swing.JTable();
        btChonNhaCC = new javax.swing.JButton();
        btHuyChon = new javax.swing.JButton();
        tfNhaCC = new javax.swing.JTextField();
        btXoaMathang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfDiaChi = new javax.swing.JTextField();
        tfDienThoai = new javax.swing.JTextField();
        btThemhang = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lMsg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfFax = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbDSNhaCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nhà Cung Cấp", "Địa Chỉ", "Điên Thoại", "Fax", "Email", "Ma Nha Cung Cap", "Xóa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDSNhaCC);

        btChonNhaCC.setText("Chọn");
        btChonNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChonNhaCCActionPerformed(evt);
            }
        });

        btHuyChon.setText("Hủy Chọn");

        tfNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNhaCCActionPerformed(evt);
            }
        });

        btXoaMathang.setText("Xóa");
        btXoaMathang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaMathangActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên Nhà Cung Cấp");

        jLabel2.setText("Địa Chỉ");

        jLabel3.setText("Điện Thoại");

        tfDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiaChiActionPerformed(evt);
            }
        });

        btThemhang.setText("Thêm");
        btThemhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemhangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 30)); // NOI18N
        jLabel4.setText("Danh Sách Nhà Cung Cấp");

        lMsg.setForeground(new java.awt.Color(255, 0, 0));
        lMsg.setText("message");

        jLabel5.setText("Fax");

        jLabel6.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btChonNhaCC)
                                .addGap(18, 18, 18)
                                .addComponent(btHuyChon)
                                .addGap(18, 18, 18)
                                .addComponent(btXoaMathang)
                                .addGap(18, 18, 18)
                                .addComponent(lMsg)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNhaCC, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(tfDiaChi)
                            .addComponent(tfDienThoai))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(tfFax)))
                            .addComponent(btThemhang))
                        .addContainerGap(72, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThemhang))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHuyChon)
                    .addComponent(btChonNhaCC)
                    .addComponent(btXoaMathang)
                    .addComponent(lMsg))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btChonNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonNhaCCActionPerformed
        // TODO add your handling code here:
        NhaCungCap NCC;
        NhaCCDao NCCDao = new NhaCCDao();
        DefaultTableModel model = (DefaultTableModel) tbDSNhaCC.getModel();
        int index = tbDSNhaCC.getSelectedRow();
        if(index != -1){
           Integer MaNhaCC =  Integer.parseInt(model.getValueAt(index, 5).toString());
           System.out.println(MaNhaCC);
           NCC = NCCDao.getNhaCC(MaNhaCC);
           System.out.println(NCC.getTenNCC());
           PhieunhaphangFrame PNH = (PhieunhaphangFrame)this.callingFrame;
           PNH.NhaCungCap = NCC;
           PNH.tfNhaCC.setText(PNH.NhaCungCap.getTenNCC());
           PNH.tfMathang.setText(PNH.NhaCungCap.getTenNCC());
        }
        this.dispose();
    }//GEN-LAST:event_btChonNhaCCActionPerformed

    private void tfNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNhaCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNhaCCActionPerformed

    private void tfDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiaChiActionPerformed

    private void btThemhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemhangActionPerformed

        
        DefaultTableModel model = (DefaultTableModel) tbDSNhaCC.getModel();
        NhaCungCap NCC = new NhaCungCap();
        NCC.setTenNCC(tfNhaCC.getText());
        NCC.setDiaChi(tfDiaChi.getText());
        NCC.setSoDT(tfDienThoai.getText());
        NCC.setFax(tfFax.getText());
        NCC.setEmail(tfEmail.getText());
        
        String fields[] = new String[]{tfNhaCC.getText(), tfDiaChi.getText(), tfDienThoai.getText(), 
                                        tfFax.getText(), tfEmail.getText()};
        Object[] fieldsObj = (Object[]) fields;
        
        Object[] rowData = ArrayHelper.appendValue(fieldsObj, false);
        checkMissingField chk = new checkMissingField();
        lMsg.setText("");
        if(!chk.checkMissingField(fields)){
            NhaCCDao NCCDao = new NhaCCDao();
            NCCDao.AddNhaCC(NCC);
            model.setRowCount(0);
            LoadTable();

        } else {
            lMsg.setText("Bạn điền thiếu 1 hay nhiều fields.");
//            lMsg = new JLabel();
        }
        
    }//GEN-LAST:event_btThemhangActionPerformed

    private void btXoaMathangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaMathangActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbDSNhaCC.getModel();
        List<Object> checkedRow = new ArrayList<Object>();
        
        for(int i = 0; i < model.getRowCount(); i++){
           
            Boolean checked = (Boolean)model.getValueAt(i, 5);
//            String value = (String)model.getValueAt(i, 5);
//            System.out.println(checked);
            if(!checked){
            } else {
                model.removeRow(i);
                i--;
            }
        }
    }//GEN-LAST:event_btXoaMathangActionPerformed

    public void ThemNhaCC(PhieunhaphangFrame PhieuNH){
//        DefaultTableModel model = (DefaultTableModel) tbDSMathangTrongKho.getModel();
//        
//        model.addRow(rowData);
//        PhieuNH.cbNhacungcap.
    }
    
    public void LoadTable(){
        
        NhaCCDao nccdao = new NhaCCDao();
        List<NhaCungCap> NhaCCs = nccdao.getAllNhaCC();
                
        DefaultTableModel model = (DefaultTableModel) tbDSNhaCC.getModel();
        int i = 0;
        for(NhaCungCap NhaCC: NhaCCs){
            List<String> fields= new ArrayList<String>();
            fields.add(NhaCC.getTenNCC());
            fields.add(NhaCC.getDiaChi());
            fields.add(NhaCC.getSoDT());
            fields.add(NhaCC.getFax());
            fields.add(NhaCC.getEmail());
            fields.add(NhaCC.getMaNCC());
//            Object[] fieldsObj = (Object[]) fields;
            model.addRow(fields.toArray());
        }
//        String fields[] = new String[]{tfMathang.getText(), tfTontoithieu.getText(), tfTontoida.getText()};
//        Object[] fieldsObj = (Object[]) fields;
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
            java.util.logging.Logger.getLogger(DSNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSNhaCungCap().setVisible(true);
            }
        });
    }

    private JFrame callingFrame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChonNhaCC;
    private javax.swing.JButton btHuyChon;
    private javax.swing.JButton btThemhang;
    private javax.swing.JButton btXoaMathang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMsg;
    public javax.swing.JTable tbDSNhaCC;
    public javax.swing.JTextField tfDiaChi;
    public javax.swing.JTextField tfDienThoai;
    public javax.swing.JTextField tfEmail;
    public javax.swing.JTextField tfFax;
    public javax.swing.JTextField tfNhaCC;
    // End of variables declaration//GEN-END:variables
}
