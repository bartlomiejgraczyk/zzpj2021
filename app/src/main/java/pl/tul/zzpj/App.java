package pl.tul.zzpj;

/**
 * @author bartlomiejgraczyk
 */
public class App {
    public static void main(String[] args) {

        Account account = new Account(1L, "test@mail.com", "Jan", "Kowalski", "P@ssw0rd");
        System.out.print("Id: " + account.getId() 
                + "\nE-mail: " + account.getEmail() 
                + "\nFirst name: " + account.getFirstName() 
                + "\nLast name: " + account.getLastName() 
                + "\nPassword: " + account.getPassword());
    }
}
