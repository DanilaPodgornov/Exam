import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url;
        Connection connection;
        Statement statement;

        url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        try {
            connection = DriverManager.getConnection(url, "postgres", "qwerty1234");
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            statement.executeUpdate("insert into public.exam values (3, 'toyota');");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            ResultSet resultSet = statement.executeQuery("select * from public.exam;");
            while (resultSet.next()) {
                String result = resultSet.getString("id") + " " + resultSet.getString(2);
                System.out.println(result);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
select * from public.exam;
select * from public.exam where id = 2;
insert into public.exam values (2, 'nissan');
delete from public.exam where id = 2;
update public.exam set brand = 'honda' where id = 1;
 */