package com.example.graphql_mybatis_demo.controller

import com.example.graphql_mybatis_demo.dto.School
import com.example.graphql_mybatis_demo.service.SchoolService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 *@author zhangqiang
 *@date   2019/1/29
 */

@RestController
@RequestMapping("/school")
class SchoolController {

    @Autowired
    private lateinit var schoolService: SchoolService

    @GetMapping()
    fun listSchools(): String {
        return schoolService.listSchools().toString()
    }

    @GetMapping("/{schoolId}")
    fun getSchoolById(@PathVariable schoolId: String): String {
        return schoolService.getSchoolBySchoolId(schoolId).toString()
    }

    @PostMapping()
    fun insertSchool(@RequestBody school: School) {
        schoolService.insertSchool(school)
    }

    @PostMapping("/deleteSchool/{schoolId}")
    fun deleteSchoolBySchoolId(@PathVariable schoolId: String) {
        schoolService.deleteSchoolBySchoolId(schoolId)
    }

    @PostMapping("/updateSchool")
    fun updateSchool(@RequestBody school: School) {
        schoolService.updateSchool(school)
    }
}