package Model;

public enum DataBase {
    NOTE_ONE("Taras", "taras123"),
    NOTE_TWO("Nikola","nik12345"),
    NOTE_THREE ("Petro","shoko123");

    private final String firstName;
    private final String nickName;

    DataBase(String firstName, String login) {
        this.firstName = firstName;
        this.nickName = login;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getNickName() {
        return nickName;
    }

    public static boolean checkNick (String nickData){
        for (DataBase note : DataBase.values()){
            if (note.getNickName().equals(nickData)){return true;}
        }
        return  false;
    }
}
