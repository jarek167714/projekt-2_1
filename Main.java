class Main 
{
  public static void main(String[] args) 
  {
    int Wysokosc = 4;

    for(int i = 1; i <= Wysokosc; i++)
      {
        for(int j = Wysokosc; j >= i; j--)
          System.out.print(' ');
        for(int j = i; j > 0; j--)
          System.out.print('*');
    
          System.out.println(' ');
        }
    
    
  for (int i = 1; i <= Wysokosc; i++)
    {
      System.out.print("     ");
      for(int j = 1; j <= i; j++)
        {
          System.out.print('*');

        }
          System.out.println(' ');
    }
  }
}
    
