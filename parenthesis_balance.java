import java.util.Scanner;
public class parenthesis_balance{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);    
    String str = sc.nextLine();
    char ch[] = new char[str.length()];
    for(int i=0;i<str.length();i++){
    ch[i]= str.charAt(i);
    }
    boolean kemonequation = parenthesischeck(ch);
    if(kemonequation==true){
    System.out.println("balanced");
    }
    else{
    System.out.println("Not balanced!!!");
    }
    }
    static boolean parenthesischeck(char []ch){
    stack a1 =  new stack(ch.length);
    for(int i=0;i<ch.length;i++){
      char x = ch[i];
      if(x=='('||x=='['|| x=='{'||x==')'||x=='}'||x==']'||x=='<'||x=='>'){
            if(x=='('||x=='['|| x=='{'||x=='<'){
      a1.push(x);
      continue;
      }
      if(a1.isEmpty()){
      return false;
      }
      switch(x){
          case ')':
              char p = a1.pop();
              if(p == '{' || p == '['||p =='<')
                  return false;
              break;
          case '}': 
                p = a1.pop(); 
                if (p == '(' || p == '['||p=='<')
                    return false; 
                break; 
          case ']': 
               p = a1.pop(); 
                if (p == '(' || p == '{'||p=='<')
                    return false; 
                break;
          case '>':
              p = a1.pop();
              if (p == '(' || p == '{'||p=='[')
                  return false;
              break;
      }
      }else{
      continue;
      }
      }
       return (a1.isEmpty());
    }
    }

 
