import java.util.Scanner;

public class februar20 {
    public static void main(String[] args){
        int st1=0;
        int st2=0;
        Scanner bralnik = new Scanner(System.in);

        while(st1 < 999 && st1 > 9999){
        System.out.printf("Vnesi 1. stevilo: ");
        st1 = bralnik.nextInt();
        }
        while(st2 < 999 && st1 > 9999){
        System.out.printf("Vnesi 2. stevilo: ");
        st2 = bralnik.nextInt();
        }
        bralnik.close();
    }
    public static void vsotaStevk(int stevilo){
        int sestevek=0;
        while(stevilo>0){
            sestevek += stevilo%10;
            stevilo = stevilo / 10;
        }
        System.out.println(sestevek);
    }
    public static int najvecjaStevka(int stevilo){
        int max=0;
        int temp=0;
        while(stevilo>0){
            temp=stevilo%10;
            stevilo=stevilo/10;
            if(temp>stevilo){
                max=temp;
            }
        }
        return max;
    }
    public static Boolean reverse(int stevilo){
        String rikvrc=" ";
        while(stevilo>0){
            rikvrc = rikvrc + stevilo%10;
            stevilo=stevilo/10;
        }
        int stevilo1 = Integer.parseInt(rikvrc);
        if(stevilo == stevilo1){
            return true;
        }else{
            return false;
        }
    }

}
