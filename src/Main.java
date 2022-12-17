import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        matplate mt = new matplate();
        ram rm = new ram();
        processor prc = new processor();
        videocard vdc = new videocard();
        dop dp = new dop();
        int lg=20;
        computer []pc = new computer[lg];
        int kolvo=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\n Введите количество компьютеров: ");
        try {
            kolvo = scan.nextInt();
            if(kolvo<0){
                throw new UnderValueException("\nValue is under zero\n");
            }
            if(kolvo>lg)
            {
                throw new ExtraValueException("\nValue is above array lenght\n");
            }
        }
        catch(UnderValueException under) {
            under.printStackTrace();
            System.exit(0);
        }
        catch(ExtraValueException extra) {
            extra.printStackTrace();
            System.exit(0);
        }
        for(int i=0; i<kolvo; i++)
        {
            pc[i]=new computer(mt,rm,prc,vdc,dp,0);
            try {
                pc[i].set_computer();
            }
            catch(UnderValueException ex2)
            {
                ex2.printStackTrace();
                System.exit(0);
            }
        }
        for(int i=0; i<kolvo; i++)
        {
            pc[i].get_computer();
        }
        /////////////////////////////////////////////////////
        int n, m;
        int first=0, second=0;
        int flag = 0;
        System.out.print("\n\n\n Введите id первого компьютера для обмена частями: ");
        n = scan.nextInt();

        System.out.print("\n Введите id второго компьютера для обмена частями: ");
        m = scan.nextInt();

        for (int i = 0; i <= kolvo; i++)
        {
            if (pc[i].get_id() == n)
            {
                first = i;
                flag = 1;
                break;
            }
        }

        for (int j = 0; j <= kolvo; j++)
        {
            if (pc[j].get_id() == m)
            {
                second = j;
                flag = 1;
                break;
            }
        }
        computer buf;
        if (flag == 1)
        {
            int id1, id2;
            id1 = pc[first].get_id();
            id2 = pc[second].get_id();
            buf = pc[first];
            pc[first] = pc[second];
            pc[second] = buf;
            pc[first].set_id(id1);
            pc[second].set_id(id2);
            for (int i = 0; i < kolvo; i++)
            {
                pc[i].get_computer();
            }
        }
        else { System.out.print("\n Обмен не произошёл"); }
        ///////////////////////////////////////////////////////
        int ifirst=0, jfirst=0, isecond=0, jsecond=0;
        flag = 0;

        System.out.print("\n\n Введите размерность двумерного массива: ");
        try {
            kolvo = scan.nextInt();
            if(kolvo<0){
                throw new UnderValueException("\nValue is under zero\n");
            }
            if(kolvo>lg)
            {
                throw new ExtraValueException("\nValue is above array lenght\n");
            }
        }
        catch(UnderValueException under2) {
            under2.printStackTrace();
            System.exit(0);
        }
        catch(ExtraValueException extra2) {
            extra2.printStackTrace();
            System.exit(0);
        }
        computer [][]comp = new computer[kolvo][kolvo];
        for(int i=0; i<kolvo; i++)
        {
            for(int j=0;j<kolvo; j++)
            {
                comp[i][j] = new computer(mt, rm, prc, vdc, dp, 0);
                try {
                    comp[i][j].set_computer();
                } catch (UnderValueException ex2) {
                    ex2.printStackTrace();
                    System.exit(0);
                }
            }
        }
        System.out.print("\n\n\n Введите id первого компьютера для обмена частями: ");
        n = scan.nextInt();

        System.out.print("\n Введите id второго компьютера для обмена частями: ");
        m = scan.nextInt();

        for (int i = 0; i < kolvo; i++)
        {
            for (int j = 0; j < kolvo; j++)
            {

                if (comp[i][j].get_id() == n)
                {
                    ifirst = i;
                    jfirst = j;
                    flag = 1;
                    break;
                }
            }
        }
        for (int i = 0; i < kolvo; i++)
        {
            for (int j = 0; j < kolvo; j++)
            {

                if (comp[i][j].get_id() == m)
                {
                    isecond = i;
                    jsecond = j;
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1)
        {
            int id1, id2;
            id1 = comp[ifirst][jfirst].get_id();
            id2 = comp[isecond][jsecond].get_id();
            buf = comp[ifirst][jfirst];
            comp[ifirst][jfirst] = comp[isecond][jsecond];
            comp[isecond][jsecond] = buf;
            comp[ifirst][jfirst].set_id(id1);
            comp[isecond][jsecond].set_id(id2);
            for (int i = 0; i < kolvo; i++)
            {
                for (int j = 0; j < kolvo; j++)
                {
                    comp[i][j].get_computer();
                }
            }
        }
        else { System.out.print("\n Обмен не произошёл"); }
    }
}

