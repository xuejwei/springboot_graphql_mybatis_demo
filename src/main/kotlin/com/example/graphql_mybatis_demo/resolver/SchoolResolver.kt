package com.example.graphql_mybatis_demo.resolver

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.coxautodev.graphql.tools.GraphQLResolver
import com.example.graphql_mybatis_demo.dto.School
import com.example.graphql_mybatis_demo.dto.Teacher
import com.example.graphql_mybatis_demo.service.SchoolService
import com.example.graphql_mybatis_demo.service.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 *@author zhangqiang
 *@date   2019/2/11
 */
@Component
class SchoolQueryResolver : GraphQLQueryResolver {

    @Autowired
    private lateinit var schoolService: SchoolService

    fun school(schoolId: String): School {
        return schoolService.getSchoolBySchoolId(schoolId)
    }
}

@Component
class SchoolTeachersQueryResolver : GraphQLResolver<School> {

    @Autowired
    private lateinit var teacherService: TeacherService

    fun getTeachers(school: School): List<Teacher> {
        return teacherService.getTeachersBySchoolId(school.schoolId)
    }

    fun getMaster(school:School):String{
        return "schoolMaster"
    }
}

@Component
class SchoolMutationResolver : GraphQLMutationResolver {

    @Autowired
    private lateinit var schoolService: SchoolService

    fun insertSchool(schoolId: String, schoolName: String, schoolAge: Int, schoolAddress: String): School {
        schoolService.insertSchool(School("commonId", schoolId, schoolName, schoolAge, schoolAddress))
        return schoolService.getSchoolBySchoolId(schoolId)
    }
}
