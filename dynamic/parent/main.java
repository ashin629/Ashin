class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child's show()");
    }
}

public class main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
