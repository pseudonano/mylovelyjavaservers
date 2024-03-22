package com.mylovelyservers.mylovelyservers.Entity;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "master_table")
public class master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String by;
    private String target;
    private String notes;
    private Timestamp time;
    private String dueDate;

    public master(String by,String target, String notes, Timestamp time, String dueDate, Long id){
        this.by = by;
        this.target = target;
        this.notes = notes;
        this.time = time;
        this.dueDate =dueDate;
        this.id=id;
    }

    public master(){
        this.by = by;
        this.target = target;
        this.notes = notes;
        this.time = time;
        this.dueDate =dueDate;
        this.id=id;
    }

    public String getBy() {
        return by;
    }

    public String getTarget() {
        return target;
    }

    public String getNotes() {
        return notes;
    }

    public Timestamp getTime() {
        return time;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String dueDate(){
        return this.dueDate;
    }
}
