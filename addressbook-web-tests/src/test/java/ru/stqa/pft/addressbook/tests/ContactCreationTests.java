package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.BdayData;
import ru.stqa.pft.addressbook.model.EmailData;
import ru.stqa.pft.addressbook.model.Name;
import ru.stqa.pft.addressbook.model.PhoneNumbers;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() throws Exception {

    app.getContactHelper().initContactCreation();
    app.getContactHelper().enterContactData(new Name("Evgeniya", "Stepanova", "estepano"));
    app.getContactHelper().enterCompanyName("Roga and Kopyta");
    app.getContactHelper().enterPhoneNumber(new PhoneNumbers("+74742414698", "+79524158888", "+74732140558"));
    app.getContactHelper().enterEmail(new EmailData("mail1@mail.de", "mail2@gmail.not", "mail3@topnet.com"));
    app.getContactHelper().enterBday(new BdayData("5", "July", "1991"));
    app.getContactHelper().assignContactToGroup();
    app.getNavigationHelper().returnToHomepage();

  }


}
