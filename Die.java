public class Die
{
  private int value;
  private int numSides;
  private static int id; //Like a counter shared between classes
  private int dieId;

  public Die(int v, int n)
  {
  setValue(v);
  setNumSides(n);
  id++;
  setDieId(id);
  }

public Die()
{
  this(1,6);
}
 

  public int getValue()
  {
    return value;
  }
  
  public int getNumSides()
  {
    return numSides;
  }

    public void  setValue(int v)
  {
    value = v;
  }
    public void  setNumSides(int ns)
  {
    numSides = ns;
  }
    public void setDieId(int d)
  {
    dieId=id;
  }

public int roll()
{
  int value= (1+((int)(numSides*Math.random())));
  this.setValue(value);
  return value;
}

public boolean equals(Die d)
{
  if(this.getValue()==d.getValue())
  {
    return true;
  }
  else
  {
    return false;
  }
}


public String toString()
{
  return "Die ID: "+dieId+ "Value: "+value+" NumSides: "+numSides;
}




}