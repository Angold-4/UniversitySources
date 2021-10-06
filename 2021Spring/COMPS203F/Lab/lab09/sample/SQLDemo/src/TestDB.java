import java.sql.*;

public class TestDB {  
    
    private Connection conn = null; 
    private PreparedStatement pStatement = null;  
    private ResultSet resultSet = null;
    
    //load JDBC driver
    public void loadDriver() {
      try {
        Class.forName("org.postgresql.Driver"); 
    
      } catch (ClassNotFoundException e) {
        System.out.println("Problem: "+e.getMessage());
      }
    }
  
    //start DB connection
    public void connectDB() {
      try {
        conn = DriverManager.getConnection(
                 "jdbc:postgresql://localhost:5432/postgres", 
                 "postgres", "pass123");
      } catch (SQLException e) {
        System.out.println("Connect Problem: "+e.getMessage());
      }    
    }
    
    public void createTable() {
      try {
        String sql = "create table student ( "
                   + "studentID varchar(8) primary key, "
                   + "name varchar(50), "
                   + "weight numeric(4,1) );";
        pStatement = conn.prepareStatement(sql);
        pStatement.executeUpdate();
      } catch (SQLException e) {
          try{
              String sql = "delete from student;";
              pStatement = conn.prepareStatement(sql);
              pStatement.executeUpdate();
          } catch (SQLException e1) {
                    System.out.println("Create Problem: "+e1.getMessage());
          }
      }    
    }

    public void insertData() {
      try {
        String sql = "insert into student values (?,?,?);";
        pStatement = conn.prepareStatement(sql);
        setData("11223344", "Ada", 45);
        pStatement.executeUpdate();
        setData("11223355", "Ben", 66.5);
        pStatement.executeUpdate();
      } catch (SQLException e) {
        System.out.println("Insert Problem: "+e.getMessage());
      }    
    }

    public void setData(String studentID, String name, double weight) {
      try {
          pStatement.setString(1, studentID);
          pStatement.setString(2, name);
          pStatement.setDouble(3, weight);
      } catch (SQLException e) {
          System.out.println("Set Data Problem: "+e.getMessage());
      }    
    }

    public void selectByID(String studentID) {
      try {
        String sql = "select * from student where studentID=?;";
        pStatement = conn.prepareStatement(sql);
        pStatement.setString(1, studentID);      
        resultSet = pStatement.executeQuery();
        while (resultSet.next()) {
          System.out.println(resultSet.getString("studentID") + ", " 
                             + resultSet.getString("name") + ", " 
                             + resultSet.getDouble("weight"));
        }
      } catch (SQLException e) {
        System.out.println("Select Problem: "+e.getMessage());
      }    
    }

    public void selectAllData() {
      try {
        String sql = "select * from student order by studentID;";
        pStatement = conn.prepareStatement(sql);
        resultSet = pStatement.executeQuery();
        while (resultSet.next()) {
          System.out.println(resultSet.getString("studentID") + ", " 
                             + resultSet.getString("name") + ", " 
                             + resultSet.getDouble("weight"));
        }
      } catch (SQLException e) {
        System.out.println("Select All Problem: "+e.getMessage());
      }    
    }

    public void deleteByName(String name) {
      try {
        String sql = "delete from student where name=?;";
        pStatement = conn.prepareStatement(sql);
        pStatement.setString(1, name);
        pStatement.executeUpdate();
      } catch (SQLException e) {
        System.out.println("Delete Problem: "+e.getMessage());
      }    
    }
    
    //delete all records
    public void deleteAllData() {
      try {
        String sql = "delete from student;";
        pStatement = conn.prepareStatement(sql);
        pStatement.executeUpdate();
      } catch (SQLException e) {
        System.out.println("Delete All Data Problem: "+e.getMessage());
      }    
    }
    
    //delete (drop) the whole table
    public void dropTable() {
      try {
        String sql = "drop table student;";
        pStatement = conn.prepareStatement(sql);
        pStatement.executeUpdate();
      } catch (SQLException e) {
        System.out.println("Drop Table Problem: "+e.getMessage());
      }    
    }   
    
    public void updateName(String studentID, String newName) {
      try {
        String sql = "update student set name=? "
                     +"where studentID=?;";
        pStatement = conn.prepareStatement(sql);
        pStatement.setString(1, newName);
        pStatement.setString(2, studentID);
        pStatement.executeUpdate();
      } catch (SQLException e) {
        System.out.println("Update Problem: "+e.getMessage());
      }    
    }

    public void closeDB() {
      try {
        conn.close();
      } catch (SQLException e) {
        System.out.println("Close Problem: "+e.getMessage());
      }    
    }

    public static void main(String[] args) {
      TestDB myDB = new TestDB();
      
      System.out.println("load driver and connect...");       
      myDB.loadDriver();      
      myDB.connectDB();
      myDB.dropTable();
      
      System.out.println("create table..."); 
      myDB.createTable();
      
      System.out.println("\ninsert data..."); 
      myDB.insertData();      
      myDB.selectAllData();
      
      System.out.println("\nselect by ID..."); 
      myDB.selectByID("11223344");

      System.out.println("\ndelete Ada..."); 
      myDB.deleteByName("Ada");      
      myDB.selectAllData();
      
      System.out.println("\ndelete Ben...");       
      myDB.deleteByName("Ben");      
      myDB.selectAllData();
      
      System.out.println("\ninsert data...");      
      myDB.insertData();      
      myDB.selectAllData();
      
      System.out.println("\nupdate name..."); 
      myDB.updateName("11223344", "Alice");
      myDB.selectAllData(); 
    }  

}
