package com.api.testing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Validation_JSON {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		File f = new File("C:\\Users\\DR\\eclipse-workspace\\Mmaven\\src\\test\\java\\com\\api\\testing\\Payload.json");
		
		FileReader reader = new FileReader(f);
		
		JSONParser jsonparse = new JSONParser();
		
		Object parse = jsonparse.parse(reader);	
		
		JSONObject jsonobj = (JSONObject) parse;
		
		Object object = jsonobj.get("name");		
		
		String string = object.toString();
		
		System.out.println(string);
		
		Object object1 = jsonobj.get("desigination");
		
		String string1 = object1.toString();
		
		System.out.println(string1);
	}

}
