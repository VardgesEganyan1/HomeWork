
package homework1.Stack;


import java.util.*;


public class BraceChackerTest
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }



}
    /*
        public static boolean asd(String s) {
            char[] chars = s.toCharArray();

            //System.out.println("Please enter the braces");
            Deque<Character> stack = new ArrayDeque<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                    continue;

                }

                    char pope;
                    switch (c) {
                        case ')':
                            pope = stack.pop();
                            if (pope == '{' || pope == '[') {
                                return false;
                            }
                            break;
                        case ']':
                            pope = stack.pop();
                            if (pope == '(' || pope == '{') {
                                return false;
                            }
                            break;
                        case '}':
                            pope = stack.pop();
                            if (pope == '(' || pope == '[') {
                                return false;
                            }
                            break;
                        default:
                            return true;
                    }





            }

            return stack.isEmpty();
        }

    public static void main(String[] args) {

            String x = "({[]}";

            if(asd(x)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }

     */




