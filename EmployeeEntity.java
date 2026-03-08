package com.example.employee_system_api.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String emailId;
}