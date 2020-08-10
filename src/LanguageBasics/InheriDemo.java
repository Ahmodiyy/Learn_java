package LanguageBasics;
import java.lang.annotation.Documented;

@Documented
@interface Author {
    String name();
}

@Author(name = "Mahmud Ahmod")
public interface InheriDemo {
    void doSomething();
    default  void doSomethingElse(){
        System.out.println("What is your next action?");
    }
    //helper
    static void helping(){
        System.out.println("helping method in an interface");
    }

    interface InheritDemoPro {
        void OkItIsDone();
    }

    class UserInheritor implements InheriDemo {
        @Override
        public void doSomething() {

        }

        void working() {
            System.out.println("We are working to add more features");
        }
    }

        public static void main(String[] args) {
            InheriDemo done = new UserInheritor();
            InheriDemo inheriDemo = done::doSomethingElse;
            inheriDemo.doSomethingElse();
            UserInheritor userInheritor = new UserInheritor();
            helping();







        }
    }

