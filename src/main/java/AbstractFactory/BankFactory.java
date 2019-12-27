package AbstractFactory;

public class BankFactory extends AbstractFactory {
    final String ICICI_BANK = "ICICI";
    final String YES_BANK = "YES";
    Account getAccount(String accountType) {
        return null;
    }

    Bank getBank(String bankName) {
        if (bankName.equals(ICICI_BANK))
            return new ICICIBank();
        if (bankName.equals(YES_BANK))
            return new YesBank();
        return null;
    }
}
