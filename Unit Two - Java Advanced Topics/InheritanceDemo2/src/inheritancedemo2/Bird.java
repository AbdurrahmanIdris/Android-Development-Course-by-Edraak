package inheritancedemo2;
public class Bird extends Animal{
    public Bird(){
        super();
        System.out.println("A new bird has been created");
    }//end constr.

    @Override
    public void eat() {
        System.out.println("A Bird Sleeps..");
    }

    @Override
    public void sleep() {
        System.out.println("A Bird eats..");
    }
    
    
}//end class
