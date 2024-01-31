import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList list = new TodoList();

        Scanner reader = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {

            showMenu();

            switch (getIndex(reader)) {
                case 0 -> {
                    System.out.println("Relax! You have no more todos :D");
                    continueLoop = false;

                }
                case 1 -> {
                    executeAddTodo(reader, list);
                }
                case 2 -> {
                   executeEditTodo(reader, list);
                }
                case 3 -> {
                    executeDeleteTodo(reader, list);
                }
                case 4 -> System.out.println( list.totalTodos(list));


            }
        }
    }

    private static String getInput(Scanner reader) {
        return reader.nextLine();
    }

    private static void showMenu() {
        System.out.println("What do you want to do?");
        System.out.println("Choose the number that represents your choice");
        System.out.println("0 - My todo list is complete");
        System.out.println("1 - Add a todo");
        System.out.println("2 - Edit a task");
        System.out.println("3 - Delete a todo");
        System.out.println("4 - show amount of todo's");
    }

    private static int getIndex(Scanner reader) {
        return Integer.parseInt(reader.nextLine());
    }

private static void executeAddTodo(Scanner reader, TodoList list){
    System.out.println("Write new todo: ");
    Todo newTodo = new Todo(getInput(reader));
    list.addTodo(newTodo);
}
    private static void executeEditTodo(Scanner reader, TodoList list) {
        System.out.println("What task do you want to edit");
        ArrayList<Todo> listToEdit = list.showAllTodos(list);
        System.out.println(listToEdit);
        System.out.println("Select the number representing the task to edit");

        Todo todoToEdit = list.findTodo(getIndex(reader));
        System.out.println("Edit your task");
        todoToEdit.setTask(todoToEdit.setTask(getInput(reader)));
    }
    private static void executeDeleteTodo(Scanner reader, TodoList list) {
        System.out.println("What todo do you want to delete: ");
        list.showAllTodos(list);
        System.out.println("Select the number representing the task to edit");
        Todo todoToDelete = list.findTodo(getIndex(reader));
        list.removeTodo(todoToDelete);
    }
}

