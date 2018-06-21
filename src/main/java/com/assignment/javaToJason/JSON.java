package com.assignment.javaToJason;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

import org.springframework.stereotype.Component;

@Component
//@Qualifier("JSON")
//@Primary 
public class JSON implements Save{

	@Override
	public void save(Object obj) {
		
		Field[] fields = obj.getClass().getFields();
		
		StringBuilder content = new StringBuilder();
		
		content.append("{ \n");
		for(int i = 0; i< fields.length; i++) {
			try {
				content.append("\"" + fields[i].getName() + "\" : " );
				content.append("\"" + fields[i].get(obj) + "\" \n " );
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		content.append("} \n");
		System.out.println(content);
		
		
		}
	
//		String writeFile(String path, String context) throws IOException {
//		File file = new File("/Users/ahmedmirza/Documents/workspace-sts-3.9.1.RELEASE/java-to-json/teacher.json");
//		BufferedWriter out = new BufferedWriter(new FileWriter(file));
//		out.write(context);
//		out.close();
//		return context;
//		
//		}
	
	
	
//	@Override
//	public void save() {
//		
//		ObjectMapper mapper = new ObjectMapper();
//		Teacher teacher = createObject();
//		
//		try {
//			//JSON from file to Object
//			mapper.writeValue(new File("/Users/ahmedmirza/Documents/workspace-sts-3.9.1.RELEASE/java-to-json/teacher.json"), teacher);
//			
//			// Convert object to JSON string
//			String jsonInString = mapper.writeValueAsString(teacher);
//			System.out.println(jsonInString);
//
//			// Convert object to JSON string and pretty print
//			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(teacher);
//			System.out.println(jsonInString);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}

//	private Teacher createObject() {
//		Teacher teacher = new Teacher();
//		
//		teacher.setName("Aleem");
//		teacher.setAge(22);
//		teacher.setSalary(10000);
//		
//		return teacher;
//		
//	}

}
