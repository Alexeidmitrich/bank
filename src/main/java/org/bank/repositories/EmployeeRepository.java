package org.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.bank.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
