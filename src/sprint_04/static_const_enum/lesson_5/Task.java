package sprint_04.static_const_enum.lesson_5;

public class Task {

   private  TaskPriority priority ;
    private String description;

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    // добавьте метод get для приоритета


    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}