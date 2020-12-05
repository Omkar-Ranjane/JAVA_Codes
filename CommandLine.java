/*
    Demonstrate Commmand line Argument
    >> javac CommandLine.java
    >> java CommandLine This is argument
    >> args[0]: This
       args[1]: is
       args[2]: test
*/

public class CommandLine {
    public static void main(String args[]){
        for(int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
