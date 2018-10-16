package lk.ijse.git.login.service.impl;

import lk.ijse.git.login.dto.CustomerDTO;
import lk.ijse.git.login.entity.Customer;
import lk.ijse.git.login.repository.CustomerRepository;
import lk.ijse.git.login.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public boolean saveCustomer(CustomerDTO customer) {
        Customer customer1 = new Customer(customer.getUserName(),
                customer.getCustomerName(),
                customer.getContact(),
                customer.getEmail(),
                customer.getAddress(),
                customer.getPassword());
        customerRepository.save(customer1);
        return true;
    }

    @Override
    public boolean canAuthenticate(String username, String password) {
        boolean exists = customerRepository.existsById(username);

        if (!exists){
            return false;
        }

        Customer customer = customerRepository.findById(username).get();

        return customer.getPassword().equals(password);
    }
}
