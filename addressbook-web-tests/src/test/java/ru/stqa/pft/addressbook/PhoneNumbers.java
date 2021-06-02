package ru.stqa.pft.addressbook;

public class PhoneNumbers {
    private final String phoneNum1;
    private final String phoneNum2;
    private final String phoneNume3;

    public PhoneNumbers(String phoneNum1, String phoneNum2, String phoneNume3) {
        this.phoneNum1 = phoneNum1;
        this.phoneNum2 = phoneNum2;
        this.phoneNume3 = phoneNume3;
    }

    public String getPhoneNum1() {
        return phoneNum1;
    }

    public String getPhoneNum2() {
        return phoneNum2;
    }

    public String getPhoneNume3() {
        return phoneNume3;
    }
}
