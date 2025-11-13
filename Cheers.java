
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    
            String str = args[0];
            String special = "AEFHILMNORSX";
            int num = Integer.parseInt(args[1]);

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if(special.indexOf(currentChar)!= -1){
                        System.out.println("Give me an "+ currentChar + ": "+currentChar +"!");
                }else{
                        System.out.println("Give me a "+ currentChar + ": "+currentChar +"!");
                }
            }
            System.err.println("What does that spell?");
            for (int i = 0; i < num; i++) {
                System.err.println(str+"!!!");
            }
        }
}
