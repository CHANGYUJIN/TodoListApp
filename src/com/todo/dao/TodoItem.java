package com.todo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
    private String title;
    private String desc;
    private String current_date;
    private SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
    private String category;
    private String due_date;


    public TodoItem(String category, String title, String desc, String due_date){
        this.title=title;
        this.desc=desc;
        this.current_date=format.format(new Date());
        this.category = category;
        this.due_date = due_date;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(Date current_date) {
        this.current_date = format.format(current_date);
        
    }
    
    public void setCurrent_date(String current_date) {
    	this.current_date = current_date;
    }
    
    
    public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

	@Override
    public String toString() {
    	return "[" + category + "] " + title + " - " + desc + " - " + due_date + " - " + current_date;
    }
    
    public String toSaveString() {
    	return category + "##" + title + "##" + desc + "##" + due_date + "##" + current_date + "\n";
    }
}
