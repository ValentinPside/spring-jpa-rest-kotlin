package com.valmal.service

import com.valmal.dto.DepartmentsDto

interface DepartmentService {

    fun getAll(): List<DepartmentsDto>

}