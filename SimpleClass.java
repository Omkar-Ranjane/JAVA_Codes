//A program that uses the Box Class

class Box{
    double width;
    double height;
    double depth;
}
public class SimpleClass{
    public static void main(String args[]){
        Box mybox = new Box();
        double vol;

        //Assign values to mybox's instance variable
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        //Compute volume of box
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume of box is " + vol);
    }
}