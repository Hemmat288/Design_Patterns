package Factory;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
String cardNumber,bankCode,visaNum,visaN;
BankFactory bankFactory=new BankFactory();


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your code number");
        cardNumber = input.nextLine();
        bankCode =cardNumber.substring(0,6);
        IBank ib =bankFactory.getBank(bankCode);

        System.out.println("Visa NUmber  is: " + ib.withdrow());

        System.out.println("Enter your visa number");
        visaNum = input.nextLine();
        visaN =visaNum.substring(0,4);
        IPaymentCard iPaymentCard= bankFactory.getPaymentCard(visaN);
        System.out.println("Visa   is: " + iPaymentCard.getName());
    }
}
