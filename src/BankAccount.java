public class BankAccount {


    private double amount;

    public double getAmount( ) {

        return (int) amount;
    }

    public boolean deposit(double sum) {
        if (amount == 0){
            amount = amount +sum;
            System.out.println("Вы пополнили свой баланс."+ "\nVash balance: "+getAmount());
        }else{
            System.out.println("Вы пополнили свой баланс."+ "\nVash balance: "+amount+sum);
        }return true;


    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ошибка.У вас на счету нет " +
                    "столько средств "  + getAmount());
        }
        System.out.println(amount=amount-sum);
    }
}
