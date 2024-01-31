import java.util.ArrayList;

/*
1. Tilføj en opgave ***
2. Fjern en opgave ***
3. Vis alle opgaver ***
4. Vis mængden af todos ***
5. Sorter opgaver
6. Opdater en opgave ***
7. Søg efter en opgave
8. Filter opgaver
* */

public class TodoList {
    private ArrayList<Todo> todoList = new ArrayList<>();
    private ArrayList<Todo> todoListToEdit = new ArrayList<>();


    public TodoList() {
    }

    @Override
    public String toString() {
        return
                "todoList=" + todoList
                ;
    }

    public void addTodo(Todo newTodo) {
        todoList.add(newTodo);
    }

    public void removeTodo(Todo newTodo) {
        todoList.remove(newTodo);
    }

    public ArrayList<Todo> showAllTodos(TodoList myTodoList) {
        int increment = 1;
        for (Todo todo : myTodoList.todoList) {
            todoListToEdit.add(todo);
            System.out.println(increment + " " + todo);

            increment++;

        }
        return todoListToEdit;
    }

    public String totalTodos(TodoList myTodoList) {
        return "You have " + myTodoList.todoList.size() + " todo's left";

    }

    public Todo findTodo(int index) {
        return todoList.get(--index);
    }

}
