import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--)
        {
            if(i==1 || i==n)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print(j+" ");
                }
            }
            else{
                for(int k=1;k<=n;k++)
                {
                    if(k!=i)
                    {
                        System.out.print("  ");
                    }
                    else{
                        System.out.print(k+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
