package LanguageBasics;


class OuterClass {
    int a = 0;

    static class StaticNestedClass {

    }

    class InnerClass {
        int a = 1;

        void shadowing(int a) {
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(OuterClass.this.a);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass nestedObject = new StaticNestedClass();
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.shadowing(2);
    }
}
