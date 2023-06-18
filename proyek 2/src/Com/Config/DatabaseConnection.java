package Com.Config;

import java.sql.Connection;

public class DatabaseConnection {
    MyConfig Con = new MyConfig();
    Connection MyConfig = Con.getConnect();
}