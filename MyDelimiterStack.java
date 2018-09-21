//Gabbie Chang P10

class MyDelimiterStack {
    public MyDelimiterStack(int length) {           
        maxSize = length;               
        stackArray = new char[maxSize]; 
        top = -1;                
    }

    public void push(char x) {        
        stackArray[++top] = x;        
    }

    public char pop() {             
        return stackArray[top--];     
    }

    public char peek() {               
        return stackArray[top];
    }

    public boolean isEmpty() {    
        return (top == -1);
    }

    public boolean isFull() {        
        return (top == maxSize-1);
    }
    
    private int maxSize;        
    private char[] stackArray;
    private int top;
}