import java.util.ArrayList;
import java.util.Scanner;
// 156 ms 	20500 KB
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String origin=sc.next();
        String current=sc.next();
        Main obj=new Main(origin,current);
        obj.checkout();
        if(obj.santaIsRight()){
            obj.print();
        }else System.out.print(-1);
    }

    public Main(String origin, String current) {
        this.origin=origin;
        this.current=current;
    }
    public void checkout(){
        boolean ifFound=false;
loop:   for(int i=0,len=origin.length();i<len;i++){
            char origin_char=origin.charAt(i);
            char current_char=current.charAt(i);
            if(origin_char!=current_char){//not same,then record the pair or tell santa he's wrong!
                for(char c:notSwapedChar){
                    if(origin_char==c||current_char==c){
                        possible=false;
                        break loop;
                    }
                }
                ifFound=false;
                for(char[] found:pairs){
                    char found_0=found[0];
                    char found_1=found[1];
                    if(origin_char==found_0||origin_char==found_1){
                        ifFound=true;
                        if(current_char!=found_0&&current_char!=found_1){//conflict! tell santa he's wrong
                            possible=false;
                            break loop;
                        }
                    }else if(current_char==found_0||current_char==found_1){
                        ifFound=true;
                        if(origin_char!=found_0&&origin_char!=found_1){//conflict! tell santa he's wrong
                            possible=false;
                            break loop;
                        }
                    }
                }
                if(!ifFound){//record the pair!
                    char[] pair={origin_char,current_char};
                    pairs.add(pair);
                }
            }else{//same,
                for(char[] pair:pairs){
                    if(current_char==pair[0]||current_char==pair[1]){
                        possible=false;
                        break loop;
                    }
                }
                notSwapedChar.add(current_char);
            }

        }
        pairNum=pairs.size();
    }

    public void print(){
        System.out.println(pairNum);
        if(pairNum>0){
            for(char[] pair:pairs){
                System.out.println(pair[0]+" "+pair[1]);
            }
        }

    }
    public boolean santaIsRight(){
        return possible;
    }
    public int getPairNum(){
        return pairNum;
    }

    private String origin;
    private String current;
    private boolean possible=true;
    private ArrayList<char[]> pairs=new ArrayList<char[]>();
    private ArrayList<Character> notSwapedChar=new ArrayList<Character>();
    int pairNum=0;
}
