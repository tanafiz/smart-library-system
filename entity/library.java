package entity;
import java.lang.*;
import javax.swing.*;

import frame.framesample;

import java.io.*; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class library extends framesample
{ 
	
	private String username;
    private String password;
    private String bookTitle;
    private String authorName;
    private String isbn;
    private String category;
	private String status;
    private String condition;
    private String review;
	
	private File file;
	private FileWriter fwriter;
	
	public library() { }
	public library( String username, String password, String bookTitle, String authorName, String isbn, String category, String condition, String status, String review)
    {
		
	    this.username = username;
	    this.password = password;
	    this.bookTitle = bookTitle;
	    this.authorName = authorName;
	    this.isbn = isbn;
	    this.category = category;
	    this.condition = condition;
		this.status = status;
	    this.review = review;
    }
	
	public void insertInfo()
	{
		try 
		{
			file = new File("./Data/userdata.txt");
			if (!file.exists()) {
                file.getParentFile().mkdirs(); 
                file.createNewFile(); 
            }
	
			LocalDateTime dateObj = LocalDateTime.now();
			DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("hh:mm a, dd-MM-yyyy");
			String timeAndDate = dateObj.format(formatObj);
			
			fwriter = new FileWriter(file, true);
			fwriter.write("Date and Time: " + timeAndDate + "\n");
			fwriter.write("========================================================"+"\n");
			fwriter.write("**********" + status + "**********" + "\n");
			fwriter.write("User Name: " + username + "\n");
            fwriter.write("Password: " + password + "\n");
            fwriter.write("Book Title: " + bookTitle + "\n");
            fwriter.write("Author Name: " + authorName + "\n");
            fwriter.write("ISBN Number: " + isbn + "\n");
            fwriter.write("Book Category: " + category + "\n");
            fwriter.write("Book Condition: " + condition + "\n");
            fwriter.write("Book Review: " + review + "\n");
			fwriter.write("--------------------------------------------------------------"+"\n");
			fwriter.write("\n");
			fwriter.flush(); 
			fwriter.close();
		}
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error writing to file!");
		}
	}
}