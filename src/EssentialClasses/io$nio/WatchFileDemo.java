package EssentialClasses.io$nio;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.*;

public class WatchFileDemo {
    private WatchService watchService;
    Path path = Paths.get("C:\\new");

    void watching() throws IOException {
        while(true) {
            watchService = FileSystems.getDefault().newWatchService();
            path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY, OVERFLOW);
            try {
                WatchKey key = watchService.take();
                List<WatchEvent<?>> li = key.pollEvents();
               li.forEach(t ->
                    System.out.println(t.kind())
                );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        WatchFileDemo watchFileDemo = new WatchFileDemo();
        try {
            watchFileDemo.watching();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
