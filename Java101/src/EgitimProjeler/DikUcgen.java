package EgitimProjeler;

import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                }else if (x>=-32768  && x<=32767 ){
                    System.out.println("* byte\n* short");
                }else if  (x>=min && x<max){
                    System.out.println("* byte\n* short\n* int");
                }else if (x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
                    System.out.println("* byte\n* short\n* int\n* long");
                }


            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}