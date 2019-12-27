package Factory;

import java.util.ArrayList;

public class FactoryPatternMain {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();

        ArrayList<Account> accounts = new ArrayList<Account>();
        accounts.add(accountFactory.getAccount("SAVING"));
        accounts.add(accountFactory.getAccount("CURRENT"));

        for (Account a : accounts) {
            a.accountType();
        }
    }
}
