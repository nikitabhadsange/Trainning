public class Faculty
{
private int fid;
private String fname;
private Batch batch;

public void setFid(int fid)
{
this.fid=fid;
}
public int getFid()
{
return fid;
}
public void setFname(String fname)
{
this.fname=fname;
}
public String getFname()
{
return fname;
}
public void setBatch(Batch batch)
{
this.batch=batch;
}
public Batch getBatch()
{
return batch;
}
}