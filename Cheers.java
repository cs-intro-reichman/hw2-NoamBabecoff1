public class Cheers {
        public static void main(String[] args) {
        String input = args[0];
        int num = Integer.parseInt(args[1]);
        String special = "AEFHILMNORSX";

        String upper = input.toUpperCase();

        for (int i = 0; i < upper.length(); i++) {
            char c = upper.charAt(i);
            if (special.indexOf(c) != -1) {
                System.out.println("Give me an " + c + ": " + c + "!");
            } else {
                System.out.println("Give me a  " + c + ": " + c + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < num; i++) {
            System.out.println(upper + "!!!");
        }
    }
}
