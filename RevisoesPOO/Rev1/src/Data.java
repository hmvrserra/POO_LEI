public class Data {

    private int day;
    private int month;
    private int year;

    //Constructors
    public Data (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Data (String date){
        String[] parts = date.split("-");
        this.day = Integer.parseInt(parts[0]);
        this.month = Integer.parseInt(parts[1]);
        this.year = Integer.parseInt(parts[2]);
    }

    //Getters
    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    //toString Method
    @Override
    public String toString(){
        return this.day + "-" + this.month + "-" + this.year;
    }
}
