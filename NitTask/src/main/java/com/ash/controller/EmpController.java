package com.ash.controller;

import com.ash.entity.Employee;
import com.ash.service.EmpService;
import com.ash.serviceimpl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class EmpController
{
    @Autowired
    private EmpService empService;

    @PostMapping("/addEmpDetails")
    public String addEmpDetails(@RequestBody Employee employee)
    {
        empService.addEmpDetails(employee);
        return "Save data successfully";
    }

    @GetMapping("/findEmpDetails/{id}")
    public ResponseEntity<?> findById(@PathVariable int id)
    {
        Optional<Employee> optional = empService.findById(id);
        if (optional.isPresent())
        {
            return ResponseEntity.ok().body(optional.get());
        }
        else
        {
            String errorMessage = "User with ID " + id + " not found";
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", errorMessage);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

    @DeleteMapping("/deleteEmpDetails/{id}")
    public ResponseEntity<?> deleteEmpDetails(@PathVariable int id) throws Exception
    {
        Optional<Employee> optional = empService.findById(id);
        empService.deleteEmpDetails(id);
        return ResponseEntity.ok().build();

    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
