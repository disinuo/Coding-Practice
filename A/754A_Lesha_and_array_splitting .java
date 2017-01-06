import java.util.ArrayList;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,sum_temp=0,sum_temp_pre=0;
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        Boolean possible=false;
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            if(t!=0) possible=true;
            sum+=t;
            sum_temp+=t;
            if(sum_temp==0){
                list.add(i);
                sum_temp=t;
            }
        }
        if(possible){
            System.out.println("YES");
            System.out.println(list.size()+1);
            int len=list.size();
            if(len==0){
                System.out.println("1 "+n);
            }else if(len==1) {
                System.out.println("1 " + list.get(0));
                System.out.println((list.get(0) + 1) + " " + n);
            }else{
                System.out.println("1 " + list.get(0));
                for(int i=0;i<len-1;i++){
                    System.out.println((list.get(i)+1)+" "+list.get(i+1));
                }
                System.out.println((list.get(len-1) + 1) + " " + n);
            }

        }else {
            System.out.println("NO");
        }

    }
}
