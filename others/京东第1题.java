import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by disinuo on 17/4/7.
 */
public class State {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;

        String lineStr=sc.next();
        char[] line=lineStr.toCharArray();
        List<int[]> cops=new ArrayList<>();
        for(int i=0;i<line.length;i++){
            char c=line[i];
            if('1'<=c&&c<='9'){
                int power=c-'0';
                int left=(i-power);
                int right=i+power;
                if(i-power<0) left=0;
                if(right>=n) right=n-1;
                cops.add(new int[]{left,right});
            }
        }
        for(int[] x:cops){
            int from=x[0];
            int to=x[1];
            for(int i=from;i<=to;i++){
                if(line[i]=='X'){
                    result++;
                    line[i]='#';
                }
            }
        }
        System.out.print(result);


    }
}
