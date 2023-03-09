public class Car 
{
    private String licence;
    private String brand;
    private String color;
    private String owner;
    
    //Constructors
    public Car()
    {
        licence="Unregistered";
        brand="Unregistered";
        color="Unregisted";
        owner="Unregistered";
    }
    public Car(String licence_plate,String brand,String color,String owner)
    {
        this.licence=licence_plate;
        this.brand=brand;
        this.color=color;
        this.owner=owner;
    }
    
    @Override
    public String toString()
    {
        return ("**** Car Details ****\n"+"Licence: "+licence+"\nBrand: "+brand+
               "\nColor: "+color+"\nOwner: "+owner);
    }
}
