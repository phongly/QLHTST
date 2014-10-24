/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Connection;
import POJO.MatHang;
import POJO.MatHangTon;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class MatHangTonDao {
    public List<MatHangTon> getAllMatHangTon(){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        List<MatHangTon> MatHangTons = new ArrayList<MatHangTon>();
        try{
            String query = "SELECT * FROM mathangton, mathang WHERE mamathang=mamh";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while( rs.next() )
            {
                MatHangTon ncc = new MatHangTon();
                ncc.setMaMHTon(rs.getInt("id"));
                ncc.setNhap(rs.getInt("nhap"));
                ncc.setXuat(rs.getInt("xuat"));
                ncc.setTonToiDa(rs.getInt("tontoida"));;
                ncc.setTonToiThieu(rs.getInt("tontoithieu"));
                ncc.setSoLuongTon(rs.getInt("soluongton"));
                ncc.setNgayNhapXuat(rs.getString("ngaynhapxuat"));
                ncc.setDonGiaNhap(rs.getBigDecimal("dongianhap"));
                ncc.setMaMaHang(rs.getInt("mamathang"));
                ncc.setMaKho(rs.getInt("makho"));
                ncc.setTenMH(rs.getString("tenmh"));
                
                MatHangTons.add(ncc);
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
        return MatHangTons;
    }
    
    public void AddMatHangTon(MatHangTon ncc){
        Connection dbConnection = null;
        Statement statement = null;
        

        String sql = "INSERT INTO mathangton(nhap, xuat, tontoida, tontoithieu, dongianhap, soluongton, ngaynhapxuat, makho, mamathang)VALUES('"
                                                    + ncc.getNhap()+ "','"
                                                    + ncc.getXuat()+ "','"
                                                    + ncc.getTonToiDa()+ "','"
                                                    + ncc.getTonToiThieu()+ "','"
                                                    + ncc.getDonGiaNhap()+ "','"
                                                    + ncc.getSoLuongTon()+ "','"
                                                    + ncc.getNgayNhapXuat()+ "','"
                                                    + ncc.getMaKho()+ "','"
                                                    + ncc.getMaMaHang()+ "')"                                                   
                                                  ;
//        MatHang MH = new MatHang();
//        MH.setMaMH(ncc.getMaMaHang());
//        MH.setTenMH(ncc.getTenMH());
//        MatHangDao MHDao = new MatHangDao();
//        MHDao.A
        try 
        {
            System.out.println(sql);
            Database db = new Database();
            dbConnection = db.connectDB();
            statement = dbConnection.createStatement();
            statement.executeUpdate(sql);
            
            System.out.println("Mot Mat hang ton da duoc them vao bang mathangton voi ma mat hang ton la la : " + ncc.getMaMHTon());
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
    
    public MatHangTon getMatHangTon(Integer MaNCC){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        try
        {
          String query = "SELECT * FROM mathangton, mat hang where mamathang=mamh AND id=" + MaNCC;
          stmt = con.createStatement();
          rs = stmt.executeQuery(query);
          while( rs.next() )
          {
            MatHangTon ncc = new MatHangTon();
            ncc.setMaMHTon(rs.getInt("id"));
            ncc.setNhap(rs.getInt("nhap"));
            ncc.setXuat(rs.getInt("xuat"));
            ncc.setTonToiDa(rs.getInt("tontoida"));
            ncc.setTonToiThieu(rs.getInt("tontoithieu"));
            ncc.setSoLuongTon(rs.getInt("soluongton"));
            ncc.setDonGiaNhap(rs.getBigDecimal("dongianhap"));
            ncc.setMaMaHang(rs.getInt("mamathang"));
            ncc.setMaKho(rs.getInt("makho"));
            ncc.setTenMH(rs.getString("tenmh"));
            
            return ncc;
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
    
    public void updateMatHangTon( MatHangTon nv )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "update mathangton set nhap=" + "'" + nv.getNhap()+ "'" + "where id="
                      + nv.getMaMHTon();

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Bang nhacungcap da duoc cap nhat cho nha cung cap co ma nha cung cap la : "
                        + nv.getMaMHTon());

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
    public void deleteMatHangTon( int  MaNV )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "delete from mathangton where id="+ MaNV;

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Mat hang ton duoc xoa trong bang mathangton voi ma mat hang ton : "
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
        MatHangTonDao nvdao = new  MatHangTonDao();
        List<MatHangTon> nvs = nvdao.getAllMatHangTon();
        
        for(MatHangTon ncc: nvs){
            System.out.println(ncc.getTenMH());
        }
    }
    
    
}
