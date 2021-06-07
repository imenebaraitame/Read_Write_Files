import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


public static void main(String args[]) {
	    
	    	
	 //File file = new File("C:\\Users\\2021\\Desktop\\fichierdemo.txt");
	 
	 //if the file exist in the project folder then you can type the name 
	 //of the file without the path.
	 
	  //use FileWriter in existing file
	 File file2 = new File("fichierdemo.txt");
	 try {
		FileWriter file = new FileWriter("fichierdemo.txt");
		file.write("/n this test");
		file.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 if(file2.exists()) {
		 System.out.println("that file exists! :o!");
		 System.out.println(file2.getPath());
		 System.out.println(file2.getAbsolutePath());
		 System.out.println(file2.isFile());
		// file2.delete();
	 }else {
		 System.out.println("That file doesn't exist :(");
	 }
	    
  //file writer
  try {
	  // create list.txt using FileWriter
         FileWriter ecrire = new FileWriter("list.txt");
         ecrire.write("to do list \n by apple\n by orange and milk.");
         ecrire.append("\n kitchen items.");
         ecrire.close();
  }
  catch(IOException e){
	     e.printStackTrace();
  }
  
  //File Reader = read the contents of a file as a stream of characters.
  //              One by one read() returns an int value which contains the byte value
  //              when read() returns -1, there is no more data to be read.
  try {
	FileReader lire = new FileReader("fichierdemo2.txt");
	
	int data = lire.read();
	//System.out.println((char)data); this return the first character
	while(data != -1) {
		System.out.print((char)data);
		data = lire.read();
	}
	lire.close();
  	
  }catch(FileNotFoundException e) {
	  e.printStackTrace();
  }
  catch (IOException e) {
	  e.printStackTrace();
  }

  
}
}
