class problem_1{
    public static void main(String[] args){
        int sum=0;
        for(int i=3;i<1000;i+=1){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
            else if(i%15==0){
                sum-=i;
            }
        }
        System.out.println(sum);
    }
}
/*this is trivial set theory-sum of elements of set of multiples of 3 below 1000+sum of elements of set of multiples of 5-sum of elements of multiples of 3*5(15) below 1000 */
