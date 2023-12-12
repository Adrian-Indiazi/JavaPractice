class Adrian
 {


     int age;
     String name;
    public void show(){
        System.out.println("in Adrian show");
    }
    public void config(){
        System.out.println("in adrian config");
    }

 }
 class Indiazi extends Adrian{
     @Override
     public void show() {
         System.out.println("in show Indiazi");
     }


 }

public class Overriding extends Indiazi{

    public static void main(String[] args) {
        Indiazi adrian = new Indiazi();
        adrian.show();
     }
     public void display(){
         System.out.println("i love you");
     }
}