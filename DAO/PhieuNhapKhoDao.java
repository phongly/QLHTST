/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.sql.Connection;
import POJO.PhieuNhapKho;
import POJO.ChiTietPhieuNhapKho;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PhieuNhapKhoDao {
    public List<PhieuNhapKho> getAllPhieuNhap(){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        List<PhieuNhapKho> phieunhaps = new ArrayList<PhieuNhapKho>();
        try{
            String query = "SELECT * FROM phieunhapkho";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while( rs.next() )
            {
                PhieuNhapKho phieunhap = new PhieuNhapKho();
                
                phieunhap.setMaNhapKho(rs.getInt("id"));
                phieunhap.setMaNCC(rs.getInt("mancc"));
                phieunhap.setMaNV(rs.getInt("manv"));
                phieunhap.setMaKho(rs.getInt("makho"));
                phieunhap.setNgayNhap(rs.getString("ngaynhap"));
                phieunhap.setTinhTrang(rs.getString("tinhtrang"));
                phieunhaps.add(phieunhap);
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
        return phieunhaps;
    }
    
    public void AddPhieuNhap(PhieuNhapKho phieunhaps){
        Connection dbConnection = null;
        Statement statement = null;
        
        String sql = "insert into ChiTietPhieuNhap values(,"    
                                                    + phieunhaps.getMaNCC()+ ","
                                                    + phieunhaps.getMaNV()+ ","
                                                    + phieunhaps.getMaKho()+ ","
                                                    + phieunhaps.getNgayNhap()+ ","
                                                    + phieunhaps.getTongTriGia()+ ","                                                
                                                    + phieunhaps.getTinhTrang() +")"
                                                  ;  
        try 
        {
            Database db = new Database();
            dbConnection = db.connectDB();
            statement = dbConnection.prepareStatement(sql);
            statement.executeUpdate(sql);
            System.out.println("Mot phieu nhap da duoc them vao bang phieunhapkho voi ma chi tiet phieu la : " + phieunhaps.getMaNhapKho());
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
    
    public PhieuNhapKho getPhieuNhap(Integer MaPhieuNhap){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        try
        {
          String query = "SELECT * FROM phieunhapkho where id=" + MaPhieuNhap;
          stmt = con.createStatement();
          rs = stmt.executeQuery(query);
          while( rs.next() )
          {
            PhieuNhapKho phieunhaps = new PhieuNhapKho();
            phieunhaps.setMaNCC(rs.getInt("id"));
            phieunhaps.setMaNhapKho(rs.getInt("manhapkho"));
            phieunhaps.setMaNV(rs.getInt("manv"));
            phieunhaps.setMaKho(rs.getInt("makho"));
            phieunhaps.setNgayNhap(rs.getString("ngaynhap"));
            phieunhaps.setTinhTrang("tinhtrang");
            return phieunhaps;
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
    
    public void updatePhieuNhap( PhieuNhapKho phieunhaps )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "update chitietphieunhap set mancc=" + "'" + phieunhaps.getMaNCC()+ "'" + "where id="
                      + phieunhaps.getMaNhapKho();

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Bang chitietphieunhap da duoc cap nhat cho chi tiet phieu co ma : "
                        + phieunhaps.getMaNhapKho());

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
    public void deletePhieuNhap( int  MaPhieu )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "delete from phieunhapkho where id="+ MaPhieu;

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Mot Phieu Nhap da duoc xoa voi ma phieu nhap la : "
                        + MaPhieu);

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
    
   // public List<ChiTietPhieuNhapKho> getAllChiTietPhieuWithMaPhieuNhap(int MaPhieu){
    public List<ChiTietPhieuNhapKho> setAllCTPhieuNhapForPhieuNhap(PhieuNhapKho phieunhap){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        List<ChiTietPhieuNhapKho> ct_phieus = new ArrayList<ChiTietPhieuNhapKho>();
        try{
            String query = "SELECT * FROM chitietphieunhap where manhapkho=" + phieunhap.getMaNhapKho();
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while( rs.next() )
            {
                ChiTietPhieuNhapKho ct_phieu = new ChiTietPhieuNhapKho();
                
                ct_phieu.setChietKhau(rs.getInt("ChietKhau"));
                ct_phieu.setDonGia(rs.getInt("DonGia"));
                ct_phieu.setMaNhapKho(rs.getInt("MaNhapKho"));
                ct_phieu.setMaCTPNhapKho(rs.getInt("id"));
                ct_phieu.setMaMatHang(rs.getInt("MaMatHang"));
                ct_phieu.setSoluong(rs.getInt("SoLuong"));
                ct_phieu.setNgayCapNhat(rs.getString("NgayCapNhat"));
                ct_phieus.add(ct_phieu);
            }
            phieunhap.setDSCTPhieuNhap(ct_phieus);
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
        return ct_phieus;
    }
    
    public static void main(String[] args) {
        PhieuNhapKhoDao nvdao = new PhieuNhapKhoDao();
        List<PhieuNhapKho> nvs = nvdao.getAllPhieuNhap();
        
        for(PhieuNhapKho ncc: nvs){
            System.out.println(ncc.getNgayNhap());
        }
    }
    
    
}
