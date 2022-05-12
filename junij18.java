import java.util.Scanner;

public class junij18 {
 
    public static int stevilo = 100;
    public static String[] drzava = new String[stevilo];
    public static int[] vrednost = new int[stevilo];
    public static Scanner bralnik = new Scanner(System.in);
    public static void main(String[] args){
        input();
        System.out.printf("Vrednost znamk: %.2f", povprecnaVrednostZnamk(vrednost));
        drzavaZnamk(vrednost, drzava);
    }
    public static void input(){
        for(int i = 0; i < stevilo; i++){
            System.out.printf("Vnesite drzavo:");
            drzava[i] = bralnik.nextLine();
            System.out.printf("Vnesite vrednost: ");
            vrednost[i] = bralnik.nextInt();
            bralnik.nextLine();
        }
    }
    public static Double povprecnaVrednostZnamk(int[] value){
        Double povprecje = 0.0;
        for(int i = 0; i < value.length; i++){
            povprecje += value[i];
        }
        return povprecje/value.length;
    }
    public static void drzavaZnamk(int[] value, String[] state){
        int maxValue = 0;
        int vsota = 0;
        int maxState  = 0;
        for(int i = 0; i < value.length; i++){
            for(int j = 0; j < value.length; j++){
                if(state[i].equals(state[j])){
                    vsota += value[j];
                }
            }
            if(vsota > maxValue){
                maxValue = vsota;
                maxState = i;
            }
        }
        System.out.printf("%nNajvecjo vrednost ima %S!",state[maxState]);
    }
    
}