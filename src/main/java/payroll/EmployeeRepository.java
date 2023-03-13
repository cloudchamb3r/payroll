package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

/// JpaRepository<DomainType, IdType>
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
