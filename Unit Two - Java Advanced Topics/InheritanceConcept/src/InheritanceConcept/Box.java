package InheritanceConcept;

public class Box {
    double width;
    double height;
    double depth;
    
    public Box(){
                
    }//end constructor 1
    
    public Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;        
    }//end constructor 2
    
    public void getVolume(){
        System.out.println("Volume is "+ width*height*depth);
    }//end getVolume
    
}//end class
