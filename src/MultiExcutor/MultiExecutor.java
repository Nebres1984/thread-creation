package MultiExcutor;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {

    // Add any necessary member variables here
    List<Runnable> tasks;
    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        this. tasks = tasks;
    }


    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        List<Thread> taskList = new ArrayList<>();
        tasks.forEach(task -> {
           Thread thread = new Thread(task);
           taskList.add(thread);
        });

        taskList.forEach(Thread::run);
    }

    public static boolean isTrue() {
        return true;
    }

}