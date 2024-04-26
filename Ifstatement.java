public class Ifstatement {
    public static void main(String[]args){
        /*simple if statement ,takes condiktion /expression with boolean value. */
        if (true){
            System.out.println("true Statement");
        }
        if (false){
            System.out.println("Skipped statement");
        }else{
            System.out.println("false statement");
        }
        /*if condition fails goes to else block /scope. */
        int num1=10,num2=20;
        if(num1>num2){
            System.out.println("Num is greater");
        }else{
            System.out.println("Num2 is greater");
        }
        /*if else if */
        int iNum1=10,iNum2=20;
        if(iNum1==iNum2){
            System.out.println("Equal number");
        }else if(iNum1>iNum2){
            System.out.println("iNum1 is greater");
        }else{
            System.out.println("iNum2 is greater");
        }
        /*note that else should be at the last of the if statement */
        /*if else if ladder ,more that one else if */
        if(iNum1<0){
            System.out.println("iNum is negative");
        }else if(iNum2<0){
            System.out.println("iNum2 is negative");
        }else if(iNum1==iNum2){
            System.out.println("Equal number");
        }else if (iNum1<iNum2){
            System.out.println("iNum is less");
        }else{
            System.out.println("default execution if all fails");
        }
        /*Note that else is not mandatory and can be skipped */
        /*Question */
        int q1 = 10,q2 = 10;
        if (q1>=q2){
            System.out.println("1st statement");
        }else if (q1==q2){
            System.out.println("2nd statement");
        }else{
            System.out.println("default statement");
        }
        /*nested if  */
        int nNum1= -10,nNum2=20;
        if (nNum1<0){
        if(nNum1 > nNum2){
            System.out.println("nNum1 is negative and greater");
        }else{
            System.out.println("nNum2 is negative and lesser");
        }

    }else{
        if(nNum1>nNum2){
            System.out.println("nNum1 is positive and greater");
        }else{
            System.out.println("nNum1 is positive and lesser");
        }
    } /* 

    /*task
     * Given the value below ,add the total and take the average
     * if any of the marking is less than 35,print fail.
     * if average is less than 60 , print"3rd div".
     * if average is less than 70,print"2nd div".
     * if average is less than 80,print"1st div".
     * if average is greater than or equal to 80,print"distinction"
     */

    int math =38, science=60,english=35;
    /*make total variable and average vriable */
            int total = math + science + english;
            double avg = total / 3.0;
    
            // Check for any mark less than 35
            if (math < 35 || science < 35 || english < 35) {
                System.out.println("fail");
            } else {
                // Print division based on average
                if (avg >= 80) {
                    System.out.println("distinction");
                } else if (avg < 80 && avg >= 70) {
                    System.out.println("1st division");
                } else if (avg < 70 && avg >= 60) {
                    System.out.println("2nd division");
                } else if (avg < 60) {
                    System.out.println("3rd division");
                }
            }
        }
    }

