import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    ArrayList<Integer> integerlist = new ArrayList<Integer>();
    
    int mode = 0;
    /*System.out.print("Enter integer: ")*/
    int input = in.nextInt();
    
    for (int i = 0; i < input; i++)
    {
      int intinput = in.nextInt();
      integerlist.add(intinput);
    }
    
    int max = 0;
    for (int j = 0; j < integerlist.size(); j++)
    {
      int x = integerlist.get(0);
      int count = 0;
      
      for (int k = 0; k < integerlist.size(); k++)
      {
        if (integerlist.get(k) == x) count++;
        if (count > max)
        {
          mode = x;
          max = count;
        }
      }
    }
    System.out.println(mode);
  }
}
