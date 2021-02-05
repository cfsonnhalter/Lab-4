import java.util.Random;

class Main {
  public static void main(String[] args) 
  {
    Random r  = new Random();
    int randomNum = r.nextInt(50) + 1;

    System.out.println("The Random number is..." + randomNum + "!");

    while (randomNum > 0)
    {
      System.out.println(randomNum);
      randomNum--;
    }

    if (randomNum <= 5)
      {
        System.out.println("Ahoy Mateys");
      }
    else if (randomNum < 42 && randomNum > 25) 
      {
        System.out.println("Cannonball");
      }
    else if (randomNum > 42)
    {
        System.out.println("Blast Off!");
    }
      }

}