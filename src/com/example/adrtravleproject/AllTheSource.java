package com.example.adrtravleproject;

import java.util.ArrayList;

import android.content.Context;

import com.example.adrtravleproject.mydb.MyDB;

public class AllTheSource {
	private static AllTheSource instance = null;
	private Context context;
	private MyDB myDB;
	
	private AllTheSource(){}
	
	public static void initialize(Context context){
		instance = new AllTheSource();
		instance.context = context;
		instance.myDB = new MyDB(context);		
	}
	
	public static void close() {
		instance.myDB.close();
	}
	
	public static AllTheSource getInstance(){
		if (instance == null)
			throw new RuntimeException("call initialize plz");
		return instance;
	}
	public Context getContext() {
		return context;
	}
	public MyDB getDB(){
		return myDB;
	}
}
