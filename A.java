class thread extends Thread {
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("sadik");
        }
    }
}

class A {
    public static void main(String[] args) {
        
        thread t = new thread();
        t.start();
        System.out.println("Main:\n");

        t.start();
    }
}