package Model;

public class NotUniqueNickException extends Exception {
    private String nickData;

    public String getNickData() {
        return nickData;
    }

    public NotUniqueNickException(String message, String nickData) {
        super(message);
        this.nickData = nickData;
    }
}
