package com.JpaCrud.demo;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "course_generator")
    @SequenceGenerator(name = "course_generator" , allocationSize = 1)
    private Long id;

    @Column(name = "name" , nullable = false)
    private String name;

    public Course(Long id, String name){
        this.id = id;
        this.name =  name;

    }

    @ManyToOne(fetch = FetchType.EAGER)
    private Instructor instructor;

 //   @ManyToMany(mappedBy = "course")
 //   private Set<Student> students = new HashSet<>();



    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
