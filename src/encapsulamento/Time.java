package encapsulamento;

public class Time {
    private int hour,
            minute;
    
    public void setHour(int hour){
        this.hour=hour;
    }
    
    public void setMinute(int minute){
        this.minute=minute;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getHour(){
        return this.hour;
    }
}
