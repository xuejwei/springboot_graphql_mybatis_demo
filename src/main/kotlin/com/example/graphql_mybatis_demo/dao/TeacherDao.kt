package com.example.graphql_mybatis_demo.dao

import com.example.graphql_mybatis_demo.dto.School
import com.example.graphql_mybatis_demo.dto.Teacher
import org.springframework.stereotype.Repository

/**
 *@author zhangqiang
 *@date   2019/1/29
 */
@Repository
interface TeacherDao {

    fun listTeachers(): List<Teacher>

    fun getTeachersBySchoolId(teacherId: String): List<Teacher>

    fun insertTeacher(teacher: Teacher)

    fun updateTeacher(teacher: Teacher)

    fun deleteTeacherByTeacherId(teacherId: String)
}
//
//@Repository
//class SchoolDaoImpl : SchoolDao {
//    override fun listSchools(): List<School> {
//        return listOf(
//                School(schoolId = "schoolId0",schoolAddress = "南翔街0号",schoolAge = 0,schoolName = "视睿大学"),
//                School(schoolId = "schoolId1",schoolAddress = "南翔街0号",schoolAge = 1,schoolName = "视睿大学"))
//    }
//
//    override fun insertSchool(school: School) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun updateSchool(school: School) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun deleteSchoolBySchoolId(schoolId: String) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//}