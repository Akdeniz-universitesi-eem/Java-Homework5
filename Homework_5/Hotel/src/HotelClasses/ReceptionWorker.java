package HotelClasses;

public class ReceptionWorker extends ReservationWorker {


    public ReceptionWorker(String ID, Accounting accounting) 
    {
        super(ID, accounting);
    }

    @Override
    public String getID() 
    {
        return super.getID();
    }

    @Override
    public void setID(String ID) 
    {
        super.setID(ID);
    }

    @Override
    public Customer createCustomer(String ID, String resType, float estimatedDay) 
    {
        return super.createCustomer(ID, resType, estimatedDay);
    }

    @Override
    public void modifyReservation(Customer customer, float newEstimatedDay) 
    {
        super.modifyReservation(customer, newEstimatedDay);
    }

    @Override
    public void cancelReservation(Customer customer) 
    {
        super.cancelReservation(customer);
    }

    //Otel Çıkış/çıkış eklenicek ama anlamadım ne olduğunu ? Su anda hiçbir anlamı yok bu classın
}
