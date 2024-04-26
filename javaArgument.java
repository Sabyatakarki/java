public class javaArgument {
    public static void main(String[]args){
        /*the args in the main function can be used
         * to take input from command line
         * when executing the file we can pass arguments
         * Eg:
         * java javaarguments args1 args2
         * the args1 ang args2 can be accessed from args
         */

         if (args.length<2){
            System.out.println("please provide 2 arguments");
            return;
         }
         /*use index of args array to access */
         System.out.println("arguments 1 is "+args[0]);
         System.out.println("arguments 2 is "+args[1]);
    }
}
