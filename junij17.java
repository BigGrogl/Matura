import java.util.Scanner;

public class junij17 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
    }
//----------------------A--------------------
    public static Double ocenaSkoka(int d, int K){
        return 60 + (d - K)*1.8;
    }
//----------------------B--------------------
    public static int vsotaOcen(int[] seznamOcen){
        int max = 0;
        int min = 10;
        int result=0;
        for(int i = 0; i < seznamOcen.length; i++){
            if(seznamOcen[i]<min){
                min=seznamOcen[i];
            }else if(seznamOcen[i]>max){
                max=seznamOcen[i];
            }
        }
        for(int i = 0; i < seznamOcen.length; i++){
            result=result+seznamOcen[i];
        }
        return result - (max+min);
    }
//----------------------C--------------------
    public static void najboljsiSkakalec(String[] seznamSkakalcev, int[] seznamTock){
        int max = 0;
        int index = 0;
        for(int i = 0; i < seznamTock.length; i++){
            if(seznamTock[i] > max){
                max = seznamTock[i];
                index = i;
            }
        }
        System.out.printf("%S", seznamSkakalcev[index]);
    }
//----------------------Č--------------------
                    //???

}
