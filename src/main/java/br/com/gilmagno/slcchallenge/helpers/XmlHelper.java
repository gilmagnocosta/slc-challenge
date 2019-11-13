package br.com.gilmagno.slcchallenge.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class XmlHelper {
	public static String inputStreamToString(InputStream stream) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    String line;
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
	    while ((line = bufferedReader.readLine()) != null) {
	        sb.append(line);
	    }
	    bufferedReader.close();
	    return sb.toString();
	}
}
