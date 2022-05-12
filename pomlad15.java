import java.util.Scanner;

public class pomlad15 {
    public static int st = 100;
    public static String[] naslov = new String[st];
    public static String[] avtor = new String[st];
    public static int[] strani = new int[st];
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//---------------------A----------------------------------------------
        for(int i = 0; i < st; i++){
            System.out.printf("Vnesi %d. naslov: ", st+1);
            naslov[i] = sc.nextLine();
            System.out.printf("Vnesi %d. st. strani: ", st+1);
            strani[i] = sc.nextInt();
            System.out.printf("Vnesi %d. avtorja: ", st+1);
            avtor[i] = sc.nextLine();
        }

        String avtorVnos = sc.nextLine();

        skrajsajImeInPriimek(avtorVnos);
        KnjigeAvtorja(avtorVnos);
        najobseznejsaKnjigaAvtorja(avtorVnos);
        
    }
//-----------------B------------------------------------------------------
    public static String skrajsajImeInPriimek(String imepriimek){
        String ime = imepriimek.substring(0,1);
        String priimek = imepriimek.substring(imepriimek.indexOf(" "),imepriimek.length()-1);;
        String skrajsan = "";
        skrajsan.concat(ime);
        skrajsan.concat(". ");
        skrajsan.concat(priimek);
        return skrajsan;
    }
//-----------------C------------------------------------------------------
    public static void KnjigeAvtorja(String avtorVnos){
        String avtorIzpis = skrajsajImeInPriimek(avtorVnos);
        for(int i = 0; i < st; i++){
            if(avtor[i]==avtorVnos){
                System.out.println(avtorIzpis+" "+naslov[i]+" "+strani[i]);
            }
        }
    }
//----------------Č--------------------------------------------------------
    public static void najobseznejsaKnjigaAvtorja(String avtorVnos){
        int max = 0;
        int index = 0;
        for(int i = 0; i < st; i++){
            if(avtorVnos == avtor[i]){
                if(strani[i]>max){
                    max=strani[i];
                    index = i;
                }
            }
        }
        System.out.printf("Najobseznejsa knjiga je "+naslov[index]);
    }

}
