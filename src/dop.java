import java.util.Scanner;

public class dop
{
    private int hdisc;
    private int energy;
    private String name;

    public dop()
    {
    }

    public dop(int hdisc, int energy, String name)
    {
        this.hdisc=hdisc;
        this.energy=energy;
        this.name=name;
    }

    public void set_dop()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Введите объём жесткого диска ГБ: ");
        hdisc = scan.nextInt();
        System.out.print("\n Введите мощность блока питания Вт: ");
        energy =scan.nextInt();
        System.out.print("\n Введите название операционной системы: ");
        name = scan.nextLine();
        name = scan.nextLine();
    }

    public void get_dop()
    {
        System.out.println("\n Объём жёсткого диска: " + hdisc+ " ГБ");
        System.out.println("\n Мощность блока питания: " + energy+ " Вт");
        System.out.println("\n Операционная система: " + name);
    }
}