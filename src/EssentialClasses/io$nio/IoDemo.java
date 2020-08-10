package EssentialClasses.io$nio;

import java.io.*;

public class IoDemo implements Serializable{
    private static int notSerialized = 9;
    private String st = "joan";
    private transient int testTransiet = 54;

    public static int getNotSerialized() {
        return notSerialized;
    }

    public static void setNotSerialized(int notSerialized) {
        IoDemo.notSerialized = notSerialized;
    }

    void byteStreamDemo() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        int c = 0;
 // not recommended due to the fact that we are dealing not with byte data like images
        try {
            in = new FileInputStream("C:\\xanadu.txt");
            out = new FileOutputStream("C:\\outagain.txt");

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                in.close();
            }

        }
    }
        void charaacterStream() throws IOException {
            FileWriter chin = null;
            FileReader chout = null;


            try {
                chin = new FileWriter("C:\\xanadu.txt");
                chout = new FileReader("C:\\xanadu.txt");
                chin.write("That a poem");
                chin.close();
                int d;
                while((d = chout.read()) != -1){
                    System.out.print((char)d);
                }
            } catch (IOException e) {

                e.printStackTrace();
            } finally {
                if (chin != null) {
                    chin.close();
                }
                if (chout != null) {
                    chout.close();
                }

            }
        }
    public static void main(String[] args) throws IOException {
        IoDemo ioDemo = new IoDemo();
       // ioDemo.byteStreamDemo();
        ioDemo.charaacterStream();
        ioDemo.setSt("joan");
        ioDemo.setTestTransiet(5);
        setNotSerialized(9);
 /*       int f;
        FileInputStream im = new FileInputStream("C:\\photo15.jpg");
        while((f= im.read()) != -1){
            System.out.print((char) f);
        }
        im.close();

  */


    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public int getTestTransiet() {
        return testTransiet;
    }

    public void setTestTransiet(int testTransiet) {
        this.testTransiet = testTransiet;
    }
}
