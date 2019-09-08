import jdk.nashorn.internal.codegen.CompilationException;

public class A {
    // filename: Main.java
    static int i;
    int j;

//    Constructor
    A(){
        System.out.println("Constructor called");
    }

    // start of static block
    static {
        i = 10;
        System.out.println("static block called ");
    }
    // end of static block
}

class B {

}

class Main {
    public static void main(String args[]) {

        // Although we don't have an object of Test, static block is
        // called because i is being accessed in following statement.
        try {
            A a1 = new A();
            throw new Test();
//            throw new ClassNotFoundException("Not able to Start");
//        } catch (ClassNotFoundException cnfe){
//            System.out.println("ClassNotFoundException Exception");
//            cnfe.printStackTrace();
        } catch (Test i){
            System.out.println("Caught Exception : " + i);
        }catch (Exception e){
            System.out.println("General Exception");
            throw e;
        }
    }

    static class Test extends Exception{}
}
