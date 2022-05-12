public class februar19 {
    public static void main(String[] args){
        int[] stevila = new int[100];
        for(int i = 1; i < 101; i++){
            stevila[i] = (i^2)+(4*i)+4;
        }
        vecjaStevila(stevila, 25);
    }
    public static void sodaStevila(int[] input){
        for(int i = 0; i < input.length; i++){
            if(input[i]%2==0){
                System.out.printf("%d ", i);
            }
        }
    }
    public static Double povprecje(int[] input){
        int vsota = 0;
        for(int i = 0; i < input.length; i++){
            vsota += input[i];
        }
        return (double)(vsota/100);
    }
    public static void vecjaStevila(int[] input, int stevilo){
        for(int i = 0; i < input.length; i++){
            if(input[i]<stevilo){
                System.out.printf("%d ", i);
            }
        }
    }
}
