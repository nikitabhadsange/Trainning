package IfelseDemo.vowel;
import java.util.Scanner;
public class Alphabet
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter any alphabet");

char vol=scan.next().charAt(0);
if(vol=='a'||vol=='e'||vol=='i'||vol=='o'||vol=='u' )
{
System.out.println("alphabet is vowel");
}
else
{
System.out.println("alphabet is consonant");
}


}
}