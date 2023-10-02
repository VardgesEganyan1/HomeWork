package homework1.Stack;

public class Stack {
    public char[] stck = new char[10000];
    int tos;
    Stack(){
        tos = -1;
    }

    void push(char item){
        if(tos == 10000){
            System.out.println("wrong");
        }
        else {
            stck[++tos] = item;
        }
    }

    char pop(){
        if(tos<0){
            System.out.println("wrong");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }

    public  int getIndex(){
        return  tos;
    }
}
