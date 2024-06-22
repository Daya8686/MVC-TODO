package com.todoapplication.entity;

import java.time.LocalDate;

public class Todo {
	
	private int id;
	private String authorName;
	private String courseName;
	private LocalDate targetDate;
	private boolean isDone;
		
	
	public Todo() {
		super();
	}
	public Todo(int id, String authorName, String courseName, LocalDate targetDate, boolean isDone) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.courseName = courseName;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean getIsDone() {
		return isDone;
	}
	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", authorName=" + authorName + ", courseName=" + courseName + ", targetDate="
				+ targetDate + ", isDone=" + isDone + "]";
	}
	
	

}
