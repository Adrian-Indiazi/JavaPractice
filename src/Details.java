import java.util.Scanner;

class Person{
        private String name;
        private String title;
        private int age;

        public Person(String name, String title, int age){
            this.name = name;
            this.title = title;
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public String getTitle(){
            return title;
        }
        public int getAge(){
            return age;
        }
    }
public class Details {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Enter the details for person 1:");
        System.out.print("Name: ");
        String name1 = input.next();
        System.out.print("Title: ");
        String title1 = input.next();
        System.out.print("Age: ");
         int age1 = input.nextInt();

        System.out.println("Enter the details for person 2:");
        System.out.print("Name: ");
        String name2 = input.next();
        System.out.print("Title: ");
        String title2 = input.next();
        System.out.print("Age: ");
        int age2 = input.nextInt();

        System.out.println("Enter the details for person 3:");
        System.out.print("Name: ");
        String name3 = input.next();
        System.out.print("Title: ");
        String title3 = input.next();
        System.out.print("Age: ");
        int age3 = input.nextInt();

        Person person1 = new Person(name1,title1,age1);
        Person person2 = new Person(name2,title2,age2);
        Person person3 = new Person(name3,title3,age3);

        System.out.println("The name of peron 1 is"+person1.getName()+" the age is"+ person1.getAge()+ " and the title is "+ person1.getTitle());
        System.out.println("The name of peron 2 is"+person2.getName()+" the age is"+ person2.getAge()+ " and the title is "+ person2.getTitle());
        System.out.println("The name of peron 3 is"+person3.getName()+" the age is"+ person3.getAge()+ " and the title is "+ person3.getTitle());

    }
}