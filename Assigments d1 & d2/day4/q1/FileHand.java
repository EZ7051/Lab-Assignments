package day4.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileHand {

	public static void main(String[] args) throws IOException {
		
//		FileInputStream fis = new FileInputStream(new File("text.txt"));
//		int tmp;
//		BufferedReader br2=new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));
//		String line=null;
//		br2.re
//		while((line=br2.readLine())!=null) {
//			System.out.println(line);
//		}
//		br2.close();
//		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("text.txt"))))) {
			StringBuilder s = new StringBuilder();
			int data;
			System.out.println("Byte Format :");
			while ((data = br.read()) != -1) {
				System.out.print(data + " ");
				s.append((char) data);
			}
			System.out.println("\nFormatted Output:");
			System.out.println(s.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
