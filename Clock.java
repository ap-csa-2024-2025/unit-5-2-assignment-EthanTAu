public class Clock
{
  public static void main(String[] args)
  {
    // test code here
    timeOfDay(8);
    timeOfDay(12);
    timeOfDay(14);
    timeOfDay(18);
    timeOfDay(20);
    timeOfDay(0);
  }

  // write code for timeOfDay here
  public static void timeOfDay(int hour)
  {
    if (hour == 0)
    {
      System.out.println("midnight"):
    } else if (hour == 12)
    {
      System.out.println("noon"):
    } else if (hour == 18)
    {
      System.out.println("morning"):
    } else if (hour > 0 && hour < 12) 
    {
      System.out.println("afternoon"):
    } else if (hour > 12 && hour < 18)
    {
      System.out.println("evening"):
    } else if (hour > 18 && hour < 24)
    {
      System.out.println("Invalid hour"):
    }
  }
  

}
