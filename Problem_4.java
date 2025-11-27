public class Problem_4{
    public static void main(String[] args){
        int count=0;
        for(int i=100;i<1000;i++){
            for(int j=100;j<1000;j++){
                int k=i*j;
                StringBuilder r=new StringBuilder(Integer.toString(k));
                if(k==Integer.parseInt(r.reverse().toString())){
                    if(count<k){
                        count=k;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
//i believe the code is fairly self explanatory
