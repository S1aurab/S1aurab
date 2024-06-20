package Day8;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotaiondemo1 {

    @BeforeMethod
    void Login(){
        System.out.println("login");

    }
    @Test(priority = 1)
    void Search(){
        System.out.println("search");

    }
    @Test(priority = 2)
    Void Advancedsearch() {
        System.out.println("advanced search");

        return null;
    }
    @AfterMethod
    void Logout(){
        System.out.println("Logout");

    }

}
