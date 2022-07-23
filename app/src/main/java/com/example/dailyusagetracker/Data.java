package com.example.dailyusagetracker;

public class Data {
    private String item, date, notes, id;
    private int amount;

    public Data(){}

    public Data(String item, String date, String id, String notes, int amount) {
        this.id = id;
        this.item = item;
        this.date = date;
        this.notes = notes;
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
