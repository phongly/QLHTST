/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.sql.Connection;
import POJO.NhanVien;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDao {
    public List<NhanVien> getAllNhanvien(){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        List<NhanVien> NhanViens = new ArrayList<NhanVien>();
        try{
            String query = "SELECT * FROM nhanvien ORDER BY manv DESC";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while( rs.next() )
            {
                NhanVien nv = new NhanVien();
                nv.setTenNV(rs.getString("TenNv"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setSoDT(rs.getString("SoDT"));
                nv.setMaChucVu(rs.getString("MaChucVu"));
                nv.setNgaySinh(rs.getString("NgaySinh"));
                nv.setMaNV(rs.getString("MaNV"));
                NhanViens.add(nv);
            }
        }catch( SQLException e )
        {
          e.printStackTrace();
        }
    
        finally
        {
          try
          {
            if( con != null )
            {
              con.close();
            }
            if( stmt != null )
            {
              stmt.close();
            }
            if( rs != null )
            {
              rs.close();
            }
          }
          catch( Exception exe )
          {
            exe.printStackTrace();
          }

        }
        return NhanViens;
    }
    
    public void AddNhanvien(NhanVien nv){
        Connection dbConnection = null;
        Statement statement = null;
        
        String sql = "INSERT INTO nhanvien(tennv, diachi, sodt, machucvu, ngaysinh) values('" 
                                                    + nv.getTenNV() + "','"
                                                    + nv.getDiaChi() + "','"
                                                    + nv.getSoDT() + "','"
                                                    + nv.getMaChucVu() + "','"
                                                    + nv.getNgaySinh() + "')"
                                                  ;  
        try 
        {
            Database db = new Database();
            dbConnection = db.connectDB();
            statement = dbConnection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Mot nhan vien da duoc them vao bang nhanvien dao la nhan vien : " + nv.getTenNV());
        }catch( SQLException e )
        {

          e.printStackTrace();

        }
        finally
        {

          if( statement != null )
          {
            try
            {
              statement.close();
            }
            catch( SQLException e )
            {
              e.printStackTrace();
            }
          }

          if( dbConnection != null )
          {
            try
            {
              dbConnection.close();
            }
            catch( SQLException e )
            {
              e.printStackTrace();
            }
          }

        }
    }
    
    public NhanVien getNhanvien(Integer Manv){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        try
        {
          String query = "SELECT * FROM nhanvien where manv=" + Manv;
          stmt = con.createStatement();
          rs = stmt.executeQuery(query);
          while( rs.next() )
          {
            NhanVien nv = new NhanVien();
            nv.setTenNV(rs.getString("TenNv"));
            nv.setDiaChi(rs.getString("DiaChi"));
            nv.setSoDT(rs.getString("SoDT"));
            nv.setMaChucVu(rs.getString("MaChucVu"));
            nv.setNgaySinh(rs.getString("NgaySinh"));
            return nv;
          }
        }
        catch( SQLException e )
        {
          e.printStackTrace();
        }

        finally
        {
          try
          {
            if( con != null )
            {
              con.close();
            }
            if( stmt != null )
            {
              stmt.close();
            }
            if( rs != null )
            {
              rs.close();
            }
          }
          catch( Exception exe )
          {
            exe.printStackTrace();
          }

        }
        return null;
    }
    
    public void updateNhanVien( NhanVien nv )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "update nhanvien set TenNV=" + "'" + nv.getTenNV()+ "'" + "where MaNV="
                      + nv.getMaNV();

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Bang nhanvien da duoc cap nhat cho nhan vien co ma nhan vien la : "
                        + nv.getMaNV());

      }
      catch( SQLException e )
      {

        e.printStackTrace();

      }
      finally
      {

        if( statement != null )
        {
          try
          {
            statement.close();
          }
          catch( SQLException e )
          {
            e.printStackTrace();
          }
        }

        if( dbConnection != null )
        {
          try
          {
            dbConnection.close();
          }
          catch( SQLException e )
          {
            e.printStackTrace();
          }
        }

      }
    }    
    public void deleteNhanVien( int  MaNV )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "delete from nhanvien where MaNV="+ MaNV;

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Nhan vien da duoc xoa trong bang nhanvien voi manv : "
                        + MaNV);

      }
      catch( SQLException e )
      {

        e.printStackTrace();

      }
      finally
      {

        if( statement != null )
        {
          try
          {
            statement.close();
          }
          catch( SQLException e )
          {
            e.printStackTrace();
          }
        }

        if( dbConnection != null )
        {
          try
          {
            dbConnection.close();
          }
          catch( SQLException e )
          {
            e.printStackTrace();
          }
        }

      }
    }
    
    public static void main(String[] args) {
        NhanVienDao nvdao = new NhanVienDao();
        List<NhanVien> nvs = nvdao.getAllNhanvien();
        for(NhanVien nv: nvs){
            System.out.println(nv.getTenNV());
        }
    }
    
    
}
