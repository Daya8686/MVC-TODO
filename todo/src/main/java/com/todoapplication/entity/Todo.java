package com.todoapplication.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank
	@Size(min = 5, max = 255, message = "Author Name should be minimum of 5 charaters")
	private String authorName;
	@Size(min = 2, message = "Name must not be less the 5 characters")
	private String username;
	@Size(min = 10, message = "Course Name must not be less the 10 characters")
	private String courseName;
	@FutureOrPresent(message = "You can not select date in past!!")
	private LocalDate targetDate;
	@Column(name="is_done")
	private boolean isDone;
		
	public Todo() {
		super();
	}
	
	public Todo(int id,
			@NotBlank @Size(min = 5, max = 255, message = "Author Name should be minimum of 5 charaters") String authorName,
			@Size(min = 5, message = "Name must not be less the 5 characters") String username,
			@Size(min = 10, message = "Course Name must not be less the 10 characters") String courseName,
			@FutureOrPresent(message = "You can not select date in past!!") LocalDate targetDate, boolean isDone) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.username = username;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", authorName=" + authorName + ", username=" + username + ", courseName=" + courseName
				+ ", targetDate=" + targetDate + ", isDone=" + isDone + "]";
	}
	
	
	
	
	

}
