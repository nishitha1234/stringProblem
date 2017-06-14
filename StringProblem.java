package com.string.problem;

public class StringProblem {
	public String removeChar(String input, char ch)
	{
		int len = input.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< len;i++)
		{
			if(input.charAt(i) != ch)
			{
				sb = sb.append(input.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	public String removeCharUsingReplace(String input, String ch)
	{
		String result = input.replace(ch, "");
		return result;
	}

}
