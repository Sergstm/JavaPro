
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseController {

    private final String DB_CONN = "jdbc:mysql://localhost:3306/mydbase?useSSL=false";
    private final String DB_USER = "root";
    private final String DB_PASS = "Root";

    public BaseController() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void init() {
        try (Connection conn = DriverManager.getConnection(DB_CONN, DB_USER, DB_PASS)) {
            Statement st = conn.createStatement();
            st.execute("DROP TABLE IF EXISTS users");
            st.execute("CREATE TABLE users(id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT, " +
                    "name VARCHAR(30), age INT(11), car VARCHAR(30), color VARCHAR(30))");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setData(String name, int age, String car, String color) {
        try (Connection conn = DriverManager.getConnection(DB_CONN, DB_USER, DB_PASS)) {
            try (PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO users (name, age, car, color) VALUES (?, ?, ?, ?)")) {
                ps.setString(1, name);
                ps.setInt(2, age);
                ps.setString(3, car);
                ps.setString(4, color);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private int getData(String car, String color) {
        int res = 0;
        try (Connection conn = DriverManager.getConnection(DB_CONN, DB_USER, DB_PASS)) {
            String sql ="SELECT COUNT(*) FROM users WHERE car = ? AND color = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, car);
            statement.setString(2, color);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            res = resultSet.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public List<Integer> resData() {
        List<Integer> list = new ArrayList<>();

        list.add(getData("bmw", "black"));
        list.add(getData("bmw", "red"));
        list.add(getData("bmw", "white"));
        list.add(getData("bmw", "silver"));

        list.add(getData("audi", "black"));
        list.add(getData("audi", "red"));
        list.add(getData("audi", "white"));
        list.add(getData("audi", "silver"));

        list.add(getData("mercedes", "black"));
        list.add(getData("mercedes", "red"));
        list.add(getData("mercedes", "white"));
        list.add(getData("mercedes", "silver"));

        return list;
    }
}
