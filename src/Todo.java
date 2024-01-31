public class Todo {
    private String task;
    private boolean isCompleted;


    public Todo(String task) {
        this.task = task;
        this.isCompleted = false;
    }

    public String toString() {
        return "TODO  task: " + this.task + " - completed: " + isCompleted;

    }

    public String getTask() {
        return task;
    }

    public String setTask(String task) {
       return this.task = task;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }



}
