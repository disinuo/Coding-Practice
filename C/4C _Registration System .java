import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by disinuo on 17/1/13.
 out of time！ :-/
 */
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> data=new ArrayList<String>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String name=sc.next();
            int count=0;
            for(String nameInDatabase:data){
                if(nameInDatabase.startsWith(name)){
                    int len=name.length();
                    if(nameInDatabase.length()==len||isNumber(nameInDatabase.charAt(len))){
                        count++;
                    }
                }
            }
            if(count==0){
                System.out.println("OK");
            }else {
                name+=count;
                System.out.println(name);
            }
            data.add(name);
        }

    }
    public static boolean isNumber(char c){
        if('0'<=c&&c<='9') return true;
        else return false;
    }

}
