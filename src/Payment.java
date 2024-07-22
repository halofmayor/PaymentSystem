public class Payment {

    public static void pay(Account account, double quantity,PaymentMethod paymentMethod) throws Exception {
        paymentMethod.pay(account, quantity);
    }

    public static void main(String[] args) throws Exception {
        Account user = new Account("halof");
        PaymentMethod paymentMethod = new PaymentType.card();
        Payment.pay(user, 10, paymentMethod);
    }


}


