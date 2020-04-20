package InheritanceConcept;
public class MatchBox extends Box{
    double weight;
    public MatchBox(){
    }//end constructor
    
    public MatchBox(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }//end constructor with params
    public static void main(String[] args) {
        MatchBox mb1 = new MatchBox(10, 10, 10, 10);
        mb1.getVolume();
        System.out.println("Width of match box is "+mb1.width);
        System.out.println("height of match box is "+mb1.height);
        System.out.println("depth of match box is "+mb1.depth);
        System.out.println("weight of match box is "+mb1.weight);
    }//end main    
}//end class
