package OopsConcept;

public enum EnumDemo {
    BIOGRAPH(122),
    HORROR(222);
    private final int code;
    EnumDemo(int code){
        this.code = code;
    }

    int showValues(){
        return code;
    }
    public static void main(String[] args) {
        for(EnumDemo enumDemo: EnumDemo.values()){
            System.out.println(enumDemo);
            System.out.println("\"note\"");
            System.out.println(enumDemo.showValues());
        }

    }
}
