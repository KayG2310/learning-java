class Pen{
    String color;
    String brand;

    // constructor 
    Pen(){
        this.color = "";
        this.brand = "";
    }
    Pen(String color, String brand){
        this.color = color; 
        this.brand = brand;
    }
    // POLYMORPHISM --> SAME NAME OF FUNCTION, BUT DIFF PARAMETERS INSIDE AND DIFF FUNCTIONALITIES
    // FUNCTION OVERLOADING --> There should be atleast one differentiating factor 
    // this is also compile time polymorphism 
    public void printinfo(){
        System.out.println("brand is: "+this.brand);
        System.out.println("color: "+this.color);
    }
    public void printinfo(String name){
        System.out.println("brand is: "+this.brand);
    }
    public void printinfo(int color){
        System.out.println("color: "+this.color);
    }
    // ------------- X ------------------------------

}

// INHERITANCE 
/*
single level inheritance shape->triangle
multi level inheritance shape-> triangle 
                        triangle->equilateral
hierarchial inheritance shape->triangle 
                        shape ->circle 

*/
class shape{
    String name;
}
class Triangle extends shape{
    // will have the properties of shape inherited 
}
public class oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.brand = "octave";
        pen1.printinfo();
        Triangle t1 = new Triangle();
        t1.name = "right"; // no error as triangle inherits name from shape 

    }
}
