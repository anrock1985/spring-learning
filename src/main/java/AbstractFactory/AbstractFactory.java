package AbstractFactory;

public abstract class AbstractFactory {
    abstract Account getAccount(String accountType);
    abstract Bank getBank(String bankName);
}
