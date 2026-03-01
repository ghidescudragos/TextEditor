import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String sir = br.readLine();
        Scanner input= new Scanner(System.in);
        StringBuffer strb = new StringBuffer(sir);

        System.out.println("Selectati optiunea de editare dorita\n1.Eliminarea semnelor de punctuatiie");
        System.out.println("2.Inlocuirea unui caracter S cu un caracter C");
        System.out.println("3.Eliminare numere");
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
            case 2:
                System.out.print("S:");
                char S = input.next("[a-zA-Z]").charAt(0);
                System.out.print("C:");
                char C = input.next("[a-zA-Z]").charAt(0);
                for(int i=0;i<strb.length();i++)
                {
                    if(strb.charAt(i)==S)
                    {
                        strb.setCharAt(i,C);
                    }
                }
                break;
            case 3:
                for(int i=0;i<strb.length();i++)
                {
                    if(strb.charAt(i)<='9' && strb.charAt(i)>='0')
                    {
                        strb.delete(i,i+1);
                    }
                }
                break;
            default:

                break;
        }

        System.out.println(strb);
    }