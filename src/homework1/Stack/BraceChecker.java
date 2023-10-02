package homework1.Stack;

public class BraceChecker {

    private String text;
     Stack stack = new Stack();
    //boolean bool;

    BraceChecker(String text){
        this.text = text;
        //this.bool = true;

        //Stack stack = new Stack();
    }



    public void check(){

        Stack stack = new Stack();
        int size = text.length();
        int pop;
        char c;

        for (int i = 0; i < size; i++) {
            c = text.charAt(i);


            switch (c) {
                case '{':
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case '}':
                    pop = stack.pop();
                    if(pop == 0){
                        System.out.println("Error. " + c + " closed, but not opened. at " + i);
                    }
                    else if(pop != '{')
                    {
                        System.out.println("Error. " + c + " closed, but opened " + (char)pop + " at " + i);
                    }
                    break;
                case ')':
                    pop = stack.pop();
                    if(pop == 0){
                        System.out.println("Error. " + c + " closed, but not opened. at " + i);
                    }
                    else if(pop != '(')
                    {
                        System.out.println("Error. " + c + " closed, but opened " + (char)pop + " at " + i);
                    }
                    break;
                case  ']':
                    pop = stack.pop();
                    if(pop == 0){
                        System.out.println("Error. " + c + " closed, but not opened. at " + i);
                    }
                    else if(pop != '[')
                    {
                        System.out.println("Error. " + c + " closed, but opened " + (char)pop + " at " + i);
                    }
                    break;

            }

        }

        while (stack.getIndex() != -1){
            System.out.println("Error. Opened " +  stack.pop());
        }

    }

}
