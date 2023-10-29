public class Test2
{
public static void main(String[] args)
{

Trainee t=new Trainee();
t.setId(1);
t.setName("abc");
t.setMobno(345678);
t.setSalary(99654345);
t.setStatus(true);
t.setAdd("Pune");
System.out.println(t.getId());
System.out.println(t.getName());
System.out.println(t.getMobno());
System.out.println(t.getSalary());
System.out.println(t.getStatus());
System.out.println(t.getAdd());

Teamlead t1=new Teamlead();
t1.setId1(2);
t1.setName1("pqr");
t1.setMobno1(9234567);
t1.setSalary1(8234);
t1.setStatus1(false);
t1.setAdd1("Mumbai");
System.out.println(t1.getId1());
System.out.println(t1.getName1());
System.out.println(t1.getMobno1());
System.out.println(t1.getSalary1());
System.out.println(t1.getStatus1());
System.out.println(t1.getAdd1());

Manager m=new Manager();
m.setId2(3);
m.setName2("mno");
m.setMobno2(9345);
m.setSalary2(1234);
m.setStatus2(false);
m.setAdd2("Udgir");
System.out.println(m.getId2());
System.out.println(m.getName2());
System.out.println(m.getMobno2());
System.out.println(m.getSalary2());
System.out.println(m.getStatus2());
System.out.println(m.getAdd2());

VicePresident vp=new VicePresident();
vp.setId3(4);
vp.setName3("jkl");
vp.setMobno3(93677);
vp.setSalary3(4753);
vp.setStatus3(true);
vp.setAdd3("Latur");
System.out.println(vp.getId3());
System.out.println(vp.getName3());
System.out.println(vp.getMobno3());
System.out.println(vp.getSalary3());
System.out.println(vp.getStatus3());
System.out.println(vp.getAdd3());

President p=new President();
p.setId4(5);
p.setName4("stu");
p.setMobno4(94546);
p.setSalary4(874);
p.setStatus4(false);
p.setAdd4("Delhi");
System.out.println(p.getId4());
System.out.println(p.getName4());
System.out.println(p.getMobno4());
System.out.println(p.getSalary4());
System.out.println(p.getStatus4());
System.out.println(p.getAdd4());



}


}