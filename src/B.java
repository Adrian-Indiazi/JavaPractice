class A {
    int age = 50;
    String name;

    public void dingDong() {
        System.out.println("i love you");
    }

    public void setName(String name) {
        this.name = name;
            }
            public void adr (){
                System.out.println("i love adriano");
            }

    public void setAge(int age) {
        this.age = age;
    }
}

class C extends A{
    int age = 200;
    public void display(){


        System.out.println(super.age);
        setName("TAGALGAL");
        System.out.println();
        System.out.println(super.name);
    }

}

public class B  {
    public static void main(String[] args) {
        C c = new C();
        c.display();
        c.dingDong();
        c.setName("adriano");
        System.out.println(c.name);

    }

}
