abstract class beverage
{
    private void pour(int qty)
    {
        System.out.println("Pour"+qty+"ml");
    }
    abstract void add_condiment();
     void stir(){}
    private void serve()
    {
        System.out.println("Serve");
    }
    public void templatemethod(int qty)
    {
        pour(qty);
        add_condiment();
        stir();
        serve();
    }
}