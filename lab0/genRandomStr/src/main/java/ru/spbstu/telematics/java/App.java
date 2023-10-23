package ru.spbstu.telematics.java;
import java.util.Random;
import java.lang.String;

public class App 
{
    	public static char generateRandomChar(){
	Random random = new Random();
		final int randomNumber = random.nextInt(26);	
		final char randomLetter = (char)('a' + randomNumber);
		return randomLetter;
    	}
    	public static String generateRandomString(int symbsNum){
		String resultString = "";
		for(int i = 0; i < symbsNum; i++){
			//resultString.append(generateRandomChar());
			resultString += generateRandomChar();
		}
		return resultString;
    	};
    	public static void main( String[] args ) {
		if(args.length != 1){
			return;
		}
		final int symbsAm = Integer.parseInt(args[0]);
		System.out.println(generateRandomString(symbsAm));
		return;
    	}
}
