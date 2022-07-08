package nl.tue.gtl.tql;

import java.sql.DriverManager;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class App 
{
    public static void main(String[] args)
    {
    	ArrayList<String> folders = getSrcGenFolders();
    	ArrayList<String> queries = createSelectStaments(folders);
    	
    	for (String query : queries) {
    		printQuery(query);
    	}
    }
    
    public static ArrayList<String> getSrcGenFolders() {
    	ArrayList<String> folders = new ArrayList<String>();
    	
    	String examplesDirectory = System.getProperty("user.dir") + "\\..\\Examples";
    	String srcGenDirectory = "src-gen";
    	
    	final File folder = new File(examplesDirectory);
    	for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
            	folders.add(examplesDirectory + "\\" + fileEntry.getName() + "\\" + srcGenDirectory);
            }
        }
    	
    	return folders;
    }
    
    public static ArrayList<String> createSelectStaments(ArrayList<String> srcGenFolders) {
    	ArrayList<String> selectStatements = new ArrayList<String>();
    	String scriptName = "Select.sql";
    	
    	for (String folder : srcGenFolders) {
    		String file = folder + "\\" + scriptName;
    		try {
				String contents = readFile(file, StandardCharsets.US_ASCII);
				
				boolean first = true;
				for (String selectStatement : contents.split("SELECT")) {
					String query;
					if (first) {
						query = selectStatement;
						first = false;
					} else {
						query = "SELECT" + selectStatement;
					}
					selectStatements.add(query);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	return selectStatements;
    }
    
    static String readFile(String path, Charset encoding)
    		  throws IOException
    		{
    		  byte[] encoded = Files.readAllBytes(Paths.get(path));
    		  return new String(encoded, encoding);
    		}
    
    public static void printQuery(String sql) {
    	String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/sampledb/sample.db";
        Connection conn = null;

        System.out.println();
        System.out.println("Query:");
        System.out.println(sql);
        System.out.println();
        
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    	try (
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql)){

    		ResultSetMetaData rsmd = rs.getMetaData();
    		int columnsNumber = rsmd.getColumnCount();
               // loop through the result set
               while (rs.next()) {
            	   for (int i = 1; i <= columnsNumber; i++) {
            	        if (i > 1) System.out.print(",  ");
            	        String columnValue = rs.getString(i);
            	        System.out.print(columnValue + " " + rsmd.getColumnName(i));
            	    }
            	    System.out.println("");
               }
           } catch (SQLException e) {
               System.out.println(e.getMessage());
           }
    }
}
