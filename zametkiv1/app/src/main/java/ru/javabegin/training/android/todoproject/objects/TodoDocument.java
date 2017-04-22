package ru.javabegin.training.android.todoproject.objects;

import java.io.Serializable;
import java.util.Date;

import ru.javabegin.training.android.todoproject.enums.PriorityType;

public class TodoDocument implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7367289796391092618L;

	public TodoDocument() {
		// TODO Auto-generated constructor stub
	}

	public TodoDocument(String name, String content, Date createDate, PriorityType priorityType) {
		super();
		this.name = name;
		this.content = content;
		this.createDate = createDate;
		this.priorityType = priorityType;
	}

	private PriorityType priorityType = PriorityType.LOW;
	private Integer number;
	private String name;
	private String content;
	private Date createDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public PriorityType getPriorityType() {
		return priorityType;
	}
	
	public void setPriorityType(PriorityType priorityType) {
		this.priorityType = priorityType;
	}
	

	@Override
	public String toString() {
		return name;
	}



}
