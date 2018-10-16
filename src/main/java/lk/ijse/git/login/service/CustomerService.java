package lk.ijse.git.login.service;

import lk.ijse.git.login.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {

    public boolean saveCustomer(CustomerDTO customer);

    boolean canAuthenticate(String username, String password);
}
