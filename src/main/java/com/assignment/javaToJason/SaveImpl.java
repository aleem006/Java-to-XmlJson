package com.assignment.javaToJason;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveImpl {
	
	@Autowired
	private Save save;
	
	
	public SaveImpl(Save save) {
		super();
		this.save = save;
	}
	
	public void run(Object obj) {
		save.save(obj);
	}

}
