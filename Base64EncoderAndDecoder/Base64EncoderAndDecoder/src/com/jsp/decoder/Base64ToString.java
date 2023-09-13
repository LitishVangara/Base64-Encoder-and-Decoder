package com.jsp.decoder;

import java.util.Base64;
import java.util.Scanner;

public class Base64ToString
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Encoded value to Decode : ");
		String stringEncoding = scan.nextLine();
		System.out.println("Before Decoding : "+stringEncoding);
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodedBytes = decoder.decode(stringEncoding);
		String decodedString = new String(decodedBytes);
		System.out.println("Decoded string :"+ decodedString);	
	}
}