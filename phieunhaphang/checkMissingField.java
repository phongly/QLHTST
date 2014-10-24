/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phieunhaphang;

/**
 *
 * @author hai
 */
public class checkMissingField {
//    private Object[] objs;
    private checkMissingField ckMsField;
    
    public Boolean checkMissingField(String[] fields){
        for (String field : fields) {
            if (field.trim().equals("")) {
                return true;
            }
        }
        return false;
    }
}
