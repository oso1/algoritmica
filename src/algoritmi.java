/**
 * Created by oso on 04.03.2015.
 */
public class algoritmi {
    public static void main(String[] args) {
        //convert Fahrenheit in Celsius
        double f = 98.6;
        double celsius = (5.0 / 9.0) *(f-32);
        System.out.println("Convert Fahrenheit in Celsius: "+ celsius);

        //determine the average of two numbers
        int a = 2; int b = 7;
        int average = (a + b) / 2;
        System.out.println("Average of two numbers: " +average);

        //you are given a list of numbers; calculate their average
        int[] numbers = {42, 3, 44, 76, 43, 34, 74};
        double total = 0;
        double average1 = 0;
        for(int i = 0;i<numbers.length;i++){
            total+=numbers[i];
        }
        average1 = total / (numbers.length);
        System.out.println("Average is: "+average1);


        // given a list of numbers, determine the largest (max)
        int k = 3;
        int [] array = new int [k];
        int max = array[0];
        for (int i=1; i<k; i++)
        {
            if (max < numbers[i]) {
                max = numbers[i];
            }

        }
        System.out.println("Determine the largest (max): " + max);


        //given a list of numbers, determine all the odds
        int length = 7;
        int [] list = new int [length];
        int [] odds = new int [length/2];
        int j = 0;
        for (int i = 0; i < length; i++)
        {
            if ((list[i] / 2) != 0)
            {
                odds[j] = list[i];
                j= j + 1;
            }
        }
        System.out.println("determine all the odds: " + odds[j] );
    }
}
