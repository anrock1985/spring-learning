package Factory;

public class AccountFactory {
    final String ACCOUNT_SAVING = "SAVING";
    final String ACCOUNT_CURRENT = "CURRENT";

    public Account getAccount(String accountType) {
        if (accountType.equals(ACCOUNT_SAVING))
            return new AccountSaving();
        else if (accountType.equals(ACCOUNT_CURRENT))
            return new AccountCurrent();
        return null;
    }
}
