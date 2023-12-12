import org.w3c.dom.ls.LSOutput;

class Test {
        private static String name;
        private int age;

        public Test(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public static String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

public class Buffer {
    String name;
    int age;
    public static void main(String[] args) {
        Test test = new Test("adrian",24);
        System.out.println(test.getAge());
        Buffer buffer = new Buffer();
        buffer.age = 333;
        buffer.name = "Adriano";
        System.out.println("my name is " + buffer.age);
        System.out.println("my name is " + Test.getName());

    }

}
