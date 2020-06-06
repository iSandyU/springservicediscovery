package com.sandeepmane.calculateageservice.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Student implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -7484216244324649042L;

    private int id;

    @NonNull
    private String name;

    @NonNull
    private int age;
}