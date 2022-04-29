/*
Author: Evan Gertis
Date: 04/29
program: sort words
*/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exercise20_01 {
  public static void main(String args[]){
    if(args.length != 1){
      System.out.println("Usage: java Temp.txt");
    }
    
    try {
      sortWordsAlphabetically(args[0]);
    }
    catch (Exception ex){
      System.out.println("invalid file");
    }
  }
  public static void sortWordsAlphabetically(String file){
    PriorityQueue queue = new PriorityQueue<WordComparator>();
    try{
      //Step 1: read the text file
      File wordsFile = new File(file);
      Scanner reader = new Scanner(wordsFile);
      System.out.print("The words in the file are ");
      //Step 2: read the words from the text file
      while(reader.hasNextLine()){
        String word = reader.nextLine();
        System.out.print(word+" ");
        //Step 3: add the wrods to a 
        //        priority queue with a comparator to sort them alphabetically
        boolean result = queue.add(word);
      }
      reader.close();
    }
    catch (FileNotFoundException e){
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    System.out.println();
    //Step 4: print the words from the priority queue
    while(!queue.isEmpty()){
      System.out.print(queue.poll()+" ");
    }
  }
  
  public class WordComparator implements Comparator<String>{
    @Override
    public int compare(String w1, String w2){
      if(w1.charAt(0) > w2.charAt(0)){
        return -1;
      }
      else if( w1.charAt(0) < w2.charAt(0)){
        return 1;
      }
      else {
        return 0;
      }
    }
  }
}