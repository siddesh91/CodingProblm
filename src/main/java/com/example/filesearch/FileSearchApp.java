package com.example.filesearch;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSearchApp {

	String path;
	String regex;
	String zipFileName;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public String getZipFileName() {
		return zipFileName;
	}

	public void setZipFileName(String zipFileName) {
		this.zipFileName = zipFileName;
	}



	public static void main(String[] args) {
		/*for (String arg : args) {
			System.out.println(arg);
		}*/

		FileSearchApp app = new FileSearchApp();

		switch(Math.min(args.length, 3)) {

		case 0:
			System.out.println("USAGE: FileSearchApp path [regex] [zipfile]");
			return;
		case 3:
			app.setZipFileName(args[2]);
			case2:
				app.setRegex(args[1]);
			case1:
				app.setPath(args[0]);
		}
		
		try {
			app.walkDirectoryJava8(app.getPath());
		}catch(Exception es) {
			es.printStackTrace();
		}

	}
	
	public void walkDirectory(String path) {
		System.out.println("walkDirectory: " + path);
		searchFile(null);
		addFileToZip(null);
	}

	public void addFileToZip(File file) {
		System.out.println("addFileToZip: " + file);
		
	}
	
	public void walkDirectoryJava8(String path) throws IOException{
		Files.walk(Paths.get(path)).forEach(f -> processFile(f.toFile()));
	}

	private void processFile(File file) {
		System.out.println("processFile: " + file);
	}
	
	public void searchFile(File file) {
		System.out.println("searchFile: " + file);		
	}
	
	public boolean searchFileJava(File file) throws IOException{
		return Files.lines(file.toPath(), StandardCharsets.UTF_8).anyMatch(t -> searchFile(file);)
	}
	

}
