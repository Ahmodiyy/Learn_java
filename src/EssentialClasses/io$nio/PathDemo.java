package EssentialClasses.io$nio;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class PathDemo {
    static void filing(){
        File file1 = new File("C:\\outagain.txt");
        File file2 = new File("C:\\xanadu.txt");
        System.out.println(file1.exists());


        try {
            Files.delete(Paths.get("C:\\deleteSample.txt"));
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
   static void pathing(){
        Path path1;
        path1 = Paths.get("C:\\outagain.txt");
       Path path2;
       path2 = Paths.get("C:\\xanadu.txt");
       System.out.println(path1.getRoot());
       System.out.println(path1.getFileName());
       System.out.println(path1.getFileSystem());
       System.out.println(path1.toUri());
       System.out.println(path1.resolve(path2));
       System.out.println(path1.relativize(path2));
    }
    public static void main(String[] args) {
       pathing();
       filing();

    }
}
