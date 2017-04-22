package ru.javabegin.training.android.todoproject.objects;

import java.util.ArrayList;

import android.app.Application;

public class AppContext extends Application{
	
	public static final String ACTION_TYPE = "ru.javabegin.training.android.todoproject.AppContext.ActionType";
	public static final String DOC_INDEX = "ru.javabegin.training.android.todoproject.AppContext.ActionIndex";
	
	public static final int ACTION_NEW_TASK = 0;
	public static final int ACTION_UPDATE = 1;
	
	public static final String FIELD_CONTENT = "content";
	public static final String FIELD_NAME = "name";
	public static final String FIELD_CREATE_DATE = "createDate";
	public static final String FIELD_PRIORITY_TYPE = "priorityType";
	
	private ArrayList<TodoDocument> listDocuments = new ArrayList<TodoDocument>();
	
	public ArrayList<TodoDocument> getListDocuments() {
		return listDocuments;
	}
	
	public void setListDocuments(ArrayList<TodoDocument> listDocuments) {
		this.listDocuments = listDocuments;
	}
	
	public String getPrefsDir(){
		return getApplicationInfo().dataDir+"/"+"shared_prefs";
	}
	

}
