// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //class calling
        country c = new country();
        c.name ="Oman";
        c.city = "Muscat";
        c.language = "Arabic";
        c.print();

    }
}
class country{
    //function construction
    country()
    {
        System.out.println("You are from : ");
    }
    //attributes of class
    double population;
    int temperature;
    String  name;
    String city;
    String language;
    //function for print
    void print(){
        System.out.println("My Country Name is: "+ name);
    }
    void weather(){


    }


}