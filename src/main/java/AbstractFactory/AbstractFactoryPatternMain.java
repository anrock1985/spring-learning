package AbstractFactory;

public class AbstractFactoryPatternMain {
    public static void main(String[] args) {
        AbstractFactory accountFactory = FactoryProducer.getFactory("ACCOUNT");
        Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.accountType();

        AbstractFactory bankFactory = FactoryProducer.getFactory("BANK");
        Bank yesBank = bankFactory.getBank("YES");
        yesBank.bankName();
    }
}
