// Box defined three constructor to initialize the dimensions of the box various ways

class Box3{
    double width, height, depth;
    
    // Constructor used when all dimensions specified
    Box3(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions specified
    Box3(){
        width = height = depth = -1;
    }

    // Constructor used when cube is created
    Box3(double len){
        width = height = depth = len;
    }

    // Compute and return volume
    double volume(){
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String args[]){
        // Create boxes using the various constructor
        Box3 mybox1 = new Box3(10, 20, 15);
        Box3 mybox2 = new Box3();
        Box3 mycube = new Box3(7);

        // Get volume of first box
        double vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // Get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // Get volume of  cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }  
}
