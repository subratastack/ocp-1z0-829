package nestedclasses;

public class NestedInsideNested {
    private int t = 1;

    class B {
        private int t = 2;

        class C {
            private int t = 3;
            public void printT() {
                System.out.println(t);
                System.out.println(this.t);
                System.out.println(B.this.t);
                System.out.println(NestedInsideNested.this.t);
            }
        }
    }

    public static void main(String[] args) {

        NestedInsideNested n = new NestedInsideNested();
        B b = n.new B();
        B.C c = b.new C();
        c.printT();
    }
}
