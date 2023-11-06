package HotelClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.JOptionPane;

public class ReservationWorker extends Person {

    private List<Customer> customers;
    private Accounting accounting;

    public ReservationWorker(String ID, Accounting accounting) 
    {
        super.setID(ID);
        this.customers = new ArrayList<>();
        this.accounting = accounting;
    }
    
    public Customer createCustomer(String ID, String resType, float estimatedDay) 
    {
        // I forgot this and it go to negative aaaaaAA 
        accounting.processPayment(resType, estimatedDay);
        Customer customer = new Customer(ID, resType, estimatedDay);
        customers.add(customer);
        return customer;
    }

    public void modifyReservation(Customer customer, float newEstimatedDay) 
    {
        customer.setEstimatedDay(newEstimatedDay);
    }

    public void cancelReservation(Customer customer) 
    {
        // Finding the customer by ID and remove them , this give me a headache :(
        Optional<Customer> customerOptional = customers.stream()
                                                       .filter(c -> c.getID().equals(customer.getID()))
                                                       .findFirst();

        if (customerOptional.isPresent()) 
        {
            //this should give correct quit for calc (pls)
                String quitDayInput = JOptionPane.showInputDialog(null, "Enter the actual quit day for customer " + customer.getID() + " : ");
                float newQuitDay;
            try {
                newQuitDay = Float.parseFloat(quitDayInput);
                } 
                catch (NumberFormatException e) 
                {
                    JOptionPane.showMessageDialog(null, "Invalid input for quit day.Please enter a numeric value!!! ");
                    return;
                }

            customer.setQuitDay(newQuitDay);

            // Calculate the refund amount and remove (changed stuff it may broke something, it was looking fine didnt test)
            accounting.calculatePrice(customer.getResType(), customer.getEstimatedDay(), customer.getQuitDay());
            customers.remove(customerOptional.get());
        }
    }

    @Override
    public String getID() 
    {
        return super.getID();
    }
}

