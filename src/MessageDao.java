import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MessageDao {

    public MessageWithComment getMessageByMessageId(Long messageId){

        MessageWithComment messageWithComment = null;

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","qwerty12345678910#");

            String sql = "select * from message m left join comment c on m.id_message = c.id_message where m.id_message = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1,messageId);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                messageWithComment = new MessageWithComment(
                        resultSet.getLong("id_message"),
                        resultSet.getString("m.text"),
                        resultSet.getDate("m.published_at"),
                        resultSet.getString("m.username"),
                        resultSet.getLong("id_comment"),
                        resultSet.getString("c.text"),
                        resultSet.getDate("c.published_at"),
                        resultSet.getString("c.username"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return messageWithComment;
    }
}
