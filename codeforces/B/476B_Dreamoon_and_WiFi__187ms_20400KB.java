import java.util.Scanner;
/**
 * Created by disinuo on 17/1/26.
 */
public class Main {
    public static void main(String[] args) {
        double ans=0;
        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        String output=sc.next();
        int numOfQ=numOfQ(output);
        int corrrectPos=cal(input);
        int outPos=cal(output);
        if(numOfQ==0){
            if(corrrectPos==outPos){
                ans=1;
            }else ans=0;
        }else{
            int difference=Math.abs(corrrectPos-outPos);
            if(difference>numOfQ){
                ans=0;
            }else {
                if(difference%2==numOfQ%2){
                    int group=(Math.abs(difference-numOfQ))/2;
                    double down=Math.pow(2,numOfQ);
                    double up=1;
                    for(int i=numOfQ,edge=numOfQ-group;i>edge;i--){
                        up*=i;
                    }
                    for(int i=2;i<=group;i++){
                        up/=i;
                    }
                    ans=up/down;
                }else {
                    ans=0;
                }
            }
        }
        System.out.print(ans);

    }
    public static int cal(String str){
        int ans=0;
        for(int i=0,len=str.length();i<len;i++){
            char c=str.charAt(i);
            if(c=='+') ans++;
            else if(c=='-') ans--;
        }
        return ans;
    }
    public static int numOfQ(String str){
        int ans=0;
        for(int i=0,len=str.length();i<len;i++){
            if(str.charAt(i)=='?') ans++;
        }
        return ans;
    }
}
