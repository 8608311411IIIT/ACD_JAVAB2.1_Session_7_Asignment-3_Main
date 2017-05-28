//A simple program which takes a string as input from user.then it takes any substring and checks whether that substring is a part of string or not
import java.util.*;
public class String3{

     public static void main(String[] args) {
          String string,data; //string stores string and data stores substring 
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the string");
          string=sc.next();//takes string as input
          System.out.println("Enter the substring which you want to search");
          data=sc.next();//takes substring as input
          char[] strChar = string.toCharArray();
          char[] dataChar = data.toCharArray();
     
             if(isPresent(dataChar, strChar))//if substring is present,then
                  System.out.println("substring found");
                
                  else//if substring not present in string,then
                     System.out.println("given substring not fond");
     }

         public static boolean isPresent(char[] dataChar, char[] strChar) {//function return true if substring present in string else false
                 
              for (int i = 0; i < strChar.length - dataChar.length+1; i++) {//loop which comapres substring to the string
                   for (int j = 0; j < dataChar.length; j++) {
                       if (strChar[i + j] == dataChar[j]) {
                           if (j == dataChar.length - 1) {
                               return true;
                           }
                       } 
                         else {
                            break;
                         }
                   }
              }
           return false;
        }

}


