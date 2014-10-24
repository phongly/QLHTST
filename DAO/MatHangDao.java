/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Connection;
import POJO.MatHang;
import POJO.MatHangTon;
import POJO.NhanVien;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MatHangDao {
    public List<MatHang> getAllMatHang(){
        
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;

        List<MatHang> MHs = new ArrayList<MatHang>();
        try{
            String query = "SELECT * FROM mathang";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while( rs.next() )
            {
                MatHang mh = new MatHang();
                mh.setMaMH(rs.getInt("mamh"));
                mh.setTenMH(rs.getString("tenmh"));
                MHs.add(mh);
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
        return MHs;
    }
    public void AddMatHang(MatHang nv){
        Connection dbConnection = null;
        Statement statement = null;
        
        String sql = "INSERT INTO mathang(tenmh) values('" 
                                                    + nv.getTenMH()+ "')"
                                                  ;  
        try 
        {
            Database db = new Database();
            dbConnection = db.connectDB();
            statement = dbConnection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Mot mat hang : " + nv.getTenMH());
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
    public void updateMatHang( MatHang nv )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "update mathang set tenmh=" + "'" + nv.getTenMH()+ "'" + "where id="
                      + nv.getMaMH();

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Bang mathang da duoc cap nhat cho mat hang co ma la : "
                        + nv.getMaMH());

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
    public MatHang getMatHang(Integer MaMH){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        try
        {
          String query = "SELECT * FROM mathang where mamh=" + MaMH;
          System.out.println(query);
          stmt = con.createStatement();
          rs = stmt.executeQuery(query);
          while( rs.next() )
          {
            MatHang ncc = new MatHang();
            ncc.setTenMH(rs.getString("tenmh"));
            ncc.setMaMH(rs.getInt("mamh"));
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
    public static void main(String[] args) {
        MatHangDao nvdao = new  MatHangDao();
        List<MatHang> nvs = nvdao.getAllMatHang();
        
        for(MatHang ncc: nvs){
            System.out.println(ncc.getTenMH());
        }
        MatHang MH = nvdao.getMatHang(11);
        System.out.println(MH.getTenMH());
    }
}
