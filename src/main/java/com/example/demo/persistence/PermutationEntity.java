package com.example.demo.persistence;

import lombok.*;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "PERM_DB")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PermutationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int[] numbers;

}
