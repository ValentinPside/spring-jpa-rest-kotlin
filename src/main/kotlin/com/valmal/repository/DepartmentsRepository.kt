package com.valmal.repository

import com.valmal.entity.DepartmentEntity
import org.springframework.data.repository.CrudRepository

interface DepartmentsRepository: CrudRepository<DepartmentEntity, Int>{

    fun findByOrderByName(): List<DepartmentEntity>
}