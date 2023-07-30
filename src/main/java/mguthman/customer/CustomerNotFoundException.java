package mguthman.customer;

public class CustomerNotFoundException extends RuntimeException {
    
    public CustomerNotFoundException(Long id) {
        super("Could Not Find Customer " + id);
    }
}
