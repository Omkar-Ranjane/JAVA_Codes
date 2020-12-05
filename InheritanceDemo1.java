/*
    Inheritance is one of the cornerstones of object-oriented programming because it allows the creation of hierachical
    classification. 
    Using inheritance, you can create a general class that defines traits comman to a set of related items.
    The class that does the inheriting is called a subclass.
    Therefore, a subclass is a specialized version of a superclass.
    It inherits all of the members defined by the superclass and adds its own, unique elements.

    A simple example of inheritance
*/

class A{
    int i, j;

    void showij(){
        System.out.println("i and j : " + i + " " + j);
    }
}

// Create a subclass by extending class A
class B extends A{
    int k;

    void showk(){
        System.out.println("k : " + k);
    }
    
    void sum(){
        System.out.println("i+j+l : " + (i+j+k));
    }
}   

public class InheritanceDemo1 {
    public static void main(String args[]){
        A superOb = new A();
        B  subOb = new B();

        // The superclass may be used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb : ");
        superOb.showij();
        System.out.println();

        // The subclass has access to all public members of its superclass
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb : ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i, j and k in subOb : ");
        subOb.sum();
    }
}
