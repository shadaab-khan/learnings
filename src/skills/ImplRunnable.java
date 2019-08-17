package skills;

public class ImplRunnable extends ExtendsThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Implementing child thread");
    }

    public static void main(String[] args) {

        ImplRunnable implRunnable = new ImplRunnable();
        implRunnable.test();
        Thread t = new Thread(implRunnable);
        t.start();
        System.out.println("Inplementing Main Thread");

    }

}

