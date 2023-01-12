package Factory;

public class BankFactory implements IBankFactory{
    @Override
    public IBank getBank(String bankcode) {
        switch (bankcode){
            case "123456":return new BankA();
            case  "111111":return  new BankB();
        }
        return null;
    }

    @Override
    public IPaymentCard getPaymentCard(String cardNumber) {
        switch (cardNumber){
            case "visa":return new IPaymentCard.visaCard();
            case  "mstr":return  new IPaymentCard.masterCard();
        }
        return null;
    }
}
