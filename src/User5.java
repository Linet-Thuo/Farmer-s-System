class User5 {
    private String month;
    private int year;
    private int sales; 
    private int purchases;   
    private int others;
    private int profit;
    private int loss;
    
    public User5 (String month, int year, int sales, int purchases, int others, int profit, int loss)
    {
    this.month=month;
    this.year=year;
    this.sales=sales;
    this.purchases=purchases;
    this.others=others;
    this.profit=profit;
    this.loss=loss;    
    }
    
    public String getmonth()
    {
    return month;
    }
    public int getyear()
    {
    return year;
    }
    public int getsales()
    {
        return sales;
    }
    public int getpurchases()
    {
    return purchases;
    }      
    public int getothers()
    {
        return others;
    }      
    public int getprofit()
    {
        return profit;
    }      
    public int getloss()
    {
        return loss;
    }

}
