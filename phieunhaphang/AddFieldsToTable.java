/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phieunhaphang;
import javax.swing.table.DefaultTableModel;
import phieunhaphang.checkMissingField;
import phieunhaphang.ArrayHelper;

public class AddFieldsToTable {
    
    public AddFieldsToTable(){
        
    }
    
    public Boolean Add(String [] fields, DefaultTableModel model){
//                DefaultTableModel model = (DefaultTableModel) tbDSMathangTrongKho.getModel();
//        String fields[] = new String[]{tfMathang.getText(), tfTontoithieu.getText(), tfTontoida.getText()};
        Object[] fieldsObj = (Object[]) fields;
        
        Object[] rowData = ArrayHelper.appendValue(fieldsObj, false);
        checkMissingField chk = new checkMissingField();
//        if(!chk.checkMissingField(fields)){
//            model.addRow(rowData);
//        } else {
////            lMsg.setText("Bạn điền thiếu 1 hay nhiều fields.");
////            lMsg = new JLabel();
//        }
        return true;
    }
    
}
