package Factory;

public interface IPaymentCard {
    String getName();
    String getProviderInfo();
    class visaCard implements IPaymentCard {
        @Override
        public String getName() {
            return "visa Card";
        }

        @Override
        public String getProviderInfo() {
            return "Visa";
        }
    }
    class masterCard implements IPaymentCard {
        @Override
        public String getName() {
            return "master Card";
        }

        @Override
        public String getProviderInfo() {
            return "master";
        }
    }

}
