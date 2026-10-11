public class CountyReceipt extends Receipt
{
    double countyTax;
    public CountyReceipt(Receipt r, double c)
    {
        super(r);
        countyTax = c;
    }
}
