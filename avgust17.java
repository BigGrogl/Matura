import java.util.Scanner;

public class avgust17 {
//----------------------A--------------------

    public static int st = 5;
    public static String[] gesla = new String[st];
    public static String[] uporabniska_imena = {"Mojca", "Alenka", "Sonja", "Janja", "Tadeja"};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stevilo = 0;
        String temp = "";
//----------------------B--------------------

        while(stevilo < 5 && stevilo > 10){
            stevilo = sc.nextInt();
            if(stevilo < 5 && stevilo > 10){
                System.out.println("Vasa vrednost ni med 5 in 10!");
            }
        }
//----------------------C--------------------
        for(int i = 0; i < st; i++){
            System.out.printf("Vnesite geslo: ");
            temp = sc.nextLine();
            if(temp.length()>5){
                gesla[i] = temp;
            }else{
                System.out.println("Geslo ni veljavno!");
                i--;
            }
        }
    }
//----------------------Č--------------------
    public static void preveriGesla(String[] gesla){
        
        for(int i = 0; i < gesla.length; i++){
            if(gesla[i].matches(".*\\d.*")==false){
                gesla[i] = "Geslo ni ustrezno";
            }
        }
        for(int i = 0; i < gesla.length; i++){
            System.out.printf(gesla[i]);
        }

    }
}
