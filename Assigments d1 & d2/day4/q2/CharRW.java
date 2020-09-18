package day4.q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharRW {

	public static void main(String[] args) throws IOException {
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("text.txt")));
				BufferedWriter br2 = new BufferedWriter(new FileWriter(new File("text.txt"),true));)
		{
		String line = null;
		while((line = br.readLine()) !=  null) {
			System.out.println(line);
		}          
		
		
		
		br2.newLine();
		br2.write("this is the new line added");
		br2.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
