
import java.sql.Time;
import java.util.Date;

class User7 {
    private int serialno;
    private String name;
    private int quantity;
    private Date date; 
    private Time time;
    
    public User7 (int serialno, String name, int quantity, Date date, Time time)
    {
    this.serialno=serialno;
    this.name=name;
    this.quantity=quantity;
    this.date=date;
    this.time=time;
    }
    
    public int getserialno()
    {
        return serialno;
    }
    public String getname()
    {
    return name;
    }      
    public int getquantity()
    {
        return quantity;
    }      
    public Date getdate()
    {
        return date;
    }      
    public Time gettime()
    {
        return time;
    }  
}
