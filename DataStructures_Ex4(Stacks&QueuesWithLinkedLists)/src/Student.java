/*
∆ηµιουργήστε την Student class, η οποία περιγράφει αφαιρετικά ένα φοιτητή. Τα στοιχεία που
θέλουµε να κρατήσουµε είναι:
• αριθµός µητρώου φοιτητή (int)
• όνοµα/επίθετο (string)
• αριθµός απουσιών στο µάθηµα (int)
• βαθµός (double) 
*/
public class Student 
{
    private int am;
    private String onoma;
    private int apousies;
    private double vathmos;

//Constructors
public Student(int am,String onoma)
{
    this(am,onoma,0,0.0);
}
public Student(int am,String onoma,int apousies,double vathmos)
{
    this.am=am;
    this.onoma=onoma;
    this.apousies=apousies;
    this.vathmos=vathmos;
}

//Setters-Getters
public void setAM(int am)
{
    this.am=am;
}
public void setOnoma(String onoma)
{
    this.onoma=onoma;
}
public void setApousies(int apousies)
{
    this.apousies=apousies;
}
public void setVathmos(double vathmos)
{
    this.vathmos=vathmos;
}

public int getAM()
{
    return am;
}
public String getOnoma()
{
    return onoma;
}
public int getApousies()
{
    return apousies;
}
public double getVathmos()
{
    return vathmos;
}

//toString
@Override
public String toString()
{
    return ("AM: "+am+"\nOnoma: "+onoma+"\nApousies: "+apousies+"\nVathmos: "+vathmos);
}
}

    