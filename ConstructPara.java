// Here box uses a parameterized constructor to initialize the dimentions of box

class Box2{
    double width, height, depth;

    // This is constructor for box
    Box2(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Compute and return volume
    double volume(){
        return width * depth * height;
    }
}
public class ConstructPara {
    public static void main(String args[]){
        Box2 mybox1 = new Box2(10, 20, 25);
        Box2 mybox2 = new Box2(3, 6, 9);

        // Get volume of first box
        System.out.println("Volume of first box is " + mybox1.volume());

        // Get volume of second box
        System.out.println("Volume of second box is " + mybox2.volume());
    }
}
