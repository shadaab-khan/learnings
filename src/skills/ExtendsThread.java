package skills;

public class ExtendsThread extends Thread {

    public void run(){
        System.out.println("Running child thread");
    }

    public static void main(String[] args) {
        ExtendsThread thread = new ExtendsThread();
        thread.start();
        System.out.println("Started Main Thread");
    }

    public void test(){
        System.out.println("Testing thread implementation");
    }
}