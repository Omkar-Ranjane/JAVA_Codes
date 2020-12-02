/* 
    Call By Value
    
    This approch copies the values of an argument into the formal parameter of subroutine.
    
    Therefore, chamges made to the parameter of the subroutine have no affect of argumet
    
    Demonstrate argument passing Call By Value 
*/

class Test{
    void meth(int i, int j){
        i += 5;
        j += 5;
    }
}

public class CallByValue {
    public static void main(String args[]){
        Test ob = new Test();
        int a = 10, b = 20;

        System.out.println("a and b before call : " + a + " " + b);
        ob.meth(a, b);

        System.out.println("a and b after call : " + a + " " + b);
    }    
}
