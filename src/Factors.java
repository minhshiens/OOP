public class Factors {
    public static void main(String[] agrs){
        long n = Long.parseLong(agrs[0]);
        System.out.print("The prime factorization of " + n + " is: ");
        for(long Factor = 2;Factor*Factor<= n;++Factor)
        {
            while(n%Factor == 0){
                System.out.println(Factor+' ');
                n = n/Factor;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
}
