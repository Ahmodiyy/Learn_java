package EssentialClasses.concurrency;

public class PublicAccout {
    static class BankAccount implements Runnable{
        private int balance;
        public synchronized void setBalance(int balance){
            this.balance= balance;
        }


        public synchronized void withdrawal(int amount){

            if(amount <= balance ){
                balance -= amount;
                System.out.println(Thread.currentThread().getName()+ ": has withdraw successfully\n Account bal: $"+balance);
            }
            else {
                System.out.println(Thread.currentThread().getName()+ ": insufficient fund \n balance $"+balance);
            }
        }

        @Override
        public void run() {
            withdrawal(75);
            if(balance < 0){
                System.out.println("money overdrawn");
            }
        }
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);

        Thread thread1 = new Thread(bankAccount);
        Thread thread2 = new Thread(bankAccount);
        thread1.setName("john");
        thread1.start();

        thread2.setName("anita");
        thread2.start();



        }

    }

