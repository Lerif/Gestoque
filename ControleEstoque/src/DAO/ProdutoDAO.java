
package DAO;

import java.sql.SQLException;

public class ProdutoDAO extends DAO{
  
  public static void main (String args[]){
    
    ProdutoDAO produtoDao = new ProdutoDAO();
    
    try {
      produtoDao.insert();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
  
  public void insert() throws SQLException
  {
      String sql = "INSERT INTO produto (cod_produto, nome) VALUES (?, ?);";
      connect(sql);
      stm.setString(1, "1011");
      stm.setString(2, "Pipoca");
      stm.execute();
      close();
  }

}
=======
package DAO;

import java.sql.SQLException;

public class ProdutoDAO extends DAO{
  
  public static void main (String args[]){
    
    ProdutoDAO produtoDao = new ProdutoDAO();
    
    try {
      produtoDao.insert();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
  
  public void insert() throws SQLException
  {
      String sql = "INSERT INTO produto (cod_produto, nome) VALUES (?, ?);";
      connect(sql);
      stm.setString(1, "1011");
      stm.setString(2, "Pipoca");
      stm.execute();
      close();
  }

}

