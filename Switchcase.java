public class Switchcase {
    public static void main(String[]args){
        char value='a';
        int numVal=10;
        switch (value){
            case 'a':
            //Nested switch
            switch(numVal){
                case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("default");
                break;

            }
        }
            System.out.println("Apple");
            break;
            case 'b':
            System.out.println("ball");
            break;
            case 'c':
            System.out.println("cat");
            break;
            case 'd':
            System.out.println("dog");
            break;
            default:
            System.out.println("no word found");
            break;
        }  
    }


/*Task
 * Consider the variable week in int
 * if the value is 
 * 0=print sunday
 * 1=print monday
 * 2=print tuesday
 * 3=print wednesday
 * 4=print thrusday
 * 5=print friday
 * 6=print saturday
 * if the value is other than these print invalid week
 */


 /*check the wednesday in switch */


