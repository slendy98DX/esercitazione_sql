public class Start {

    public static void main(String[] args) {

        /*UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.getUser("pasquale"));
        userDAO.fetchActiveUser();*/

        MessageDao messageDao = new MessageDao();

        System.out.println(messageDao.getMessageByMessageId(1L));
    }
}
