
 import java.util.Stack;
 class Parenthesis {

    public boolean isValid(String s) {  
            Stack<Character>stack = new Stack<>();
        
        
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
           
            
            
            if(stack.empty()){
                
            if(i!=s.length()-1){
            stack.push(c);
                continue;
            }
            else{
                return false;
            }
                
            }
        
        if (stack.peek() == '(' ) {
            if(c== ')'){
            stack.pop();
            }
            
            else {
                stack.push(c);
                }
        }
            
             
        else if (stack.peek() == '{') {
            if(c=='}'){
            stack.pop();
            }
            else {
                stack.push(c);
                }
        }
             
       else if (stack.peek() == '[' ) {
           if(c==']'){
            stack.pop();
            }
            else {
                stack.push(c);
                }
       }
        
    }
    
    
     
        if (stack.empty()){
            
            return true;
            }
            
             return false;
                
}

public  static void main (String[]args){
    Parenthesis vp = new Parenthesis();
    String s = ("()[]{}");
    System.out.println(vp.isValid(s));
}
}
    

