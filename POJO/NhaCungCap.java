/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POJO;

import DAO.Database;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class NhaCungCap {
    private String MaNCC;
    private String TenNCC;
    private String DiaChi;
    private String SoDT;
    private String Fax;
    private String Email;

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

//    public ArrayList getListProducer(){
//        Database database = new Database();
//        database.connectDB();
//        ArrayList<NhaCungCap> listProducer = new ArrayList<>();
//        ResultSet result = database.executeQuery("Select * from \"NhaCungCap\"");
//        try{
//            while (result.next()){
//                NhaCungCap producer = new NhaCungCap();
//                producer.setMaNCC(result.getString("MaNCC"));
//                producer.setTenNCC(result.getString("TenNCC"));
//                //add code here
//                listProducer.add(producer);
//            }
//        }catch(Exception e){
//            
//        }
//        return listProducer;
//    }
    
}
