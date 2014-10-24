/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author admin
 */
public class Database {
    private String conString;
    private String character;
    private String user;
    private String pass;
    private Connection connection; 
    private String driver;
    
    public Database(){
        conString="jdbc:postgresql://localhost:5432/QuanLyHeThongSieuThi";
        character = "utf8";
        user = "postgres";
        pass = "root";
    }
    
    public Database(String filePath) {
        try{
            Properties prop = new Properties();
            prop.load(new FileInputStream(filePath));
            
            
            String ip = prop.getProperty("db_ip");
            String db_name = prop.getProperty("db_name");
            String port = prop.getProperty("db_port");
            
            user = prop.getProperty("db_username");
            pass = prop.getProperty("db_password");     
            if(driver.equals("postgres")){
                driver = "org.postgresql.Driver";
                conString = "jdbc:" + driver + "://" + ip + ":" + port + "/" + db_name;
            }
        } catch(IOException ex){
            
        }

        
    }
    
    public Database(String conString, String character, String user, String pass){
        this.conString = conString;
        this.character = character;
        this.user = user;
        this.pass = pass;
    }
    public Connection connectDB(){
        try{
            Class.forName("org.postgresql.Driver");
        }catch(Exception e){
            
        }
        Properties info = new Properties();
        info.setProperty("characterEncoding", character);
        info.setProperty("user", user);
        info.setProperty("password", pass);
        try{
            connection =DriverManager.getConnection(conString, info);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
    
    public ResultSet executeQuery(String sql){
        ResultSet rs=null;
        
        //ArrayList <NhanVien>ds=new ArrayList<NhanVien>();
        try{
            Statement sm=this.connection.createStatement();
            rs=sm.executeQuery(sql);
            while (rs.next()){
//                NhanVien nhanvien=new NhanVien();
//                nhanvien.setMaNV(rs.getString("MaNV"));
//                nhanvien.setTenNV(rs.getString("TenNV"));
//               
//                nhanvien.setSoDT(rs.getString("SoDT"));
//                nhanvien.setTenNV("hghj");
//                ds.add(pb);
                
                System.out.println(rs.getString("TenNV"));
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return rs;
    }
}
