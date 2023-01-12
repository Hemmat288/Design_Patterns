package Factory;

public interface IBankFactory {

    IBank getBank(String bankcode);
    IPaymentCard getPaymentCard(String cardNumber);
}
