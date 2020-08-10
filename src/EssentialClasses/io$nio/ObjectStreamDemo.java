package EssentialClasses.io$nio;

import java.io.*;


public class ObjectStreamDemo {


    //    public void setTestTransiet(int testTransiet){
//        this.testTransiet = testTransiet;
//    }
//    public  int getTestTransiet(){
//        return testTransiet;
//    }
    IoDemo io = new IoDemo();

    void streaming() {

        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream("C:\\IoDemo\\dem.ser")))
        {
            objectOutputStream.writeObject(io);

            // u cannot serialize a static fields and a transient bc0z the former is at the class level and the latter transient keyword means do not serialize
        } catch (IOException e) {
            e.getMessage();

        }
    }

    void deStreaming() {
        IoDemo io = new IoDemo();
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream("C:\\IoDemo\\dem.ser"))) {
            try {
                Object ob = objectInputStream.readObject();
                System.out.println("ob: " + ob);

            } catch (ClassNotFoundException a) {
                a.getMessage();

            }

        } catch (IOException e) {
            e.getMessage();
        }

    }

    public static void main(String[] args) {
        //Console console = System.console();
        new ObjectStreamDemo().streaming();
        new ObjectStreamDemo().deStreaming();


    }
}
