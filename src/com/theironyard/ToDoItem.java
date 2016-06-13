package com.theironyard;

/**
 * Created by Ben on 5/23/16.
 */
public class ToDoItem {
    String text;
    Boolean isDone;
    int id;

    public ToDoItem(String text, boolean isDone){
        this.text = text;
        this.isDone = isDone;
    }

    public ToDoItem(String text, Boolean isDone, int id) {
        this.text = text;
        this.isDone = isDone;
        this.id = id;
    }
}
