package com.valmal.controller

import com.valmal.dto.DepartmentsDto
import com.valmal.service.DepartmentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/departments")
class RestController(private val departmentService: DepartmentService) {
    
    @GetMapping
    fun getAll(): List<DepartmentsDto> = departmentService.getAll()

}