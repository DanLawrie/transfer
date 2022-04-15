package edu.monmouth.CaesarCipher;

import java.util.ArrayList;

public class Cipher {
	short offset = 0;
	String message ="";
	ArrayList<Character> list = new ArrayList<>();
	String newWord = "";
	char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's','t', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	public Cipher(String message, short offset)
	{
		this.offset = offset;
		this.message= message;
	}
	public Cipher()
	{
		
	}
	public String encode()
	{
		
		for(int i = 0; i<message.length(); i++)
		{
			char word = message.charAt(i);
			if(word == ' ')
			{
				list.add(word);
			}
			else
			{
				int num = (int)word;
			
			num = num + offset;
			if(num > 122)
			{
				num = num-122;
				num = num+96;
			}
			word = (char)num;
			list.add(word);
			}
		}
		for(char one : list)
		{
			newWord = newWord + Character.toString(one);
		}
		return newWord;
	}
}
