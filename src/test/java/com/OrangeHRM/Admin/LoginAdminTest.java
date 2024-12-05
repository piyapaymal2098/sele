package com.OrangeHRM.Admin;

import Base.baseClass;
import Pages.LoginAdminPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginAdminTest extends baseClass {
    @Test
    public void testLoginAdmin() {
        LoginAdminPage adminloginpage = new LoginAdminPage(driver);
        adminloginpage.AdminLogin();

       // adminloginpage.MenuBar.click();
      //  adminloginpage.AdminButton.click();
    }
}
