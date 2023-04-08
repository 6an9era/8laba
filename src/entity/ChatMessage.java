package entity;

public class ChatMessage {

    private String message;
    private ChatUser author;
    private long timestamp;
    private long sec = 60; // было 30 секунд
    private long quantity = 15;

    public ChatMessage(String message, ChatUser author, long timestamp) {
        this.message = message;
        this.author = author;
        this.timestamp = timestamp;
    }
    public long getQuantity()
    {return quantity;}

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChatUser getAuthor() {
        return author;
    }

    public void setAuthor(ChatUser author) {
        this.author = author;
    }

    public long getSec()
    {
        return sec;
    }

}
