import java.util.Scanner;

public class computer
{
    private matplate mt;
    private ram rm;
    private processor prc;
    private videocard vdc;
    private dop dp;
    private double price;
    private static int count;
    private Integer id;

    public computer()
    {
        count++;
        this.id = count;
    }

    public computer(matplate mt, ram rm,processor prc, videocard vdc, dop dp, double price)
    {
        count++;
        this.id = count;
        this.mt = mt;
        this.rm = rm;
        this.prc = prc;
        this.vdc = vdc;
        this.dp = dp;
        this.price = price;
    }

    public void set_computer() throws UnderValueException
    {
        System.out.print("\n\n Ввод конфигурации компьютера с id "+ get_id()+":\n");
        mt.set_matplate();
        rm.set_ram();
        prc.set_processor();
        vdc.set_videocard();
        dp.set_dop();
        System.out.print("\n Введите цену компьютера (руб): ");
        Scanner scan = new Scanner(System.in);
        price = scan.nextDouble();
        if(price<0) {
            throw new UnderValueException("\nValue is under zero\n");
        }
    }
    public void get_computer()
    {
        System.out.print("\n\n Конфигурация компьютера с id "+ get_id()+":\n");
        mt.get_matplate();
        rm.get_ram();
        prc.get_processor();
        vdc.get_videocard();
        dp.get_dop();
        System.out.println("\n Цена компьютера: " + price + "руб");
    }
    public int get_id()
    {
        return this.id.intValue();
    }
    public void set_id(int id)
    {
        this.id=id;
    }
}