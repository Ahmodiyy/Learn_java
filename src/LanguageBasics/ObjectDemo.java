package LanguageBasics;
class ObjectDemo{
    long id;
    String name;
    long contact;
    String student;

    static  int numbersOfStudent;
    ObjectDemo (long id, String subject){
        this.id=id;
        this.name=subject;
    }
    private ObjectDemo(long contact){
       this(1l,"Ayo");
        this.contact=contact;
        System.out.println(id+" "+name+" "+contact);
    }
    ObjectDemo(String student){
        this.student=student;
        System.out.println("number of student: "+(++numbersOfStudent));
    }

    public ObjectDemo demo(){
        ObjectDemo objectDemo = new ObjectDemo(2,"math");
        System.out.println(id+" "+name);
        return objectDemo;
    }
    {
        System.out.println("copy to all constructor");
    }

    public static void main(String[] args) {
        ObjectDemo objectDemo = new ObjectDemo(05055555755);
        objectDemo.demo();
        ObjectDemo dayo = new ObjectDemo("dayo");
        ObjectDemo ola = new ObjectDemo("ola");
        //constants in java
        final double PIE_VALUE=3.142;
    }
}

