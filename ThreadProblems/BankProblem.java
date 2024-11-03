package ThreadProblems;

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // if "synchronized" is not used, the ultimate balance after two withdrawal transactions will be
    // $-200 which is not possible in real life.
    // With adding the word "synchronized", the second withdrawal transaction won't be allowed,
    // thus maintaining the balance of $400 in a $1000 scenario.
    public synchronized void withdraw (int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is currently going to withdraw $" + amount);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());;
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed the withdrawal. Remaining balance: $" + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw $" + amount + " but insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}


class WithdrawTask implements Runnable {
    private BankAccount bankAccount;
    private int amount;

    public WithdrawTask(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
        System.out.println("Balance after transaction: $" + bankAccount.getBalance());
    }
}


public class BankProblem {
    public static void main(String[] args) {
        BankAccount sharedBankAccount = new BankAccount(1000);

        Thread userOneThread = new Thread(new WithdrawTask(sharedBankAccount, 600));
        Thread userTwoThread = new Thread(new WithdrawTask(sharedBankAccount, 600));

        userOneThread.start();
        userTwoThread.start();

    }

}
