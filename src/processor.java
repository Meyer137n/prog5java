import java.util.Scanner;

public class processor
{
    private String name;
    private int cores;
    private int streams;
    private double frequency;

    public processor()
    {
    }

    public processor(String name, int cores, int streams, double frequency)
    {
        this.name=name;
        this.cores=cores;
        this.streams=streams;
        this.frequency=frequency;
    }

    public void set_processor()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Введите название процессора: ");
        name = scan.nextLine();
        System.out.print("\n Введите количество ядер процессора: ");
        cores=scan.nextInt();
        System.out.print("\n Введите количество потоков процессора: ");
        cores=scan.nextInt();
        System.out.print("\n Введите частоту процессора ГГц: ");
        frequency=scan.nextDouble();
    }

    public void get_processor()
    {
        System.out.println("\n Название процессора: " + name);
        System.out.println("\n Количество ядер процессора: " + cores);
        System.out.println("\n Количество потоков процессора: " + streams);
        System.out.println("\n Частота процессора: " + frequency+ " ГГц");
    }
}