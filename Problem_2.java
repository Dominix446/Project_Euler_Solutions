class Problem_2{
    public static void main(String[] args){
        int i=1;//initialized with first term
        double phi=(1+Math.sqrt(5))/2;
        int sum=0;
        while(i<=4000000){
            if(i%2==0){
                sum+=i;
            }
            i=(int)(Math.round(i*phi));//(int) forced type conversion as math.round of i*phi is of long type
        }
        System.out.println(sum);
    }
    //fib series is convergent-the ratio between successive fib terms for those terms tending to infinity, is phi or the golden ratio
}
