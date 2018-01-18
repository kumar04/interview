package com.interview.serachcharacter;

public class SearchCharacterTest {

	public int searchCharacter(String str, String ch) {

		int length = str.length();
		System.out.println("length:" + length);
		String newString = str.replaceAll(ch, "");
		int newLength = newString.length();
		System.out.println("newLength:" + newLength);
		return length - newLength;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello";
		SearchCharacterTest test = new SearchCharacterTest();
		int totalCount = test.searchCharacter(input, "l");
		System.out.println("Total word count:" + totalCount);
	}

}
