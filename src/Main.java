import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String sir = br.readLine();

        StringBuffer strb = new StringBuffer(sir);
        System.out.println("Selectati optiunea de editare dorita\n1.Eliminarea semnelor de punctuatiie");
        Scanner sc = new Scanner(System.in);
        int optiune = sc.nextInt();
        switch (optiune)
        {
            case 1:
                for(int i=0;i<strb.length();i++)
                {
                    if(strb.charAt(i)==',' || strb.charAt(i)=='.' || strb.charAt(i)=='?' || strb.charAt(i)==';' || strb.charAt(i)=='!')
                    {
                        strb.delete(i,i+1);
                        i--;
                    }
                }

                break;
            default:

                break;
        }

        System.out.println(strb);
    }
}