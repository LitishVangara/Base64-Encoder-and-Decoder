package com.jsp.encoder;

import java.util.Base64;
import java.util.Scanner;

public class StringToBase64 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to Encode the value : ");
		String stringEncoding=scan.nextLine();
		System.out.println("Before Encoding :"+stringEncoding);
		Base64.Encoder encoder=Base64.getEncoder();
		String encodedString=encoder.encodeToString(stringEncoding.getBytes());
		System.out.println("Encoded String : "+encodedString);
	}
}