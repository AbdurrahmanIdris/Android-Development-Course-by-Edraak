package inheritancedemo2;
public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();
        
        System.out.println("-----------------------------");
        animal.eat();
        animal.sleep();
        System.out.println("-----------------------------");
        bird.eat();
        bird.sleep();
        System.out.println("-----------------------------");        
    }//end main
    
}//end main class