package com.mcnc.yuga.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class FileUtils {
	public static String readFileContent( String fileLocation ){
		try {
			FileInputStream inputStreamcontent = new FileInputStream( fileLocation );
			String fileContent = IOUtils.toString( inputStreamcontent, "UTF-8" );
			IOUtils.closeQuietly( inputStreamcontent );
			return fileContent;
		} catch ( IOException e ) {
			e.printStackTrace();
			return "";
		}
	}
	
	public static String replaceFile (String fileContent, String userName, String projectName, String receiverName,String userId){
		
		 String file = fileContent;
		 file = file.replaceFirst("varSenderName", userName); //set username parameter in txt file
		 file = file.replaceFirst("varProjectName", projectName); //set projectName parameter in txt file
		 file = file.replaceFirst("varUserId", userId); //set sender parameter in txt file
		 file = file.replaceFirst("varReceiverName", receiverName);
		 
		 return file;
	}
	
	public static String replaceApprovedFile (String fileContent,String Message, String userName, String projectName, String receiverName,String userId){
		
		 String file = fileContent;
		 file = file.replaceFirst("varResponseMessage", Message); //set username parameter in txt file
		 file = file.replaceFirst("varSenderName", userName); //set username parameter in txt file
		 file = file.replaceFirst("varProjectName", projectName); //set projectName parameter in txt file
		 file = file.replaceFirst("varUserId", userId); //set sender parameter in txt file
		 file = file.replaceFirst("varReceiverName", receiverName);
		 
		 return file;
	}
	
	
	
}
