package OopsConcept;

public class PrivateConstructorDem {
   private String nickName;
   private String fname;
   private String lname;
   private PrivateConstructorDem(String nickName){
        this.nickName= nickName;
    }

    PrivateConstructorDem(String fname, String lname){
        this("fola");
        this.fname= fname;
        this.lname = lname;

    }
    void namePrint(int... g){
        //varargs

        System.out.println(g[0]*g[1]);
        System.out.println(g[2]*g[3]);
    }
    public static void main(String[] args) {
        PrivateConstructorDem privateConstructorDem = new PrivateConstructorDem("JOH");
//        PrivateConstructorDem P = new PrivateConstructorDem("SAM", "JOHN");
        privateConstructorDem.namePrint(1,2,5,5);


    }
}
