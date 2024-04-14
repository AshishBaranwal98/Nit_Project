package com.ash.serviceimpl;

import com.ash.entity.Employee;
import com.ash.repo.EmpRepo;
import com.ash.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService
{
    @Autowired
    private EmpRepo empRepo;


    @Override
    public String addEmpDetails(Employee employee)
    {
        empRepo.save(employee);
        return "save data successfully";
    }
    @Override
    public Optional<Employee> findById(int id)
    {
        return  empRepo.findById(id);
    }
    @Override
    public String deleteEmpDetails(int id)
    {
        empRepo.deleteById(id);
        return "user data deleted";
    }
}
