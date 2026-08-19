import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class ToDoList {

    private ArrayList<String> tasks;
    private static final String FILE_NAME = "todos.txt";

    public ToDoList() {
        tasks = new ArrayList<>();
        loadTasks();
    }

    public void addTask(String task) {
        tasks.add(task);
    }
