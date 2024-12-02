package com.valmal.service.impl

import com.valmal.dto.DepartmentsDto
import com.valmal.service.DepartmentService
import org.springframework.stereotype.Service

@Service
class DepartmentServiceImpl: DepartmentService {

    override fun getAll(): List<DepartmentsDto> {
        return listOf(
            DepartmentsDto(1, "Теплобюро"),
            DepartmentsDto(2, "Электробюро"),
            DepartmentsDto(3, "Экобюро"),
            DepartmentsDto(4, "Участок водоподготовки")
        )
    }
}