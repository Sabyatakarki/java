import java.util.Scanner;
//or
//import java.util.*://import all the utils.
public class inputoutput  {
    public static void main (String[]args){
        /*print/output a line with line break 
         * use"sout" shortcut
        */
        System.out.println("this print and  break line");
        /*print the word without line break */
        System.out.print("this will not break line");
        System.out.print("this will not continue\n");

        /*output formatting
         * system.out.printf();
         * %s String,%d integral ,%f floating point,%b boolean
         * this wiil not break line too.
         */

         System.out.printf( "the next word is %s",  "new word");
         System.out.printf("the next line is %d",    10);
         /*you can use multiple formatter */
         System.out.printf("multiple %f %b", 0.9f,false);


         /*user input using Scanner.
          * first import the Scanner class.
          Scanner scan = new Scanner (System.in);//sytem.in is used  as input.
          System.out.println("this print and  break line");
          System.out.println("the followikng takes one word from sentence");
          String oneword= scan.next();
          System.out.println(oneword);
          System.out.println("the following takes whole sentence");
          String wholesentence = scan.nextLine();
          System.out.println(wholesentence);
          System.out.println("the following takes int");
          int intinput = scan.nextInt();
          System.out.println(intinput);
          System.out.println("the following takes boolean ");
          boolean booleaninput = scan.nextBoolean();
          System.out.println(booleaninput);
          scan.close();/* jhgs

          /*Task
           * create a new scanner obj name scan1
           * prompt user for the following 
           * what is your name? -> Save to the String name ,use next line().
           * are you over 18? ->save to boolean status,use nextboolean().
           * how many sibling do you have? -> save int sibling,use nextInt().
           * print the output.
           * hello,name.
           * over 18 status,
           * you have sibling number of sibling.
           */

           Scanner scan1 = new Scanner (System.in);
           System.out.println("whart is your name?");
           String name = scan1.nextLine();
           System.out.println("are you over 18");
           boolean status = scan1.nextBoolean();
           System.out.println("how many sibling you have?");
           int sibling = scan1.nextInt();
           System.out.println("hello,"+name);
           System.out.println("Over 18? ,"+status);
           System.out.printf("you have %d number of siblings\n",sibling);
           scan1.close();
           





    }
    

    
}
