package triangle;

public class Main {
    private int result=-1;
    
    public void equilateral(int a,int b,int c){
        if(a+b <= c||a+c <= b||b+c <= a
                || a-b>=c || a-c >= b || b-c >= a){
                int m=a/0;
        }
        else if(a==b && b==c){
            result = 0;
        }
    }
    
    public void isosceles(int a,int b,int c){
        if(a+b <= c||a+c <= b||b+c <= a
                || a-b>=c || a-c >= b || b-c >= a){
                int m=a/0;
        }
        else if((a==b && b!=c) || (a!=b && b==c) || (a==c && a!=b)){
            result = 1;
        }
    }
    
    public void scalene(int a,int b,int c){
        if(a+b <= c||a+c <= b||b+c <= a
                || a-b>=c || a-c >= b || b-c >= a){
                int m=a/0;
        }
        else if(a!=b && b!=c && a!=c){
            result = 2;
        }
    }
    
    public void reSet(){
        result=-1;
    }
    public int getResult(){
        return result;
    }
}