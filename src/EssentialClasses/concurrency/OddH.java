package EssentialClasses.concurrency;

public class OddH implements Runnable{
    MyThreadCooperation myThreadCooperationH;
    OddH(MyThreadCooperation myThreadCooperation){
        this.myThreadCooperationH = myThreadCooperation;
    }
    void printingOdd() {
        for (myThreadCooperationH.b = 1; myThreadCooperationH.b < 10; myThreadCooperationH.b = myThreadCooperationH.b + 2) {
            myThreadCooperationH.oddWaiting();
        }
    }

    @Override
    public void run() {
        printingOdd();
    }
}
