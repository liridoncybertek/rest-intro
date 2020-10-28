package com.cybertek.restintro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty {

    private Integer id;
    private String name;
    private List<Department> departmentList;
}
