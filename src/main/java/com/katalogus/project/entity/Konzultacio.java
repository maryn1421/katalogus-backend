package com.katalogus.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Konzultacio {

    @Id
    private Long id;

    private Long teacher_id;

    private Long turnus_id;

    private String name;

    private Integer point;
}
