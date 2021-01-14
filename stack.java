public class stack{
char []data;
int size;
public stack(int a){
data = new char[a];
size=0;
}
public void push(char a){
    if(size==data.length){
    System.out.println("space error!");
    }
    else{
    data[size]=a;
    size++;
    }
}
public char pop(){
    if(size==0){
    System.out.println("nothing to pop");
    }
    else{
    char temp = data[size-1];
    data[size-1]=0;
    size--;
    return temp;
    }
    return 0;
}
public boolean isEmpty(){
    if(size==0){
    return true;
    }
    return false;
}
}