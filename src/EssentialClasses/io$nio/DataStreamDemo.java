package EssentialClasses.io$nio;

import java.io.*;

public class DataStreamDemo {
    DataOutputStream dataoutputStream;
    String StringBio = "BIO";
    String name = "Bola";
    double age = 12;
    char gender = 'f';
    void did() throws IOException{
       try{
           dataoutputStream = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("C:\\IoDemo\\data")));
           dataoutputStream.writeUTF(StringBio);
           dataoutputStream.writeUTF(name);
           dataoutputStream.writeDouble(age);
           dataoutputStream.writeChar(gender);
       }
       catch (IOException d){
           d.printStackTrace();
       }
       finally {
           dataoutputStream.close();
       }

    }

    void dod() throws IOException {
        DataInputStream dataInputStream;

        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(
                    new FileInputStream("C:\\IoDemo\\data")));
            String h = null;
            boolean stopInfinity = true;
            while(stopInfinity){
                try {
                    System.out.println(dataInputStream.readUTF());
                    System.out.println(dataInputStream.readUTF());
                    System.out.println(dataInputStream.readDouble());
                    System.out.println(dataInputStream.readChar());
                    if (dataInputStream.read() < 0){
                        stopInfinity = false;
                    }
                }
                catch (EOFException e){
                    e.printStackTrace();
                }


            }
        } catch (IOException d) {
            d.printStackTrace();
        } finally {
            dataoutputStream.close();
        }
    }
    public static void main(String[] args) throws IOException {
        DataStreamDemo dataStreamDemo = new DataStreamDemo();
        dataStreamDemo.did();
        dataStreamDemo.dod();

    }
}
