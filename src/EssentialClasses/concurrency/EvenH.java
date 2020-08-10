package EssentialClasses.concurrency;

public class EvenH implements Runnable{
    MyThreadCooperation myThreadCooperationH;
    EvenH(MyThreadCooperation myThreadCooperation){
        this.myThreadCooperationH = myThreadCooperation;
    }
    void printingEven() {
        for (myThreadCooperationH.a = 2; myThreadCooperationH.a < 10; myThreadCooperationH.a = myThreadCooperationH.a + 2) {
            myThreadCooperationH.evenWaititng();
        }
    }

    @Override
    public void run() {
        printingEven();
    }
}
