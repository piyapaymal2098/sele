package com.OrangeHRM.Admin;

import Base.baseClass;
import Pages.HomePage;
import Pages.LoginAdminPage;
import org.testng.annotations.Test;

public class HomePageTest extends baseClass {
    @Test
  public void HomePageMenu( ){
      LoginAdminPage adminloginpage = new LoginAdminPage(driver);
      adminloginpage.AdminLogin();
        HomePage homepage = new HomePage(driver);
        homepage.adminOption();
  }

}
