package encapsulamento;

public class Encapsulamento {

    public static void main(String[] args) {
        int hour=3,
                minute=25;
        
        Time t = new Time();
        
        t.setHour(hour);
        t.setMinute(minute);
        
        System.out.println("The time now is "+t.getHour()+":" +t.getMinute());
        
    }
    
}
