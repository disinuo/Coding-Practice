import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by disinuo on 17/1/7.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> error=new ArrayList<Integer>();
        ArrayList<Integer> error1=new ArrayList<Integer>();
        ArrayList<Integer> error2=new ArrayList<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            error.add(sc.nextInt());
        }
        for(int i=0;i<n-1;i++){
            int x=sc.nextInt();
            error1.add(x);
            int index=error.indexOf(x);
            error.remove(index);
        }
        System.out.println(error.get(0));
        for(int i=0;i<n-2;i++){
            int x=sc.nextInt();
            error2.add(x);
            int index=error1.indexOf(x);
            error1.remove(index);
        }
        System.out.print(error1.get(0));

    }

}
