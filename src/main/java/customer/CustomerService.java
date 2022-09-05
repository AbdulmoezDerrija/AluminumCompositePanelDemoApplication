package customer;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class CustomerService {
    public List<Customer> getCustomers() {
        return List.of(
                new Customer(
                        1L,
                        "Ahmed",
                        "Steve",
                        "AhmedSteve@gmail.com",
                        "Libyan",
                        20,
                        LocalDate.of(2002, Month.JANUARY, 25),
                        "0925752564",
                        "Tripoli, Algraba street"
                ));
    }
}
