/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.sql.Connection;
import POJO.ChiTietPhieuNhapKho;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChiTietPhieuNhapDao {
    public List<ChiTietPhieuNhapKho> getAllChiTietPhieu(){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        List<ChiTietPhieuNhapKho> ct_phieus = new ArrayList<ChiTietPhieuNhapKho>();
        try{
            String query = "SELECT * FROM chitietphieunhap";
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
    
    public void AddCTPhieu(ChiTietPhieuNhapKho ct_phieu){
        Connection dbConnection = null;
        Statement statement = null;
        
        String sql = "insert into ChiTietPhieuNhap values(," 
                                                    + ct_phieu.getMaNhapKho() + ","
                                                    + ct_phieu.getMaMatHang() + ","
                                                    + ct_phieu.getSoluong() + ","
                                                    + ct_phieu.getDonGia() + ","
                                                    + ct_phieu.getChietKhau()+ ")"
                                                  ;  
        try 
        {
            Database db = new Database();
            dbConnection = db.connectDB();
            statement = dbConnection.prepareStatement(sql);
            statement.executeUpdate(sql);
            System.out.println("Mot chi tiet phieu da duoc them vao bang chitietphieunhap voi ma chi tiet phieu la : " + ct_phieu.getMaCTPNhapKho());
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
    
    public ChiTietPhieuNhapKho getCTPhieuNhap(Integer MaCTPhieu){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        try
        {
          String query = "SELECT * FROM ChietTietPhieuNhap where mancc=" + MaCTPhieu;
          stmt = con.createStatement();
          rs = stmt.executeQuery(query);
          while( rs.next() )
          {
            ChiTietPhieuNhapKho ct_phieu = new ChiTietPhieuNhapKho();
            ct_phieu.setMaCTPNhapKho(rs.getInt("id"));
            ct_phieu.setMaNhapKho(rs.getInt("manhapkho"));
            ct_phieu.setMaMatHang(rs.getInt("mamathang"));
            ct_phieu.setSoluong(rs.getInt("soluong"));
            ct_phieu.setDonGia(rs.getInt("dongia"));
            ct_phieu.setChietKhau(rs.getInt("chietkhau"));
            ct_phieu.setNgayCapNhat(rs.getString("ngaycapnhat"));

            return ct_phieu;
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
    
    public void updateCTPhieu( ChiTietPhieuNhapKho ct_phieu )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "update chitietphieunhap set manhakho=" + "'" + ct_phieu.getMaNhapKho()+ "'" + "where id="
                      + ct_phieu.getMaCTPNhapKho();

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Bang chitietphieunhap da duoc cap nhat cho chi tiet phieu co ma : "
                        + ct_phieu.getMaCTPNhapKho());

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
    public void deleteCTPhieu( int  MaCT )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "delete from chitietphieunhap where id="+ MaCT;

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Mot Chi Tiet Phieu da duoc xoa voi ma chi tiet phieu la : "
                        + MaCT);

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
    
    public static void main(String[] args) throws SQLException {
                Database database = new Database();
        Connection con = database.connectDB();
                    String query = "SELECT * FROM chitietphieunhap";
                            Statement stmt = null;
        ResultSet rs = null;
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
//        ChiTietPhieuNhapDao nvdao = new ChiTietPhieuNhapDao();
//        List<ChiTietPhieuNhapKho> nvs = nvdao.getAllChiTietPhieu();
//        
//        for(ChiTietPhieuNhapKho ncc: nvs){
//            System.out.println(ncc.getNgayCapNhat());
//        }
    }
    
    
}
