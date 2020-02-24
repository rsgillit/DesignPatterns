package com.gill;
class MotorCycle implements Builder1
{
    private String brandName;
    private Product product;
    public MotorCycle(String brand)
    {
        product = new Product();
        this.brandName = brand;
    }
    public void startUpOperations()
    {   //Nothing in this case
    }
    public  void buildBody()
    {
        product.add("This is a body of a Motorcycle");
    }
    public void insertWheels()
    {
        product.add("2 wheels are added");
    }
    public void addHeadlights()
    {
        product.add("1 Headlights are added");
    }
    public void endOperations()
    {
        //Finishing up with brand name
        product.add(String.format("Motorcycle model is :%s", this.brandName));
    }
    public Product getVehicle()
    {
        return product;
    }
}