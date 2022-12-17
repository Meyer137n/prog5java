import java.util.Scanner;

public class videocard
{
    private String name;
    private int videomemory;

    public videocard()
    {
    }

    public videocard(String name, int videomemory)
    {
        this.name=name;
        this.videomemory=videomemory;
    }

    public void set_videocard()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Введите название видеокарты: ");
        name = scan.nextLine();
        System.out.print("\n Введите объём видеопамяти ГБ: ");
        videomemory=scan.nextInt();
    }
    public void get_videocard()
    {
        System.out.println("\n Название видеокарты: " + name);
        System.out.println("\n Объём видеопамяти: " + videomemory+ " ГБ");
    }
}