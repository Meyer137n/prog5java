import java.util.Scanner;

public class matplate
{
    private String name;
    private int slots;

    public matplate()
    {
    }

    public matplate(String name, int slots)
    {
        this.name=name;
        this.slots=slots;
    }

    public void set_matplate()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Введите название материнской платы: ");
        name = scan.nextLine();
        System.out.print("\n Введите количество слотов для оперативной памяти: ");
        slots=scan.nextInt();
    }
    public void get_matplate()
    {
        System.out.println("\n Название материнской платы: " + name);
        System.out.println("\n Название материнской платы: " + slots);
    }
}