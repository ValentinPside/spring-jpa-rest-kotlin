package com.valmal.service.impl

import com.valmal.dto.DepartmentsDto
import com.valmal.entity.DepartmentEntity
import com.valmal.repository.DepartmentsRepository
import com.valmal.service.DepartmentService
import org.springframework.stereotype.Service

@Service
class DepartmentServiceImpl(
    private val departmentsRepository: DepartmentsRepository
) : DepartmentService {

    override fun getAll(): List<DepartmentsDto> {
        return departmentsRepository.findByOrderByName().map {
            it.asDepartmentDto()
        }
    }

    private fun DepartmentEntity.asDepartmentDto(): DepartmentsDto =
        DepartmentsDto(
            id = this.id,
            name = this.name
        )
}