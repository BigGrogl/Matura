public class extra {
    public static void main(String[] args){
        int count = 0;
        int temp = 0;
        int st = 0;
        while(count<100){
            st++;
            for(int i = 1; i < st; i++){
                if(st%i==0){
                    temp+=i;
                }
            }
            //System.out.println(temp);
            if(temp>st){
                count++;
                System.out.println(st);
            }
            temp=0;
           // System.out.println();
        }
        //System.out.println(count);
    }
}
