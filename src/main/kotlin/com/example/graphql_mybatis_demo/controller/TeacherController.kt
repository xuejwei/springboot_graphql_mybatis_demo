package com.example.graphql_mybatis_demo.controller

import com.example.graphql_mybatis_demo.dto.Teacher
import com.example.graphql_mybatis_demo.service.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 *@author zhangqiang
 *@date   2019/1/29
 */

@RestController
@RequestMapping("/teacher")
class TeacherController {

    @Autowired
    private lateinit var teacherService: TeacherService

    @GetMapping()
    fun listTeachers(): String {
        return teacherService.listTeachers().toString()
    }

    @GetMapping("/{schoolId}")
    fun getTeachersBySchoolId(@PathVariable schoolId: String): String {
        return teacherService.getTeachersBySchoolId(schoolId).toString()
    }

    @PostMapping()
    fun insertTeacher(@RequestBody teacher: Teacher) {
        teacherService.insertTeacher(teacher)
    }

    @PostMapping("/deleteTeacher/{teacherId}")
    fun deleteSchoolBySchoolId(@PathVariable teacherId: String) {
        teacherService.deleteTeacherByTeacherId(teacherId)
    }

    @PostMapping("/updateTeacher")
    fun updateTeacher(@RequestBody teacher: Teacher) {
        teacherService.updateTeacher(teacher)
    }
}