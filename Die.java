public class Die
{
  private int value;
  private int numSides;
  

  public Die(int v, int n)
  {
  setValue(v);
  setNumSides(n);
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


public int roll()
{
  return (1+((int)(numSides*Math.random())));
}

public String toString()
{
  return "Value: "+value+"NumSides: "+numSides;
}

}