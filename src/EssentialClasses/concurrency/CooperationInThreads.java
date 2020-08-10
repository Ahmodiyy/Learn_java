package EssentialClasses.concurrency;

import sun.net.www.protocol.http.HttpURLConnection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class CooperationInThreads {
    private Deque<Weblink> deque = new ArrayDeque();
// the shared object Weblink
    private static class Weblink {
        private long id;
        private String title;
        private String url;
        private String host;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }
    }
// the page downloader
    private static class Downloader implements Runnable{
        private Weblink weblink;
        public Downloader(Weblink weblink){
            this.weblink = weblink;
        }
        @Override
        public void run() {

        }
    }
    // page indexer
    //note when a page get downloaded it must be index concurrently
    private static class Indexer implements Runnable{
        private Weblink weblink;
        public Indexer(Weblink weblink){
            this.weblink = weblink;
        }


        @Override
        public void run() {

        }
    }

    //some methods of the CooperationInThread Class

    private void addingLinkToStructure(Weblink link){
        deque.add(link);
    }

    private Weblink linksInformationAdder(Long id, String title, String url, String host){
        Weblink weblink = new Weblink();
        weblink.setId(id);
        weblink.setTitle("java");
        weblink.setUrl(url);
        weblink.setHost(host);
        return weblink;
    }

    public void go(){
        while (deque.size() > 0){
            Weblink weblink = deque.remove();
            Thread downloaderThread = new Thread(new Downloader(weblink));
        }
    }
    public static void main(String[] args) {
        CooperationInThreads cooperationInThreads = new CooperationInThreads();
        cooperationInThreads.addingLinkToStructure(cooperationInThreads.linksInformationAdder(1L, "java", "https://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com"));



    }
}
