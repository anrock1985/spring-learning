package AbstractFactory;

public class AccountFactory extends AbstractFactory {
    final String SAVING_ACCOUNT = "SAVING";
    final String CURRENT_ACCOUNT = "CURRENT";

    Account getAccount(String accountType) {
        if (accountType.equals(SAVING_ACCOUNT))
            return new AccountSaving();
        if (accountType.equals(CURRENT_ACCOUNT))
            return new AccountCurrent();
        return null;
    }

    Bank getBank(String bankName) {
        return null;
    }
}
