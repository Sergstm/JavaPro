package ua.kiev.prog.case2;

import ua.kiev.prog.shared.Client;
import ua.kiev.prog.shared.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "Root";

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        ConnectionFactory factory = new ConnectionFactory(
                DB_CONNECTION, DB_USER, DB_PASSWORD
        );

        Connection conn = factory.getConnection();
        try {
            ClientDAOEx dao = new ClientDAOEx(conn, "clients");

            Client c = new Client("test", 1);
            dao.add(c);

            List<Client> list = dao.getAll(Client.class);
            for (Client cli : list)
                System.out.println(cli);

            Client n = new Client(5,"new test", 5);
            dao.update(n);

            dao.delete(list.get(0));
        } finally {
            sc.close();
            if (conn != null) conn.close();
        }
    }
}
