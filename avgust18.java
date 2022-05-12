import java.util.Scanner;

public class avgust18 {
    public static int st = 100;
    public static String[] besesde = new String[st];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < st; i++){
            System.out.printf("Vnesi besedo: ");
            besesde[i] = sc.nextLine();
        }
    }
    public static void izpisDolgihBesed(String[] vnos){
        for(int i = 0; i < st; i++){
            if(vnos[i].length()>6){
                System.out.printf("%S ", vnos[i]);
            }
        }
    }
    public static String najdaljsaBeseda(String[] vnos){
        String max = "";
        int index = 0;
        for(int i = 0; i < st; i++){
            if(vnos[i].length()>max.length()){
                max = vnos[i];
                index = i;
            }
        }
        return vnos[index];
    }
    public static int aliJePalindrom(String vnos){
        String kontra = "";
        for(int i = 0; i < vnos.length(); i++){
            kontra = kontra + vnos.charAt(i);
        }
        if(vnos.equals(kontra)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
