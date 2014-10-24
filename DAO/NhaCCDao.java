/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.sql.Connection;
import POJO.NhaCungCap;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhaCCDao {
    public List<NhaCungCap> getAllNhaCC(){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        List<NhaCungCap> NhaCungCaps = new ArrayList<NhaCungCap>();
        try{
            String query = "SELECT * FROM nhacungcap";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while( rs.next() )
            {
                NhaCungCap ncc = new NhaCungCap();
                ncc.setTenNCC(rs.getString("tenncc"));
                ncc.setDiaChi(rs.getString("diachi"));
                ncc.setSoDT(rs.getString("SoDT"));
                ncc.setFax(rs.getString("Fax"));
                ncc.setEmail(rs.getString("email"));
                ncc.setMaNCC(rs.getString("mancc"));
                NhaCungCaps.add(ncc);
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
        return NhaCungCaps;
    }
    
    public void AddNhaCC(NhaCungCap ncc){
        Connection dbConnection = null;
        Statement statement = null;
        

        String sql = "INSERT INTO nhacungcap( tenncc, diachi, sodt, fax, email) "
                + "VALUES('" + ncc.getTenNCC()+ "','"
                                                    + ncc.getDiaChi() + "','"
                                                    + ncc.getSoDT() + "','"
                                                    + ncc.getFax()+ "','"
                                                    + ncc.getEmail()+ "')"
                                                  ;  
        try 
        {
            System.out.println(sql);
            Database db = new Database();
            dbConnection = db.connectDB();
            statement = dbConnection.createStatement();
            statement.executeUpdate(sql);
            
            System.out.println("Mot nha cung cap da duoc them vao bang nhacungcap voi ten nhacc la : " + ncc.getTenNCC());
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
    
    public NhaCungCap getNhaCC(Integer MaNCC){
        Database database = new Database();
        Connection con = database.connectDB();
        Statement stmt = null;
        ResultSet rs = null;
        try
        {
          String query = "SELECT * FROM nhacungcap where mancc=" + MaNCC;
          stmt = con.createStatement();
          rs = stmt.executeQuery(query);
          while( rs.next() )
          {
            NhaCungCap ncc = new NhaCungCap();
            ncc.setTenNCC(rs.getString("tenncc"));
            ncc.setDiaChi(rs.getString("diachi"));
            ncc.setSoDT(rs.getString("sodt"));
            ncc.setFax(rs.getString("fax"));
            ncc.setEmail(rs.getString("email"));
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
    
    public void updateNhaCC( NhaCungCap nv )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "update nhacungcap set tenncc=" + "'" + nv.getTenNCC()+ "'" + "where mancc="
                      + nv.getMaNCC();

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Bang nhacungcap da duoc cap nhat cho nha cung cap co ma nha cung cap la : "
                        + nv.getMaNCC());

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
    public void deleteNhaCC( int  MaNV )
    {
      Connection dbConnection = null;
      Statement statement = null;

      String sql = "delete from nhacungcap where mancc="+ MaNV;

      try
      {
        Database database = new Database();
        dbConnection = database.connectDB();
        statement = dbConnection.prepareStatement(sql);
        statement.executeUpdate(sql);

        System.out.println("Nhan Cung Cap da duoc xoa trong bang nhacungcap voi mancc : "
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
        NhaCCDao nvdao = new NhaCCDao();
        List<NhaCungCap> nvs = nvdao.getAllNhaCC();
        
        for(NhaCungCap ncc: nvs){
            System.out.println(ncc.getTenNCC());
        }
    }
    
    
}
