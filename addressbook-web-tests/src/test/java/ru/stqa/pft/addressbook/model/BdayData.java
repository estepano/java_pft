package ru.stqa.pft.addressbook.model;

public class BdayData {
    private final String bday;
    private final String bmonth;
    private final String byear;

    public BdayData(String bday, String bmonth, String byear) {
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }
}
