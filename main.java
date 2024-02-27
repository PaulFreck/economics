import java.util.Scanner;

class main{
    public static void main()
    {
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit)
        {
            Selectable selected = new Camelot();
            System.out.println(selected.selectedOutput());
            String input = scanner.nextLine();
            if(input.equals("1"))
            {
                System.out.println(selected.selectOne());
            }
            else if(input.equals("2"))
            {
                System.out.println(selected.selectTwo());
            }
             else if(input.equals("3"))
            {
                System.out.println(selected.selectThree());
            }
            else if(input.equals("0"))
            {
                exit = true;
            }
        }
    }
}