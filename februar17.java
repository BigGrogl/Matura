import java.util.Scanner;

public class februar17 {
    public static void main(String[] args){
        int st1 = 0;
        int st2 = 0;
        Scanner sc = new Scanner(System.in);
//----------------------A--------------------
        while((st1 < 999 && st1 > 9999)&&(st2 < 999 && st2 > 9999)){
            System.out.printf("Vnesi 1. stevilo: ");
            st1 = sc.nextInt();
            System.out.printf("Vnesi 2. stevilo: ");
            st2 = sc.nextInt();
        }
    }
//----------------------B--------------------
    public static void sestevek(int input){
        int sum = 0;
        while(input>0){
            sum = sum + input%10;
            input = input/10;
        }
    }
//----------------------C--------------------
    public static int maximum(int input){
        int max = 0;
        while(input > 0){
            if(input%10 > max){
                max = input%10;
            }
        input = input/10;
        }
        return max;
    }
//----------------------Č--------------------
    public static int kontra(int input){
        String stevilo = Integer.toString(input);
        String kontra = "";
        for(int i = 0; i < stevilo.length(); i++){
            kontra = kontra + stevilo.charAt(i);
        }
        return Integer.valueOf(kontra);
    }

}
