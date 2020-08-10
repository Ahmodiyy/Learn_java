package OopsConcept;

public class ParentChild {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.parenting();

        Child child = (Child) parent;
        child.childing();

    }
}
