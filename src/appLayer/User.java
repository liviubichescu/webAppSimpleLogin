package appLayer;

public class User {

    public boolean isValidUserCredentials(String sUserName, String sUserPassword) {

        return sUserName.equals("liviu") && sUserPassword.equals("test123");
    }
}
