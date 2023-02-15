import java.util.Date;

public class MessageWithComment {

    private long idMessage;
    private String textMessage;
    private Date publishedAtMessage;
    private String usernameMessage;
    private long idComment;
    private String textComment;
    private Date publishedAtComment;
    private String usernameComment;

    public MessageWithComment(long idMessage, String textMessage, Date publishedAtMessage, String usernameMessage, long idComment, String textComment, Date publishedAtComment, String usernameComment) {
        this.idMessage = idMessage;
        this.textMessage = textMessage;
        this.publishedAtMessage = publishedAtMessage;
        this.usernameMessage = usernameMessage;
        this.idComment = idComment;
        this.textComment = textComment;
        this.publishedAtComment = publishedAtComment;
        this.usernameComment = usernameComment;
    }

    public long getIdMessage() {
        return idMessage;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public Date getPublishedAtMessage() {
        return publishedAtMessage;
    }

    public String getUsernameMessage() {
        return usernameMessage;
    }

    public long getIdComment() {
        return idComment;
    }

    public String getTextComment() {
        return textComment;
    }

    public Date getPublishedAtComment() {
        return publishedAtComment;
    }

    public String getUsernameComment() {
        return usernameComment;
    }

    @Override
    public String toString() {
        return "MessageWithComment{" +
                "idMessage=" + idMessage +
                ", textMessage='" + textMessage + '\'' +
                ", publishedAtMessage=" + publishedAtMessage +
                ", usernameMessage='" + usernameMessage + '\'' +
                ", idComment=" + idComment +
                ", textComment='" + textComment + '\'' +
                ", publishedAtComment=" + publishedAtComment +
                ", usernameComment='" + usernameComment + '\'' +
                '}';
    }
}
