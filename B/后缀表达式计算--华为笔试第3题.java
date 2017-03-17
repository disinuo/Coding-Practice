/**
 * Created by disinuo on 17/3/17.
 */
import java.util.LinkedList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String input=sc.next();
        int ans=postfixCalc(input);
        System.out.println(ans);

    }
    public static int postfixCalc(String input){
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0,len=input.length();i<len;i++){
            char c=input.charAt(i);
            if(isNumber(c)) {
                list.add(letterToInt(c));
            }
            else {//是操作符
                int b=list.removeLast();
                int a=list.removeLast();
                int result=operate(c,a,b);
                list.add(result);
            }
        }
        return list.get(0);
    }

    public static boolean isNumber(char c){
        if('0'<=c&&c<='9') return true;
        if('a'<=c&&c<='f') return true;
        if('A'<=c&&c<='Z') return true;
        return false;
    }
    public static int letterToInt(char c){
        if('0'<=c&&c<='9') return (c-'0');
        if('A'<=c&&c<='Z')return (c-'A'+10);
        else return (c-'a'+10);
    }
    public static int operate(char operator,int a,int b){
        switch (operator){
            case '+':return (a+b);
            case '-':return (a-b);
            case '*':return (a*b);
            default:return (a+b);
        }
    }
}
