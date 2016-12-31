import java.util.ArrayList;
import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
        int x=0;
        int border=1899;
        ArrayList<int[]> list=new ArrayList<int[]>();
        ArrayList<int[]> expression=new ArrayList<int[]>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            list.add(new int[]{a,b});
        }
        if(list.get(0)[1]==1){
            expression.add(new int[]{border,1});
        }else expression.add(new int[]{border,0});

        for(int i=0;i<n-1;i++){
            int compare=list.get(i+1)[1];
            sum+=list.get(i)[0];
            if(compare==1){
                expression.add(new int[]{border-sum,1});
            }else{
                expression.add(new int[]{border-sum,0});
            }
        }
        sum+=list.get(n-1)[0];
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        for(int[] temp:expression){
            int num=temp[0];
            if(temp[1]==0){
               if(num<max) max=num;
           }else if(temp[1]==1){
                if(num>min) min=num;
           }
        }
        if(max<=min)  System.out.print("Impossible");
        else if(max==max_initial)  System.out.print("Infinity");
        else System.out.print((max+sum));

    }
}
