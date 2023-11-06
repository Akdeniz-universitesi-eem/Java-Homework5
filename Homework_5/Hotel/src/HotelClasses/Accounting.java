package HotelClasses;

public class Accounting extends Person {
    // Too much logic errors cause to go negative while testing so i just set it 10.000 for now
    protected float bank = 10000;
    private int economic = 100;
    private int business = 200;
    private int firstClass = 400;

    public Accounting(String ID) 
    {
        super.setID(ID);
    }

    public float getBank() 
    {
        return bank;
    }

    public void setBank(float a) 
    {
        this.bank = a;
    }

    public int getEconomic() 
    {
        return economic;
    }

    public void setEconomic(int economic) 
    {
        this.economic = economic;
    }

    public int getBusiness() {
        return business;
    }

    public void setBusiness(int business) 
    {
        this.business = business;
    }

    public int getFirstClass() 
    {
        return firstClass;
    }

    public void setFirstClass(int firstClass) 
    {
        this.firstClass = firstClass;
    }

    public void processPayment(String resType, float estimatedDays) 
    {
        int priceModifier;
        switch (resType) 
        {
            case "economic":
                priceModifier = economic;
                break;
            case "business":
                priceModifier = business;
                break;
            case "first class":
                priceModifier = firstClass;
                break;
            default:
                throw new IllegalArgumentException("Unknown type:" + resType);
        }
    
        float amount = priceModifier * estimatedDays;
        bank += amount;
    }

    public void calculatePrice(String resType, float estimatedDay, float quitDay) 
    {
        int priceModifier;
        switch (resType) 
        {
            case "economic":
                priceModifier = economic;
                break;
            case "business":
                priceModifier = business;
                break;
            case "first class":
                priceModifier = firstClass;
                break;
            default:
                throw new IllegalArgumentException("Unknown type:" + resType);
        }

        float amount = priceModifier * (estimatedDay-(estimatedDay-quitDay));

        //negative stuff problematic ...
        bank -= Math.min(amount, bank);

    }
}
