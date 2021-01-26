package patient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseContent {
	public static void main (String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader(" c:/temp/test.txt"));
		String line;
		String str;
		while ((line = in.readLine()) != null)
		{
	      // Afficher le contenu du fichier
			//  System.out.println (line);
			  StringBuilder strb = new StringBuilder(line);
			  str = strb.reverse().toString();
			  System.out.println(str);
		}
		in.close();

    }
}
