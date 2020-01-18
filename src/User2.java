
import java.sql.Date;
class User2 {
    private String name;
    private Date date;
    private int pay;
    private int owed;
    private String category;
    
    public User2 (String name, Date date, int pay, int owed, String category)
    {
    this.name=name;
    this.date=date;
    this.pay=pay;
    this.owed=owed;    
    this.category=category;
    
    }
    
    public String getname()
    {
    return name;
    }
    public Date getdate()
    {
    return date;
    }      
    public int getpay()
    {
        return pay;
    }
    public int getowed()
    {
        return owed;
    }
    public String getcategory()
    {
        return category;
    }

}


