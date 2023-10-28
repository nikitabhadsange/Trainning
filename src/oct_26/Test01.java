public class Test01
{
public static void main(String[] args)
{
Student01 s1=new Student01(1,"abc",true,50,162.0f,12345,"Pune");
System.out.println(s1.sid);
System.out.println(s1.sname);
System.out.println(s1.sstatus);
System.out.println(s1.sweight);
System.out.println(s1.sheight);
System.out.println(s1.smobno);
System.out.println(s1.sadd);

School01 s01=new School01(2,"mno",false,10,12345,"Mumbai",50);
System.out.println(s01.scid);
System.out.println(s01.scname);
System.out.println(s01.scstatus);
System.out.println(s01.scarea);
System.out.println(s01.scphone);
System.out.println(s01.scadd);
System.out.println(s01.scNoofstud);

College01 c=new College01(3,"xyz",45,true,"Latur",10,1235);
System.out.println(c.cid);
System.out.println(c.cname);
System.out.println(c.cstatus);
System.out.println(c.carea);
System.out.println(c.cphoneno);
System.out.println(c.cadd);
System.out.println(c.cnoofdept);

University01 u=new University01(4,"pqr",false,001,"Udgir",10,12345,413517);
System.out.println(u.uid);
System.out.println(u.uname);
System.out.println(u.ustatus);
System.out.println(u.uarea);
System.out.println(u.uphoneno);
System.out.println(u.uadd);
System.out.println(u.unoofdept);
System.out.println(u.upincode);


}
}