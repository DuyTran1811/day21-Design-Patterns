package TH2;

import java.sql.Connection;

public class Mains {
    public static void main(String[] args) {
        JDBCConnectionPool pool = new JDBCConnectionPool
                ("org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb", "sa", "secret");
        Connection con = pool.chekOut();
        pool.chekOut();
    }
}
