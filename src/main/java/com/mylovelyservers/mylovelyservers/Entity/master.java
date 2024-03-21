package com.mylovelyservers.mylovelyservers.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "master_table")
public class master {
    @Id
    private String id;
    private String by;
    private String target;
    private String notes;
    private Timestamp time;
    private String dueDate;

    public master(String by,String target, String notes, Timestamp time, String dueDate, String id){
        this.by = by;
        this.target = target;
        this.notes = notes;
        this.time = time;
        this.dueDate =dueDate;
        this.id=id;
    }

    public String getby(){
        return this.by;
    }
    public String gettarget(){
        return this.target;
    }
    public String getNotes(){
        return this.notes;
    }
    public Timestamp getTime(){
        return this.time;
    }
    public String getDueDate(){
        return this.dueDate;
    }
}
