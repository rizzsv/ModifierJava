package modifier;

import java.security.Permissions;

public class main {
    public static void main(String[] args) {
        person mPerson = new person();
        mPerson.name = "Vaaleant";

        System.out.println("Person Name: " + mPerson.getName());
    }
}
