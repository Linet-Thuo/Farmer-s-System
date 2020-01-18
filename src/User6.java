class User6 {
    private int refno;
    private String name;
    private int quantity;
    private int cost; 
    private int totalday;   
    private int totalmonth;
    private String month;
    private int year;   
    
    public User6 (int refno, String name, int quantity, int cost, int totalday, int totalmonth, String month, int year)
    {
    this.refno=refno;
    this.name=name;
    this.quantity=quantity;
    this.cost=cost;
    this.totalday=totalday;  
    this.totalmonth=totalmonth;
    this.month=month;
    this.year=year;  
    }
    
    public int getrefno()
    {
        return refno;
    }
    public String getname()
    {
    return name;
    }      
    public int getquantity()
    {
        return quantity;
    }      
    public int getcost()
    {
        return cost;
    }      
    public int gettotalday()
    {
        return totalday;
    }      
    public int gettotalmonth()
    {
        return totalmonth;
    }
    public String getmonth()
    {
    return month;
    }
    public int getyear()
    {
    return year;
    }

}
