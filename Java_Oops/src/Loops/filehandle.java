package Loops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class filehandle 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("../Java_Oops/preetijaav.txt");
		//FileReader fr = new FileReader(f); //to read character by character
		//BufferedReader br= new BufferedReader(fr); //to read line by line
		FileWriter fw = new FileWriter(f); // to write into file
		FileWriter fw1 = new FileWriter(f, true); // to append use boolean append
		BufferedWriter bw = new BufferedWriter(fw);// to write a line
		BufferedWriter bw1 = new BufferedWriter(fw1);// to get appended file
								
							//*********Read Character By Character
		/*int a;
		
		while((a=fr.read())!= -1) // read character till end
		{
			System.out.println((char)a);
		}*/
								//*******Read Line By Line
		/*String s; 
		while((s=br.readLine())!= null) // read character till end
		{
			System.out.println(s);
		}*/
		
							// ********** Write a line into file
		bw.write("This is new line to add");
		bw.newLine();
		bw.write("Second line added");
		bw1.newLine();
		bw1.write("Third Line");
		bw1.newLine();
		bw1.write("Forth Line");
		bw.close();
		bw1.close();	
		
	}
}
