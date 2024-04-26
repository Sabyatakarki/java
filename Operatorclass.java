public class Operatorclass{
    public static void main (String[]args) {
        /*arithematic operation */
        int a=10,b=20;
        int sum = a+b;//here + is an arithematic operator.
        System.out.println("The sum is"+sum);

        System.out.println("the diffrence is "+(a -b));
        System.out.println("the multiplication is "+(a * b));
        System.out.println("the division is "+(a-b));
        System.out.println("the modulo is "+(a % b));

        /*Assignment operator */
        /*declaration and assiagment */
        int number1 = 10;
        int number2;
        /*Assignment after declaration  */
        number2 = 20;
        /*Assignment value using +=  */
        System.out.println("number after using += is "+(number2+=10));
        /*Assign using */
        number2 *= 100;//this is same as doing number2 = number2 * 10.
        System.out.println("number2 after using += is "+ number2);

        /*Relational operator */
         int rNumber1 = 9, rNumber2 = 20;
         System.out.println("Is rNumber equals to rNumber2 ?" + (rNumber1==rNumber2));
         System.out.println("Is rNumber less than rNumber2 ?" + (rNumber1 < rNumber2));
         System.out.println("Is rNumber greater or equals to rNumber2 ?" + (rNumber1==rNumber2));
         System.out.println("Is rNumber and rNUmber not equals to rNumber2?" + (rNumber1==rNumber2));

         /*logical operator */
         int lNumber1 = 20, lNumber2 = 22;
         boolean expressions1 = lNumber1 == lNumber2;
         boolean expressions2 = lNumber1 > lNumber2;
         System.out.println("And expression  uisng && "+(expressions1 && expressions2));
         System.out.println("Or expression  uisng || "+(expressions1 || expressions2));
         System.out.println("Not expression  uisng !"+(!expressions1));


         /*Unary operator */
         int uNumber1 = 10;
         uNumber1 ++ ;//same as uNUmber =uNumber1 +1;
         System.out.print("unary operator using ++" + uNumber1);
         uNumber1 --;//same as uNumber 1= uNumber 1 - 1;
         System.out.print("unary operator using --" + uNumber1);

         /*tenary operator */

         int tNumber1=20 , tNumber2 = 20;
         boolean tExpressions1 = tNumber1==tNumber2;
         /*For tenary ,first you defikne expressions ,if expression is true
          * it returns value after "?"
          if the ecpressions is false
          it returns the valuee after ":"
          syntax
          expreesions? true statement : false statement
         */
        String output = tExpressions1 ? "True condition " : "Flase condition";
        /*further can be seen as
         * string output
         * if (tExpressions1){
         * output = "true condition";
         * }else{
         * output="false condition"
         * }
         */

         int numberOutput = tNumber2 > tNumber2 ? 10:20;
         System.out.println(output);









    }
}