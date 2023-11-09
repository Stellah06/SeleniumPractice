package week3.day8.assignments;

public class LoginTestData extends TestData{

    public static void main(String[] args) {
        LoginTestData obj=new LoginTestData();
        obj.enterCredentials();
        obj.enterUserName();
        obj.entePassword();
        obj.navigateToHomePage();
    }


    public void enterUserName(){
        System.out.println("Please enter user name");
    }
    public void entePassword(){
        System.out.println("Please enter password");
    }
}
