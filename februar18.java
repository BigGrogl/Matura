import java.util.Scanner;

public class februar18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//----------------------A--------------------

        System.out.printf("Vnesi stevilo: ");
        int st = sc.nextInt();
        for(int i = 1; i<st; i++) {
            if(st % i == 0) {
               System.out.printf("%n%d%n",i);
            }
        }

//----------------------B--------------------
    
        boolean flag = false;
        for (int i = 2; i <= st / 2; ++i) {
        if (st % i == 0) {
            flag = true;
            break;
        }
        }

        if (!flag)
        System.out.println("PRASTEVILO");
        else
        System.out.println("NI PRASTEVILO");

//----------------------C--------------------

        String stevilo = Integer.toString(st);
        String kontra = "";
        for(int i = 0; i < stevilo.length(); i++){
            kontra = kontra + stevilo.charAt(i);
        }
        System.out.println(kontra);

//----------------------Č--------------------
                    //???

        }
}