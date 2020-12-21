import java.util.Scanner;
public class Sum_up_array {
    public static void main(String[] args)
        {
            int number,
            sum = 0;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter number of array you want: ");
            number = input.nextInt();

            int studentScoresArray[] = new int[number];
            System.out.println("Enter all the elements:");

            for(int i = 0; i < number; i++)
            {
                studentScoresArray[i] = input.nextInt();
                sum = sum + studentScoresArray[i];
            }
            System.out.println("Sum:"+sum);
        }
    }
