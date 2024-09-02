public class Date
{
    private int month;
    private int date;
    private int year;
    private static final int[] diasMes = {0, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};

    public Date(int yearIn, int monthIn, int dateIn)
    {
        if (yearIn < 2000 || yearIn > 2024)
        {
            throw new IllegalArgumentException("Ano inválido");
        }
      
        else if (monthIn == 2)
        {
            if (yearIn % 4 == 0)
            {
                if (dateIn > 29)
                {
                    throw new IllegalArgumentException("Data inválida (Fev - Ano bissexto)");
                }
            }

            else if (dateIn > 28)
            {
                throw new IllegalArgumentException("Data inválida (Fev)");
            }
        }

        if (monthIn < 1 || monthIn > 12)
        {
            throw new IllegalArgumentException("Mês inválido");
        }

        if(dateIn > diasMes[monthIn])
        {
            new IllegalArgumentException("Dia inválido (mês)");
        }      

        this.year = yearIn;
        this.month = monthIn;
        this.date = dateIn;
    }

    public int getDate()
    {
        return date;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public String toString()
    {
        return String.format("Creation date: %02d/%02d/%d", getDate(), getMonth(), getYear());
    }
}