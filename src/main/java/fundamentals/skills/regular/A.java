package fundamentals.skills.regular;

import jdk.nashorn.internal.codegen.CompilationException;

import java.util.HashMap;
import java.util.Map;

public class A extends Exception {
    // filename: Main.java
    static int i;
    int j;

//    Constructor
    A(){
        System.out.println("Constructor A called");
    }

    // start of static block
    static {
        i = 10;
        System.out.println("static block called of A");
    }
// end of static block
}

class B extends A {
    B() {
        System.out.println("Class B Exception");
    }
}

class Main {

    {
        System.out.println("Initializer block of Main");
    }
    static int j;
    // start of static block
    static {
         j = 10;
        System.out.println("static block called of Main");
    }
    // end of static block

    public static void main(String args[]) {

        // Although we don't have an object of Test, static block is
        // called because i is being accessed in following statement.
        try {
//            A a1 = new A();
            Main main = new Main();
            throw new Test();

//            throw new ClassNotFoundException("Not able to Start");
//        } catch (ClassNotFoundException cnfe){
//            System.out.println("ClassNotFoundException Exception");
//            cnfe.printStackTrace();
        } catch (Test i){
            System.out.println("Caught Exception Test: " + i.getMessage());
        }catch (Exception e){
            System.out.println("General Exception");
            throw e;
        }
    }

    static class Test extends Exception{
        Test() {
            System.out.println("Custom Exception for class Test");
            try{
                Main main = new Main();
                throw new B();
            }catch (B b){
                System.out.println("Caught Exception for class B");
            }
        }
    }
}
