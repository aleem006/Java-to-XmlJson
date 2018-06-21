package com.assignment.javaToJason;

import java.lang.reflect.Field;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class XML implements Save{

	@Override
	public void save(Object obj) {
		
		Field[] fields = obj.getClass().getFields();
		
		StringBuilder content = new StringBuilder();
		
		content.append("<" + obj.getClass().getSimpleName() + "> \n" );
		for(int i = 0; i< fields.length; i++) {
			try {
				content.append("\t<" + fields[i].getName() + ">" );
				content.append(fields[i].get(obj) );
				content.append("</" + fields[i].getName() + "> \n" );
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		content.append("</" + obj.getClass().getSimpleName() + ">" );
		System.out.println(content);
		
		
	}
	
//	@Override
//	public void save(Object obj) {
//		
//		Teacher teacher = createObject();
//
//		  try {
//
//				File file = new File("/Users/ahmedmirza/Documents/workspace-sts-3.9.1.RELEASE/java-to-xml/employee.xml");
//				JAXBContext jaxbContext = JAXBContext.newInstance(Teacher.class);
//				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//				// output pretty printed
//				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//				jaxbMarshaller.marshal(teacher, file);
//				jaxbMarshaller.marshal(teacher, System.out);
//
//			      } catch (Exception e) {
//				e.printStackTrace();
//			      }
//	}
//	
//	private Teacher createObject() {
//		Teacher teacher = new Teacher();
//		
//		teacher.setName("Aleem");
//		teacher.setAge(22);
////		teacher.setId(111);
//		
//		return teacher;
//		
//	}
	

}
