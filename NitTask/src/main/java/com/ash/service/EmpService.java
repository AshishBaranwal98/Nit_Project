package com.ash.service;

import com.ash.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EmpService
{
    public String addEmpDetails(Employee employee);

    public Optional<Employee> findById(int id);

    public String deleteEmpDetails(int id);
}
