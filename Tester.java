//Gabbie Chang P10
import javax.swing.JOptionPane;

public class Tester {
 public static void main (String [] args) {   
     String equation = JOptionPane.showInputDialog(null, "Enter your equation.", "Equation", JOptionPane.QUESTION_MESSAGE);
     boolean isCorrect = true;
     MyDelimiterStack stack = new MyDelimiterStack(equation.length());
     for (int i=0; i<equation.length(); i++) { 
            char current = equation.charAt(i); 
            switch(current) {
                case '{':                  
                case '[':
                case '(':
                    stack.push(current);     
                    break;

                case '}':            
                case ']':
                case ')':
                    if (!stack.isEmpty()) { 
                        char popped = stack.pop(); 
                        if ((current=='}' && popped!='{') || (current==']' && popped!='[') ||(current==')' && popped!='('))
                            isCorrect = false;
                    }
                    else                      
                        isCorrect = false;
                    break;
                default:   
                    break;
            } 
         } 
     if (!stack.isEmpty())
        isCorrect = false;
            
      if (isCorrect) 
         JOptionPane.showMessageDialog(null, "Correct equation.");
     else 
         JOptionPane.showMessageDialog(null, "Sorry, incorrect equation.");
    } 
 }
  
