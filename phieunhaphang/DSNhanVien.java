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

public class DSNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public DSNhanVien() {
        initComponents();
        loadTableNhanVien();
        
    }
    public DSNhanVien(JFrame callingFrame) {
        initComponents();
        loadTableNhanVien();
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

        jDatePickerUtil1 = new net.sourceforge.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new net.sourceforge.jdatepicker.util.JDatePickerUtil();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        dpNgaySinh = new phieunhaphang.jDatePickerPanel();
        btChonNhanVien = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfNhanVien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfDiaChi = new javax.swing.JTextField();
        tfSoDT = new javax.swing.JTextField();
        btThem = new javax.swing.JButton();
        btHuy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lMsg = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDSNhanVien = new javax.swing.JTable();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btChonNhanVien.setText("Chon");
        btChonNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChonNhanVienActionPerformed(evt);
            }
        });

        btXoa.setText("Xoa");

        jLabel1.setText("Tên Nhân Viên:");

        jLabel2.setText("Địa Chỉ:");

        jLabel3.setText("Số Điện Thoại:");

        jLabel4.setText("Ngày Sinh:");

        tfDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiaChiActionPerformed(evt);
            }
        });

        btThem.setText("Them");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btHuy.setText("Huy Chon");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel5.setText("Danh Sách Nhân Viên");

        lMsg.setForeground(new java.awt.Color(255, 0, 0));
        lMsg.setText("message");

        tbDSNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nhân viên", "Địa Chỉ", "Điên Thoại", "Ngày Sinh", "Mã Nhân viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbDSNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btChonNhanVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btHuy)
                        .addGap(44, 44, 44)
                        .addComponent(lMsg)
                        .addGap(293, 293, 293)
                        .addComponent(btXoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btThem)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tfNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(22, 22, 22)
                                .addComponent(tfSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(63, 63, 63)))
                .addGap(0, 129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(dpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btThem)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btChonNhanVien)
                    .addComponent(btHuy)
                    .addComponent(lMsg)
                    .addComponent(btXoa))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
 
        DefaultTableModel model = (DefaultTableModel) tbDSNhanVien.getModel();
        NhanVien NV = new NhanVien();
        NV.setTenNV(tfNhanVien.getText());
        NV.setDiaChi(tfDiaChi.getText());
        NV.setSoDT(tfSoDT.getText());
        NV.setNgaySinh("");
        
        String fields[] = new String[]{tfNhanVien.getText(), tfDiaChi.getText(), tfSoDT.getText()
                                        };
        Object[] fieldsObj = (Object[]) fields;
        
        Object[] rowData = ArrayHelper.appendValue(fieldsObj, false);
        checkMissingField chk = new checkMissingField();
        lMsg.setText("");
        if(!chk.checkMissingField(fields)){
            NhanVienDao NCCDao = new NhanVienDao();
            NCCDao.AddNhanvien(NV);
            model.setRowCount(0);
            loadTableNhanVien();

        } else {
            lMsg.setText("Bạn điền thiếu 1 hay nhiều fields.");
//            lMsg = new JLabel();
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void tfDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiaChiActionPerformed

    private void btChonNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonNhanVienActionPerformed
        // TODO add your handling code here:
        NhanVien NV;
        NhanVienDao NVDao = new NhanVienDao();
        DefaultTableModel model = (DefaultTableModel) tbDSNhanVien.getModel();
        int index = tbDSNhanVien.getSelectedRow();
        if(index != -1){
           Integer MaNV =  Integer.parseInt(model.getValueAt(index, 4).toString());
           System.out.println(MaNV);
           NV = NVDao.getNhanvien(MaNV);
           System.out.println(NV.getTenNV());
           PhieunhaphangFrame PNH = (PhieunhaphangFrame)this.callingFrame;
           PNH.NhanVien = NV;
           PNH.tfNhanvien.setText(PNH.NhanVien.getTenNV());
        }
        this.dispose();
    }//GEN-LAST:event_btChonNhanVienActionPerformed

    private void loadTableNhanVien() {
        NhanVienDao nccdao = new NhanVienDao();
        List<NhanVien> NhanViens = nccdao.getAllNhanvien();
                
        DefaultTableModel model = (DefaultTableModel) tbDSNhanVien.getModel();
        int i = 0;
        for(NhanVien NhanVien: NhanViens){
            List<String> fields= new ArrayList<String>();
            fields.add(NhanVien.getTenNV());
            fields.add(NhanVien.getDiaChi());
            fields.add(NhanVien.getSoDT());
            fields.add(NhanVien.getNgaySinh());
            fields.add(NhanVien.getMaNV());

            model.addRow(fields.toArray());
        }
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
            java.util.logging.Logger.getLogger(DSNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSNhanVien().setVisible(true);
            }
        });
    }

    private JFrame callingFrame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChonNhanVien;
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private phieunhaphang.jDatePickerPanel dpNgaySinh;
    private net.sourceforge.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private net.sourceforge.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lMsg;
    public javax.swing.JTable tbDSNhanVien;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfNhanVien;
    private javax.swing.JTextField tfSoDT;
    // End of variables declaration//GEN-END:variables
}
