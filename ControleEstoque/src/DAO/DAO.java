package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class DAO {
  
  public PreparedStatement stm;

  public void connect(String sql) {
      try {
          stm = ConnectionFactory.getConnection().prepareStatement(sql);
      } catch (SQLException e) {
          Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
      }
  }

  public void close() {
      try {
          stm.close();
          ConnectionFactory.getConnection().close();
          System.out.println("Conexão Fechada");
      } catch (SQLException e) {
          Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
      }
  }
  
  public void commit()
  {
      try {
          if (!ConnectionFactory.getConnection().isClosed())
              ConnectionFactory.getConnection().commit();
      } catch (SQLException ex) {
          Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public void rollback()
  {
      try {
          if (!ConnectionFactory.getConnection().isClosed())
              ConnectionFactory.getConnection().rollback();
      } catch (SQLException ex) {
          Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
}
