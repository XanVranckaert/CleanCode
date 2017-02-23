package be.cegeka;

import org.apache.catalina.startup.Tomcat;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.mockito.ArgumentMatchers.refEq;

public class CustomerServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    Customer customer;

    @Before
    public void setUp(){
        customer = new Customer("Xan");
    }

    @Test
    public void serviceAddCustomer_ShouldCall_RepoAddCustomer(){
        customerService.addCustomer("Xan");
        Mockito.verify(customerRepository).addCustomer(refEq(customer));
    }


}
