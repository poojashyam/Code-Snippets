import java.util.*;
import java.io.*;

public class wordbreak {
	public static void word_break(){
		int n;
		String word;
		TreeMap<String,Integer> Dictionary1 = new TreeMap<String, Integer>();
		System.out.println("Enter words to add in the dictionary");
		Scanner scr = new Scanner(System.in);
		File filename = new File("/users/poojashyam/desktop/input.txt");
		int count = 0;
		try{
			FileReader inputfile = new FileReader(filename);
			BufferedReader br = new BufferedReader(inputfile);
			String line;
			while((line = br.readLine())!=null){
				System.out.println(line);
				Dictionary1.put(line,count);
				count++;
				
			}
			System.out.println("Map contains");
			System.out.println(Dictionary1);
			System.out.println("Enter the word to break up");
			word = scr.nextLine();
			//System.out.println(word);
			String c1=null;
			// c2;
			for(int i = 0;i<=word.length();){
				c1 = word.substring(0, i);
				
				if(Dictionary1.containsKey(c1))
				{
					System.out.println(c1);
					System.out.println(i);
					i++;
					int j = 0;
					j = i-1;
					//c1 = word.substring(j, word.length());
					//System.out.println(c1);
					for(int k = j; k<=word.length();)
					{
						c1 = word.substring(j, k);
						if(Dictionary1.containsKey(c1))
						{
							System.out.println(c1);
							break;
						}
						else
							k++;
					}
						
				}
				else
					i++;
			}
			
			br.close();
		}
		catch(IOException e){
			System.out.println("File not found");
			
		}
	}

}
