package Model;

import java.util.Date;
import java.util.List;

public class Human {

    public enum Group {
        FIRST, SECOND, THIRD
    }

    private String Full_name;
    private String NickName;
    private String Comment;
    private Group Group;
    private List Telephones;
    private String E_mail;
    private String Skype;
    private Address Address;
    private Date EnterDate;
    private Date EditDate;

    public Human(String full_name, String nickName, String comment,
                 Human.Group group, List telephones, String e_mail,
                 String skype, Address address) {

        this.Full_name = full_name;
        this.NickName = nickName;
        this.Comment = comment;
        this.Group = group;
        this.Telephones = telephones;
        this.E_mail = e_mail;
        this.Skype = skype;
        this.Address = address;
        EnterDate = new Date();

    }

    public Human() {
    }

    public void setFull_name(String full_name) {
        Full_name = full_name;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public void setGroup(Human.Group group) {
        Group = group;
    }

    public void setTelephones(List telephones) {
        Telephones = telephones;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    public void setSkype(String skype) {
        Skype = skype;
    }

    public void setAddress(Address address) {
        Address = address;
    }

    public void setEnterDate(Date enterDate) {
        EnterDate = enterDate;
    }

    public void setEditDate(Date editDate) {
        EditDate = editDate;
    }
}
