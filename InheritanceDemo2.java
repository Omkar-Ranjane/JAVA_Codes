/* 
    Although subclass includes all of the members of its superclass, it cannot access those members of the superclass
    that have been declare as private.

    Lets look more practical example that will help to illustrate the power of inheritance.
    This program uses inheritance to extends Box
*/

class Box4{
    double width, height, depth;

    // Construcct clone of an object
    Box4(Box4 ob){
        // Pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructor used when all dimensions specified
    Box4(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions specified
    Box4(){
        // use -1 to indicate an uninitialized box
        width = height = depth = -1;         
    }

    // Constructor used when cube is created
    Box4(double len){
        width = height = depth = len;
    }

    // Compute and return volume
    double volume(){
        return width * height * depth;
    }
}

// Here, Box is extended to include weight
class BoxWeight extends Box4{
    double weight;      //weight of box

    // Constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class InheritanceDemo2 {
    public static void main(String args[]){
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox2.weight);
    }    
}
