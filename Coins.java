public class Coins
{
  public static void main(String[] args)
  {
    // test code here
    num1 = 1234;
    System.out.println("With " + num1 + " pennies.");

    num2 = 638;
    System.out.println("With " + num2 + " pennies.");

    num3 = 91;
    System.out.println("With " + num3 + " pennies.");
  }

  // write code for coinConverter
  public static void conConverter (int pennies)
  {
    int dols = pennies / 100;
    pennies %= 100;

    int quarts = pennies / 25;
    pennies %/ 25;

    int dimes = pennies / 10;
    pennies %/ 10;

    int nicks = pennies / 5;
    pennies %/ 5;

    int remp = pennies;

    System.out.println("Dollar Bills: " + dols);
    System.out.println("Quarters: " + quarts);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickles: " + nicks);
    System.out.println("Pennies: " + remp);
  }

}
