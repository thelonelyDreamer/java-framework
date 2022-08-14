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
@Table(name = "teacher")
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "t_teacher_student",
            joinColumns = @JoinColumn(name = "t_id",referencedColumnName = "id"),
            inverseJoinColumns = {@JoinColumn(name = "s_id",referencedColumnName = "id")}
    )
    private Set<Student> students;
}
