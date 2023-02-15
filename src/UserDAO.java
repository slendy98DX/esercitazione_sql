import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    User user = null;
    public User getUser(String username){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "qwerty12345678910#");

            PreparedStatement preparedStatement = connection.prepareStatement("select * from user where user.username = ?");

            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                user = new User(resultSet.getString("username"), resultSet.getString("email"),
                        resultSet.getString("password"), resultSet.getDate("registration_date"),
                        resultSet.getShort("active"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public void fetchActiveUser() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "qwerty12345678910#");
            Statement statement = connection.createStatement();
            Map<String,User> activeUsers = new HashMap<>();
            ResultSet resultSet = statement.executeQuery("select * from user where active <> 0");
            while(resultSet.next()){
                user = new User(resultSet.getString("username"), resultSet.getString("email"),
                        resultSet.getString("password"), resultSet.getDate("registration_date"),
                        resultSet.getShort("active"));
                activeUsers.put(resultSet.getString("username"),user);
            }
            System.out.println(activeUsers);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

