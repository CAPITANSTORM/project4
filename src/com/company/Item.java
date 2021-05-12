/*
Chase Alexander
Project 4
5/11/21
 */

package com.company;

public class Item implements Comparable<Item> {
    private String title;
    private String description;
    private Integer priority;
    static int numItems = 0;

    // Constructor

    public Item() {
        numItems++;
    }

    public Item(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        numItems++;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    // To String


    @Override
    public String toString() {
        return "Name: " + title + ", Description: " + description + ", Priority: " + priority + "\n";
    }

    public void display() {
        System.out.printf("Title: %s | Description: %s | Priority: %d", title, description, priority);
    }

    @Override
    public int compareTo(Item other) {
        int compareResult = this.title.compareTo(other.title); // By itself sorts it alphabetically
        compareResult = this.priority.compareTo(other.priority); // By itself (overrides since it's written last) sorts priority highest to lowest
        return compareResult;
    }


}