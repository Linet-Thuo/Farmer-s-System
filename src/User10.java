class User10 {
    private int receiptno;
    private int refno;
    private String name;
    private int quantity;
    private int cost;
    private int day;
    private int total;
    private String month;
    private int year;
        public User10 (int receiptno, int refno, String name, int quantity, int cost, int day, int total, String month, int year)
    {
    this.receiptno=receiptno;
    this.refno=refno;
    this.name=name;
    this.quantity=quantity;
    this.cost=cost;
    this.day=day;
    this.total=total;
    this.month=month;
    this.year=year;
       }
    
    public int getreceiptno()
    {
        return receiptno;
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
    public int getday()
    {
        return day;
    }
    public int gettotal()
    {
        return total;
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