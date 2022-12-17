import java.util.Scanner;

public class ram
{
    private String name;
    private int opermemory;

    public ram()
    {
    }

    public ram(String name, int opermemory)
    {
        this.name=name;
        this.opermemory=opermemory;
    }

    public void set_ram()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Введите тип оперативной памяти: ");
        name = scan.nextLine();
        System.out.print("\n Введите объём оперативной памяти ГБ: ");
        opermemory=scan.nextInt();
    }
    public void get_ram()
    {
        System.out.println("\n Тип оперативной памяти: " + name);
        System.out.println("\n Объём оперативной памяти: " + opermemory+" ГБ");
    }
}