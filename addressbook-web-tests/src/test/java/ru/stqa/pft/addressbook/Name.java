package ru.stqa.pft.addressbook;

public class Name {
    private final String firstName;
    private final String middleName;
    private final String nickName;

    public Name(String firstName, String middleName, String nickName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.nickName = nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getNickName() {
        return nickName;
    }
}
