package com.yahoo.answer;

/**
 *
 * @author MrAlex6204
 */
public class CodeExample {

    /*
    Yahoo Question Link:
    https://answers.yahoo.com/question/index?qid=20141204022233AA6i8mH
    
    Solution:
    You can't declare a function inside other funcion.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 4,b=3,c=4;
        int minNumber  = minimum(a, b, c);//Call the function, and it will return the result and save in this variable.
        System.out.println("The minimum number of :"+a+","+b+","+c+" is :"+minNumber);
    }
    
    public static int minimum(int a,int b, int c){
        return Math.min(a, Math.min(b, c));
    }
    
}
