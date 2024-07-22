public interface PaymentMethod {
    default void pay(Account account, double quantity) throws Exception {
        if(account.getBalance() - quantity < 0) {
            throw new Exception("You don´t have balance");
        }
            account.setBalance(account.getBalance() - quantity);
    };
}
