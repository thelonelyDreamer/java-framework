package org.example.pojo.p33;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * in order to learn java!
 * created at 2022/7/28 00:34
 *
 * @author felixwc
 */
@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "students")
    private Set<Teacher> teachers;
}
