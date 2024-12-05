package com.OrangeHRM.Admin;

import Base.baseClass;
import Pages.HomePage;
import Pages.LoginAdminPage;
import Pages.UserManagementPage;
import org.testng.annotations.Test;

public class UserManagementTest extends baseClass {
    @Test
    public  void userManagementTest(){
        LoginAdminPage adminloginpage = new LoginAdminPage(driver);
        adminloginpage.AdminLogin();
        HomePage homepage = new HomePage(driver);
        homepage.adminOption();
        UserManagementPage usermanagementpage = new UserManagementPage(driver);
        usermanagementpage.AddUser();
    }



}
