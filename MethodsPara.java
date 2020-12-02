// This program uses a parameterized methods
class Box{
    double width, height, depth;

    // Compute and return volume
    double volume(){
        return width * height * depth;
    }

    // Set dimensions of box
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
public class MethodsPara {
    public static void main(String args[]){
        Box mybBox = new Box();

        // Initilize box
        mybBox.setDim(10, 20, 15);

        // Get volume of box
        System.out.println("Volume of box is " + mybBox.volume());
    }
    
}
