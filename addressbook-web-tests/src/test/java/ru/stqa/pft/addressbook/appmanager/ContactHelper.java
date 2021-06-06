package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.BdayData;
import ru.stqa.pft.addressbook.model.EmailData;
import ru.stqa.pft.addressbook.model.Name;
import ru.stqa.pft.addressbook.model.PhoneNumbers;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void assignContactToGroup() {
        click(By.name("new_group"));
        findElementByVisibleText("new_group", "Test");
        click(By.name("new_group"));
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void enterBday(BdayData bdayData) {

        click(By.name("bday"));
        findElementByVisibleText("bday", bdayData.getBday());
        click(By.name("bday"));
        click(By.name("bmonth"));
        findElementByVisibleText("bmonth", bdayData.getBmonth());
        click(By.name("bmonth"));
        type(By.name("byear"), bdayData.getByear());

    }

    public void enterEmail(EmailData emailData) {
        type(By.name("email"), emailData.getEmail1());
        type(By.name("email"), emailData.getEmail2());
        type(By.name("email"), emailData.getEmail3());
    }

    public void enterPhoneNumber(PhoneNumbers phoneNumbers) {
        type(By.name("home"), phoneNumbers.getPhoneNum1());
        type(By.name("mobile"), phoneNumbers.getPhoneNum2());
        type(By.name("work"), phoneNumbers.getPhoneNume3());
    }

    public void enterCompanyName(String companyName) {
        type(By.name("company"), companyName);
    }

    public void enterContactData(Name name) {
        type(By.name("firstname"), name.getFirstName());
        type(By.name("middlename"), name.getMiddleName());
        type(By.name("nickname"), name.getNickName());

    }

    public void initContactCreation() {
        click(By.linkText("add new"));
        click(By.name("firstname"));
        clear(By.name("firstname"));
    }
}
