import java.util.Scanner;
public class Education
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter id");
int sid=scan.nextInt();
System.out.println("Enter name");
String sname=scan.next();
System.out.println("Enter status");
boolean status=scan.nextBoolean();
System.out.println("Enter mobile number");
long smobno=scan.nextLong();
System.out.println("Enter height");
float sheight=scan.nextFloat();
System.out.println("Enter weight");
double sweight=scan.nextDouble();
System.out.println("Enter address");
String sadd=scan.next();
Student1 s1=new Student1(sid,sname,status,smobno,sheight,sweight,sadd);
System.out.println(s1.sid);
System.out.println(s1.sname);
System.out.println(s1.status);
System.out.println(s1.smobno);
System.out.println(s1.sheight);
System.out.println(s1.sweight);
System.out.println(s1.sadd);


System.out.println("Enter id");
int scid=scan.nextInt();
System.out.println("Enter name");
String scname=scan.next();
System.out.println("Enter status");
boolean scstatus=scan.nextBoolean();
System.out.println("Enter area");
String scarea=scan.next();
System.out.println("Enter Phone number");
long scphone=scan.nextLong();
System.out.println("Enter address");
String scadd=scan.next();
System.out.println("Enter number of student");
int  sadd=scan.next();
School s=new School(scid,scname,scstatus,scarea,scphoneno,scadd,scnoofstud); 
System.out.println(s1.s1id);
System.out.println(s1.s1name);
System.out.println(s1.s1status);
System.out.println(s1.s1area);
System.out.println(s1.s1phoneno);
System.out.println(s1.s1add);
System.out.println(s1.s1noofstud);

System.out.println("Enter id");
int cid=scan.nextInt();
System.out.println("Enter name");
String cname=scan.next();
System.out.println("Enter status");
boolean cstatus=scan.nextBoolean();
System.out.println("Enter area");
String carea=scan.next();
System.out.println("Enter Phone number");
long cphone=scan.nextLong();
System.out.println("Enter address");
String cadd=scan.next();
System.out.println("Enter number of department");
int  sadd=scan.next();
School s=new School(cid,cname,cstatus,carea,cphoneno,cadd,cnoofdept); 
System.out.println(c.cid);
System.out.println(c.cname);
System.out.println(c.cstatus);
System.out.println(c.carea);
System.out.println(c.cphoneno);
System.out.println(c.cadd);
System.out.println(c.cnoofstud);

System.out.println("Enter id");
int uid=scan.nextInt();
System.out.println("Enter name");
String uname=scan.next();
System.out.println("Enter status");
boolean ustatus=scan.nextBoolean();
System.out.println("Enter area");
String uarea=scan.next();
System.out.println("Enter Phone number");
long uphone=scan.nextLong();
System.out.println("Enter address");
String cadd=scan.next();
System.out.println("Enter number of department");
int  sadd=scan.next();
University u=new University(uid,uname,ustatus,uarea,uphoneno,uadd,ucnoofdept); 
 System.out.println(u.suid);
System.out.println(u.uname);
System.out.println(u.ustatus);
System.out.println(u.uarea);
System.out.println(u.uphoneno);
System.out.println(u.uadd);
System.out.println(u.unoofstud);


}
}