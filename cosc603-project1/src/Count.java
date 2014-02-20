/*
 * COSC603-project1
 */
import java.util.HashMap;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  

// TODO: Auto-generated Javadoc
/**
 * The Class Count.
 */
public class Count {
	 
 	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
 	public static void main(String[] args) {
 		
 	/**
 	 * create HashMap so every word is unique
 	 */
	   BufferedReader Buffer = null;  
	   HashMap<String, Integer> count = new HashMap<String, Integer>();  

	   String ReadFile = "C:/try/Test.txt";  
	   String line;  
	   String[] text;
	   
	   try{  
		   
		    FileReader F = new FileReader(ReadFile); 
		    Buffer = new BufferedReader(F);                  // Read File
		               
		        while ((line = Buffer.readLine()) != null){  // read each word     
		          text = line.toLowerCase().split(" ");  	 // split each string by space and make it not case sensitive

		              for (String wordList : text){  
		            	  if(count.containsKey(wordList))
		                       count.put(wordList,count.get(wordList)+1);// add 1 to each repeated word
		               else
		                     count.put(wordList,0);

		                   }              
		              }
		        
		    }catch (IOException ioe){  
		           System.out.println("CANNOT OPEN THE FILE");  

		       } 
		        for (String word : count.keySet()){  
		            System.out.println( word + "\t is repeated:  " + count.get(word) );  
		          }     

		  }
          }
