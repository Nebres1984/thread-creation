package MultiExcutor;

import java.util.Random;

public class Task extends Thread {

        Random random = new Random();
        String output = null;

    @Override
    public void run() {
       output = "Task number : " + random.nextInt(100);
       System.out.println(output);
    }

    @Override
    public void start() {
        System.out.println("Starting thread " + this.getName());
        super.start();
    }

    public String getOutput() {
        return output;
    }

}
