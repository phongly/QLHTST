/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import POJO.NhaCungCap;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author admin
 */
public class PhieuXuatKhoDao {
     public void Update(){
         Database database = new Database();
        database.connectDB();
        ArrayList<NhaCungCap> listProducer = new ArrayList<>();
        ResultSet result = database.executeQuery("Select * from \"NhaCungCap\"");
    }
}
