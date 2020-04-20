package inheritancedemo2;
public class Dog extends Animal{
    public Dog(){
        super();
        System.out.println("A new dog has been created");
    }//end constr.

    @Override
    public void eat() {
        System.out.println("A Dog Sleeps..");
    }

    @Override
    public void sleep() {
        System.out.println("A Dog eats..");
    }
    
}//end class
