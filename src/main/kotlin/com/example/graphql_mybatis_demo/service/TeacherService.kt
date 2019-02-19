package com.example.graphql_mybatis_demo.service

import com.example.graphql_mybatis_demo.dto.School
import com.example.graphql_mybatis_demo.dto.Teacher

/**
 *@author zhangqiang
 *@date   2019/1/29
 */
interface TeacherService {

    fun listTeachers(): List<Teacher>

    fun getTeachersBySchoolId(schoolId: String): List<Teacher>

    fun insertTeacher(teacher: Teacher)

    fun updateTeacher(teacher: Teacher)

    fun deleteTeacherByTeacherId(teacherId: String)
}