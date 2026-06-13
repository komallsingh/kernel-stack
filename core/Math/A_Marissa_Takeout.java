import java.util.*;
public class AMarisaStealsReimuSTakeout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int nzero=0;
            int none=0;
            int ntwo=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x==0){
                    nzero++;
                } else if(x==1){
                    none++;
                } else if(x==2){
                    ntwo++;
                }
            }
            int ans=0;
            ans+=nzero; //remove all 0s
            int pair=Math.min(none,ntwo); //(1,2) pairs
            ans+=pair;
            none-=pair;
            ntwo-=pair;
            //remove triples
            ans+=none/3;
            ans+=ntwo/3;

            System.out.println(ans);
        }
    }
}
