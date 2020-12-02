// This program includes methods inside box class

class Box{
    double width;
    double height;
    double depth;

    // Display volume of box
    void volume(){
        System.out.println("Volume is " + (width * height * depth));
    }
}

public class ClassMethods {
    public static void main(String args[]){
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // Assign values to mybox1 instance variable
        mybox1.width = 3;
        mybox1.height = 20;
        mybox1.depth = 15;

         // Assign values to mybox2 instance variable
         mybox2.width = 3;
         mybox2.height = 6;
         mybox2.depth = 9;

         // Display volyme of first box
         mybox1.volume();
         
         // Display volyme of second box
         mybox2.volume();
    }    
}
