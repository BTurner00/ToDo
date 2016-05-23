package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<ToDoItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create new item");
            System.out.println("2. Toggle item");
            System.out.println("3. List items");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    // create new item

                    System.out.println("Enter your To-Do item: ");
                    String text = scanner.nextLine();
                    ToDoItem item = new ToDoItem(text, false);
                    items.add(item);
                    break;
                case "2":
                    // toggle item
                {
                    System.out.println("Enter the # of the item you wish to toggle:");
                    String numStr = scanner.nextLine();
                    int num = Integer.valueOf(numStr);
                    ToDoItem tempItem = items.get(num - 1);
                    tempItem.isDone = !tempItem.isDone;
                    break;
                }
                case "3":
                    //list items
                    int i = 1;
                    for (ToDoItem toDoItem : items) {
                        String checkbox = "[ ]";
                        if (toDoItem.isDone) {
                            checkbox = "[x]";
                            System.out.println(checkbox + " " + i + ". " + toDoItem.text);
                            i++;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }

            }
        }
    }

