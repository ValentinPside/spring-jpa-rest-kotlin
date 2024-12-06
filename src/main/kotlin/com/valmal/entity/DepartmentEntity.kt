package com.valmal.entity

import jakarta.persistence.*


@Entity
@Table(name = "departments")
class DepartmentEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val name: String = ""
)