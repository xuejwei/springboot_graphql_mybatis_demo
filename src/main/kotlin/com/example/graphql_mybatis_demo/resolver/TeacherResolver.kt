package com.example.graphql_mybatis_demo.resolver

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.coxautodev.graphql.tools.GraphQLResolver
import com.example.graphql_mybatis_demo.dto.School
import com.example.graphql_mybatis_demo.dto.Teacher
import com.example.graphql_mybatis_demo.dto.TeacherInput
import com.example.graphql_mybatis_demo.service.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 *@author zhangqiang
 *@date   2019/2/11
 */
@Component
class TeacherMutationResolver : GraphQLMutationResolver {

    @Autowired
    private lateinit var teacherService: TeacherService

    fun insertTeacher(teacherInput:TeacherInput): Teacher {
        val teacher=teacherInput.toTeacher()
        teacherService.insertTeacher(teacher)
        return teacher
    }
}
