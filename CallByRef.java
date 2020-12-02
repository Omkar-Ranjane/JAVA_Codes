/*
    Call By Reference

    In this approch, a reference to an argument(not the values of the argument) is passed to the parameter.

    This reference is used to access the actual argument specified in the call.

    This means that changes made to the parameter will affect the argument used to call the subroutine.
*/

class Test1{
    int a, b;

    Test1(int i, int j){
        a = i;
        b = j;
    }

    // Pass an object
    void meth(Test1 t){
        t.a += 5;
        t.b -= 5;
    }
}
public class CallByRef {
    public static void main(String args[]){
        Test1 ob = new Test1(10, 10);

        System.out.println("a and b before call : " + ob.a + " " + ob.b);
        ob.meth(ob);

        System.out.println("a and b after call : " + ob.a + " " + ob.b);
    }    
}
