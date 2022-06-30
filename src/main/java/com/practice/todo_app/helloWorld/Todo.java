package com.practice.todo_app.helloWorld;

import java.util.Date;
import java.util.Objects;

public class Todo {
    private long id;
    private String username;
    private String desc;
    private Date targeDate;
    private boolean isDone;
    
    public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Todo(long id, String username, String desc, Date targeDate, boolean isDone) {
        this.id = id;
        this.username = username;
        this.desc = desc;
        this.targeDate = targeDate;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getTargeDate() {
        return targeDate;
    }

    public void setTargeDate(Date targeDate) {
        this.targeDate = targeDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return id == other.id;
	}
    
    
    
}
