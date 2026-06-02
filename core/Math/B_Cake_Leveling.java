import java.util.* ;
public class BCakeLeveling{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long sum=0;
            long[]arr=new long[n+1];
            long best=Integer.MAX_VALUE;
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextLong();
                sum+=arr[i];
                long curr=sum/i;
                best=Math.min(best,curr);
                System.out.print(best+" ");
            }
            System.out.println();
        }
    }
}
