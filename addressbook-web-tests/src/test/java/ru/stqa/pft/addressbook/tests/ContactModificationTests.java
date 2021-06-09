package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.CompanyData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.navigationHelper().goToContactPage();
        app.getContactHelper().editContact();
        app.getContactHelper().editCompanyData(new CompanyData("OOO AAA"));
        app.getContactHelper().updateContact();
        app.navigationHelper().returnToHomepage();

    }
}
