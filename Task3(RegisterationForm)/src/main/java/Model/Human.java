package Model;

import java.util.Date;
import java.util.List;

public class Human {

    public enum Group {
        FIRST, SECOND, THIRD
    }

    private String Full_name;
    private String Surname;
    private String Firstname;


    private String Patronymic;
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
        this.Full_name = this.Surname +" " +this.Firstname +" "+this.Patronymic;
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

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Full_name='" + Full_name + '\''+'\n' +
                "\t Surname='" + Surname + '\''+'\n' +
                "\t Firstname='" + Firstname + '\''+'\n' +
                "\t Patronymic='" + Patronymic + '\''+'\n' +
                "\t NickName='" + NickName + '\''+'\n' +
                "\t Comment='" + Comment + '\''+'\n' +
                "\t Group=" + Group + '\n' +
                "\t Telephones=" + Telephones +'\n'+
                "\t E_mail='" + E_mail + '\'' +'\n'+
                "\t Skype='" + Skype + '\''+'\n' +
                "\t Address=" + Address +'\n'+
                "\t EnterDate=" + EnterDate +'\n'+
                "\t EditDate=" + EditDate +'\n'+
                '}';
    }
}
