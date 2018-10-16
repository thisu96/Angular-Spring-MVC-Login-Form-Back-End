package lk.ijse.git.login.repository;

import lk.ijse.git.login.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
