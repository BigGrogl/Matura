import java.util.Scanner;

public class vaja4 {
    public static void main(String[] args){
    int st1=0;
    int st2=0;
    Scanner bralnik = new Scanner(System.in);
//------------------A----------------------------
    while(st1 < 999 && st1 > 9999){
    System.out.printf("Vnesi 1. stevilo: ");
    st1 = bralnik.nextInt();
    }
    while(st2 < 999 && st1 > 9999){
    System.out.printf("Vnesi 2. stevilo: ");
    st2 = bralnik.nextInt();
    }
    bralnik.close();
//-----------------------------------------------
    sestevek(st1);
//-----------------------------------------------
    max(st1);
//-----------------------------------------------
    reverse(st1);
//-----------------------------------------------
}
//-------------------B---------------------------
public static int sestevek(int stevilo){
    int sestevek=0;
    while(stevilo>0){
        sestevek += stevilo%10;
        stevilo = stevilo / 10;
    }
    return sestevek;
}
//-----------------------------------------------
//-------------------C---------------------------
public static int max(int stevilo){
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
//-----------------------------------------------
//-------------------Č---------------------------
public static int reverse(int stevilo){
    String rikvrc=" ";
    while(stevilo>0){
        rikvrc = rikvrc + stevilo%10;
        stevilo=stevilo/10;
    }
    return Integer.parseInt(rikvrc);
}
//-----------------------------------------------
}
