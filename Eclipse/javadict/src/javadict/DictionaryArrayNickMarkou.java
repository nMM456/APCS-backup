package javadict;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class DictionaryArrayNickMarkou {
static File websterFile;
public static String[] arr = new String[200];
public static String[] vowelArr = new String[200];
static int arrNum = 0;
static int vowelCount = 0;
static int longestWord2 = 0;
static int longestword2print = 0;
static int arrCount = 0;
//arrNum is to locate the shortest word in the Array, used in shortestCount() and vowelCount()
//The method below fills the array arr with every 1000th word
//Array dictionary project by Nicholas Markou.
public static String[] fillArray() throws IOException
{
	Scanner in = new Scanner(websterFile);
	for (int i=0;i<200;i++)
	{
		int n=0;
		for (n=0;n<999;n++)
		{
			in.next();
		}
		arr[i] = in.next();
	}
	return arr;
}
//This method prints any statements needed

//This method finds the shortest word inside the array of 200 words.
public static void shortestCount() throws IOException
{
	charCount = arr[0].length();
	for (int i=0;i<arr.length;i++)
	{
		if (arr[i].length() < charCount)
		{
			charCount = arr[i].length();
			arrNum = i;
		}
	}
	printArray();
}
public static void printArray() throws IOException
{
	for (int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("The shortest word is " + arr[arrNum] + " with "+charCount+" characters.");
	System.out.println("Vowels in the smallest word: " + vowelCount);
	System.out.println("2nd Longest word: "+arr[longestword2print]);
	System.out.print("Words with 6 vowels: ");
	for (int i=0;i<arrCount;i++)
	{
		System.out.print(vowelArr[i] +" ");
	}
}
//This method counts the vowels in the shortest word.
public static void vowelCount() throws IOException
{
	String str = arr[arrNum];
	str = str.toLowerCase();
	for (int i=0;i<str.length();i++)
	{
		if (str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
		{
			vowelCount++;
		}
	}
}
//This method is used to find the second longest word.
public static void secondLongest() throws IOException
{
	String longest = arr[0];
	String secLongest = arr[0];
	
	for (int i=0;i<arr.length;i++)
	{
		if (arr[i].length() > longest.length())
		{
			longest = arr[i];
		}
	}
	
	for (int i = 0; i<arr.length;i++)
	{
		if (arr[i].length() < longest.length() && arr[i].length() >= secLongest.length())
		{
			secLongest = arr[i];
		}
	}
	System.out.println(secLongest);
}
//This method is used to find words that have 6 or more vowels.
public static void vowelArray() throws IOException
{
	int vowelCount = 0;
	for (int i=0;i<arr.length;i++)
	{
		vowelCount = 0;
		String str = arr[i];
		str = str.toLowerCase();
		for (int n=0;n<arr[i].length();n++)
		{
			if (str.charAt(n) == 'a' || str.charAt(n) == 'e'|| str.charAt(n) == 'i' || str.charAt(n) == 'o' || str.charAt(n) == 'u')
			{
				vowelCount++;
			}
		}
		if (vowelCount >= 6)
		{
			vowelArr[arrCount] = arr[i];
			arrCount++;
		}
	}
}
public static void main(String[] args) throws IOException
{
    websterFile = new File ("websters_dictionary.txt");
    fillArray();
    shortestCount();
    vowelCount();
    secondLongest();
    vowelArray();
    printArray();
}
}