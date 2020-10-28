package com.cybertek.restintro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class University {

    private Integer id;
    private String name;
    private String address;
    private Integer yearBuilt;
    private List<Faculty> facultyList;

}
