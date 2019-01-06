import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by disinuo on 17/4/7.
 */
public class Main {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        double[] correctRate=new double[n];
        double result=0;
        String line=sc.nextLine();

        //思路：
        //首先将题目数n * 0.6 后向上取整，得到需要做对的最少题数A
//        然后循环计算做对A道，A+1道。。。一直到n道的概率。求和
//        做对A道的概率有CAn种情况。分别是其中A道做对且其他(n-A)道做错。再求和

        String[] input=line.split(" ");
        for(int i=0;i<n;i++){
            correctRate[i]=Integer.parseInt(input[i])*0.01;
        }//将每道题的正确率存起来

        //求要做对的题目数
        int numTOGetPassed=(int)Math.ceil(n*0.6);

        //求解过程
        for(int num=numTOGetPassed;num<=n;num++){
            //做对num道题的概率
            double temp=0;
            //求Cnum n种情况的概率和
            //每一种情况
            //将作对的题目对应的corretRate里的值加在temp上
            //将做错的题目对应的correctRate里的值，用1减，再加到temp上
            //
            // 循环体

            //
            result+=temp;
        }

        //保留5位
        DecimalFormat df = new DecimalFormat("#.#####");
        result=Double.parseDouble(df.format(result));
        System.out.println(result);






//        for(double rate:correctRate){
//            System.out.print("  "+rate);
//        }
    }
}

/*

4
50 50 50 50


*/
