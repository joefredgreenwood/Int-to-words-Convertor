package com.joe.interview.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 

public class Solution {

 

    /**
     * The following is the method where the solution shall be written
     */

 

    public static String solution(String input) throws NumberFormatException {
        
        StringBuilder answer = new StringBuilder();
        
        //Initialise an Array list which will contain all the integers in the input string
        ArrayList<Integer> eachInteger = new ArrayList<Integer>();
        
        //Initialise a Character Array with length of the input string, we will iterate through this and append the array list eachInteger with
        //integer contained in eachCharacter array
        char[] eachCharacter = new char[input.length()];
        eachCharacter = input.toCharArray();
        for (char c : eachCharacter) {
            try {
                String s = String.valueOf(c);
                int currentInt = Integer.parseInt(s);
                eachInteger.add(currentInt);
            } catch (Exception e) {
                continue;
            }
        }
        //Throws exception if input string does not contain any integers
        if (eachInteger.isEmpty()) {
            throw new NumberFormatException("This String Has No Integers!");
            
        }
        
        Collections.sort(eachInteger, Collections.reverseOrder());
        ArrayList<ArrayList<Integer>> test = allCombinations(eachInteger);
        System.out.println(test);
        
        ArrayList<String> list = new ArrayList<String>();
        for (ArrayList<Integer> arrayList : test) {
        	StringBuilder s = new StringBuilder();
//        	ArrayList<Integer> number = new ArrayList<Integer>();
            for (int arrayList2 : arrayList) {
            	s.append(String.valueOf(arrayList2)); 
            }
//            for (int num : number) {
//				s.append(String.valueOf(num));                 
//			}
            list.add(s.toString());
        }
        
        
        Collections.sort(list, Collections.reverseOrder());
        for (String string : list) {
			answer.append(string);
			answer.append(",");
		}
        System.out.println(list);
        answer.replace(answer.length()-1, answer.length(), "");
        System.out.println(answer);
        return null;
        
    }
    
    public static ArrayList<ArrayList<Integer>> allCombinations(ArrayList<Integer> list){
        //Base Case
        if(list.size()==0) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            result.add(new ArrayList<Integer>());
            return result;
        }
        
        ArrayList<ArrayList<Integer>> returnMe = new ArrayList<ArrayList<Integer>>();
        Integer firstElement = list.remove(0);
        
        ArrayList<ArrayList<Integer>> recursiveReturn = allCombinations(list);
        for (ArrayList<Integer> arrayList : recursiveReturn) {
            for (int i = 0; i <= arrayList.size(); i++) {
                ArrayList<Integer> temp = new ArrayList<Integer>(arrayList);
                temp.add(i, firstElement);
                returnMe.add(temp);
                
            }
        }
        return returnMe;
    }

 

    public static void main(String args[]) {
        solution("326");
//        System.out.println("Another Test: ");
//        solution("A 3B2 C6D");
//        System.out.println("Another Test: ");
//        solution("ABC");
    }

 

}