
import java.sql.Date;
import java.sql.Time;

class User {
    private int serialno;
    private String name;

    private int quantity;
    private Date date;
    private Time time;
    
    public User (int serialno, String name)
    {
    this.serialno=serialno;
    this.name=name;
    this.serialno=serialno;
    this.name=name;
    this.quantity=quantity;
    this.date=date;
    this.time=time;
    
    }

    User(int aInt, String string, int aInt0, Date date, Time time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public Time time()
    {
        return time;
    }
}
