package chat.ten.serverclient;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class UrlWiki {

	public static void main(String[] args) {
		

        URL website = null;
		try {
			website = new
			      URL("https://en.wikipedia.org/wiki/Main_Page"
			      		+ "");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Scanner inputStream = null;
		try {
			inputStream = new Scanner(new InputStreamReader(website.openStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         while (inputStream.hasNextLine())
        {
          String s = inputStream.nextLine();
          System.out.println(s);
        }
        inputStream.close();

	}

}
