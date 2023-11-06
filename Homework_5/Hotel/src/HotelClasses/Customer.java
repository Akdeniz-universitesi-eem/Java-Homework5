package HotelClasses;

public class Customer extends Person {
    protected String resType;
    protected float estimatedDay;
    protected float quitDay;
    
    public String getResType() 
    {
        return resType;
    }

    public void setResType(String resType) 
    {
        this.resType = resType;
    }

    public float getEstimatedDay() 
    {
        return estimatedDay;
    }

    public void setEstimatedDay(float estimatedDay) 
    {
        this.estimatedDay = estimatedDay;
    }

    public float getQuitDay() 
    {
        return quitDay;
    }

    public void setQuitDay(float quitDay) 
    {
        this.quitDay = quitDay;
    }

    public Customer(String ID, String resType, float estimatedDay) 
    {
        super.setID(ID);
        this.resType = resType;
        this.estimatedDay = estimatedDay;
        this.quitDay = estimatedDay; //for bank calc this need to be equal get changed by workers when cancel or early quit
    }
}
