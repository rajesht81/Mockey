package com.mockey.model;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

@Test
public class ServiceTest {

	@Test
	public void addTagsToService() {
		Service service = new Service();
		String arg1 = "development";
		String arg2 = "development";
		String arg3 = " development ";
		String arg4 = "DEVELOPMENT";
		service.addTagToList(arg1);
		service.addTagToList(arg2);
		service.addTagToList(arg3);
		service.addTagToList(arg4);

		assert (service.getTagList().size() == 1);

	}

	@Test
	public void addTagListToService() {
		Service service = new Service();
		String arg1 = "development";
		String arg2 = "development";
		String arg3 = " development ";
		String arg4 = "DEVELOPMENT";

		List<String> argList = new ArrayList<String>();
		argList.add(arg1);
		argList.add(arg2);
		argList.add(arg3);
		argList.add(arg4);

		assert (service.getTagList().size() != 1);

		service.setTagList(argList);
		assert (service.getTagList().size() == 1);

	}
	
	@Test
	public void addSpaceTagListToService() {
		Service service = new Service();
		String arg1 = "development";
		String arg2 = "development";
		String arg3 = " development ";
		String arg4 = "DEVELOPMENT";
		String arg5 = "abc def DEF ABC";

		List<String> argList = new ArrayList<String>();
		argList.add(arg1);
		argList.add(arg2);
		argList.add(arg3);
		argList.add(arg4);
		argList.add(arg5);
		
		assert (service.getTagList().size() == 0) : "Length should have been 0 but was " + service.getTagList().size();
		
		service.setTagList(argList);
		StringBuffer result = new StringBuffer();
		for(String a: service.getTagList()){
			result.append(a + " ");
		}
		assert (service.getTagList().size() == 3) : "Length should have been 3 but was " + service.getTagList().size() + " '" +result.toString().trim() + "' ";


	}
}
