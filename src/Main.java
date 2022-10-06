public class Main {
    public static void main(String[] args)
    {
        for(int x = 0; x <= 30; x++)
        {
            System.out.print(x + " ");
        }
        System.out.println();


        for (int n = 30; n >= 0; n--)
        {
            System.out.print(n + " ");
        }

        for (int n = 0; n <= 18; n = n + 3)
        {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 10; n >= 0; n = n - 2)
        {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int r = 1; r <= 5; r++)
        {
            for (int c = 1; c <= 5; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int r = 1; r <= 5; r++)
        {
            for (int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int r = 5; r >= 1; r--)
        {
            for (int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


     }
}
