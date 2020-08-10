package Jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerConnectionPoolDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerPooledConnection;
import com.sun.rowset.JdbcRowSetImpl;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.sql.PooledConnection;
import javax.sql.rowset.JdbcRowSet;
import java.sql.*;

public class ConnectWithDriverManager {

    void usingDriverManager(String url){
        Connection connection = null;
        try {
           connection = DriverManager.getConnection(url);
            String insert = "INSERT INTO COFFEES VALUES (?, ?, ?, ?, ?)";
           PreparedStatement preparedStatement = connection.prepareStatement(insert);
           preparedStatement.setString(1, "Colombian");
           preparedStatement.setInt(2, 101);
           preparedStatement.setFloat(3, 7.99F);
           preparedStatement.setInt(4, 0);
            preparedStatement.setInt(5, 0);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (connection!= null)
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    void usingJdbcRowSet(){
        JdbcRowSet jdbcRs = new JdbcRowSetImpl();
        try {
            jdbcRs.setCommand("select * from COFFEES");
            jdbcRs.setUrl("jdbc:sqlserver://localhost:1111;databaseName=Coffee");
            jdbcRs.setUsername("coffee");
            jdbcRs.setPassword("coffee");
            jdbcRs.execute();
        }
        catch (SQLException e){
            e.printStackTrace();
        }


    }

    SQLServerDataSource sqlServerDataSource = new SQLServerDataSource();
    void usingDataSource() {
        Connection con = null;

        sqlServerDataSource.setUser("coffee");
        sqlServerDataSource.setPassword("coffee");
        sqlServerDataSource.setServerName("DESKTOP-1E9LH90\\MSSQLSERVER2");
        sqlServerDataSource.setPortNumber(Integer.parseInt("1111"));
        sqlServerDataSource.setDatabaseName("Coffee");

        try {
             con = sqlServerDataSource.getConnection();
            String insert = "INSERT INTO COFFEES VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            preparedStatement.setString(1, "French_Roast");
            preparedStatement.setInt(2, 49);
            preparedStatement.setFloat(3, 8.99F);
            preparedStatement.setInt(4, 0);
            preparedStatement.setInt(5, 0);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null)
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

        }


    }

    SQLServerConnectionPoolDataSource sqlServerConnectionPoolDataSource = new SQLServerConnectionPoolDataSource();
    void usingConnectionPoolDataSource() {
        Connection con = null;
        sqlServerConnectionPoolDataSource.setUser("coffee");
        sqlServerConnectionPoolDataSource.setPassword("coffee");
        sqlServerConnectionPoolDataSource.setServerName("DESKTOP-1E9LH90\\MSSQLSERVER2");
        sqlServerConnectionPoolDataSource.setPortNumber(Integer.parseInt("1111"));
        sqlServerConnectionPoolDataSource.setDatabaseName("Coffee");

        try {
            con = sqlServerConnectionPoolDataSource.getConnection();
            String insert = "INSERT INTO COFFEES VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            preparedStatement.setString(1, "Espresso");
            preparedStatement.setInt(2, 150);
            preparedStatement.setFloat(3, 9.99F);
            preparedStatement.setInt(4, 0);
            preparedStatement.setInt(5, 0);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null)
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

        }


    }

    void showingResultSet(){
        try {
            sqlServerConnectionPoolDataSource.setUser("coffee");
            sqlServerConnectionPoolDataSource.setPassword("coffee");
            sqlServerConnectionPoolDataSource.setServerName("DESKTOP-1E9LH90\\MSSQLSERVER2");
            sqlServerConnectionPoolDataSource.setPortNumber(Integer.parseInt("1111"));
            sqlServerConnectionPoolDataSource.setDatabaseName("Coffee");
            PooledConnection  pooledConnection = sqlServerConnectionPoolDataSource.getPooledConnection();
            Statement st = pooledConnection.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet re = st.executeQuery("SELECT * FROM COFFEES");
            while (re.next())
            {
                System.out.println(re.getString(1) + " "+ re.getInt(2) + " "+ re.getFloat(3) + " "+
                        re.getInt(4) + " "+re.getInt(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("starting...");
        ConnectWithDriverManager  connect = new ConnectWithDriverManager();
        String str = "jdbc:sqlserver://localhost:1111;databaseName=Coffee;user=coffee;password=coffee";
        //connect.usingDriverManager(str);
        //connect.usingJdbcRowSet();
        //connect.usingDataSource(str);
        //connect.usingConnectionPoolDataSource();
        connect.showingResultSet();



    }
}
