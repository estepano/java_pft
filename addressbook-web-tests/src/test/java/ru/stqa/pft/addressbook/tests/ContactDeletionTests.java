package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.navigationHelper().goToContactPage();
        app.getContactHelper().chooseContact();
        app.getContactHelper().deleteContact();
        app.navigationHelper().switchToDialogBox();
    }
}
