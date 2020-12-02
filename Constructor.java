/*
    A constructor initializes and object immediately upon creation. 
    It has same name as the class in which it resides and is synatactically similar to a method.
    Once defined, the construcor is automatically called immediately after the object is created, 
    before the new operator completes.

    Box used constructor to initialize the dimensions of a box
*/

class Box1{
    double width, height, depth;

    // This is the constructor for Box
    Box1(){
        System.out.println("Constructing box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Compute and return the volume
    double volume(){
        return width * height * depth;
    }
}
public class Constructor {
    public static void main(String args[]){
        Box1 mybox = new Box1();

        // Get volume of box
        System.out.println("Volume of box is " + mybox.volume());
    }    
}
