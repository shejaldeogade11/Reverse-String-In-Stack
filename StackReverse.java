//      QUESTION 3 reverse stack


import java.util.*;
public class StackReverse{                                        //her to start reverse function
    public static void pushAtBottom(Stack<Integer> s, int data){

          if(s.isEmpty()){
            s.push(data);
            return;
          }

        int top = s.pop();  //remove all element and store
        pushAtBottom(s,data);
        s.push(top);    //that data add in pop time remove from top                 //end her revrse method
    }
    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top =s.pop();         //go in top then pop element
        reverseStack(s);   //call by next level
        pushAtBottom(s,top);  //push element in bottom
    }

    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]){
        Stack <Integer> s = new Stack<> ();
        s.push(1);
        s.push(2);
        s.push(3);

       // reverseStack(s);
        //3 2 1
        printStack(s);
        //1 2 3

           
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
    }
}