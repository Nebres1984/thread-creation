package MultiExcutor;

import java.util.ArrayList;
import java.util.List;

public class TaskRunner {

    public static void main(String[] args) {
        int allTasks = 80;
        List<Runnable> taskList = new ArrayList<>();
        for  (int i = 0; i < allTasks; i++) {
            taskList.add(new Task());
        }

        MultiExecutor multiExecutor = new MultiExecutor(taskList);
        multiExecutor.executeAll();
    }

}
