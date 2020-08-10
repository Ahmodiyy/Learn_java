package EssentialClasses.concurrency;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class PublicAccountH {
    static class BankAccountH implements Runnable{
        private int balance;
        Lock lock = new ReentrantLock();

        public void setBalance(int balance){
            lock.lock();
            try{ this.balance= balance; }
            finally {
                lock.unlock();
            }
        }


        public void withdrawal(int amount){
            lock.lock();
            try{   if(amount <= balance ){
                balance -= amount;
                System.out.println(Thread.currentThread().getName()+ ": has withdraw successfully\n Account bal: $"+balance);
            }
            else {
                System.out.println(Thread.currentThread().getName()+ ": insufficient fund \n balance $"+balance);
            }}
            finally {
                lock.unlock();
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
       BankAccountH bankAccountH = new BankAccountH();
        bankAccountH.setBalance(100);

        Thread thread1 = new Thread(bankAccountH);
        Thread thread2 = new Thread(bankAccountH);
        thread1.setName("john");
        thread1.start();

        thread2.setName("anita");
        thread2.start();



    }
}
