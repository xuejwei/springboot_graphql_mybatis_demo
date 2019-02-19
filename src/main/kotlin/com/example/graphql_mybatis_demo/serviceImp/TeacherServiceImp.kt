package com.example.graphql_mybatis_demo.serviceImp

import com.example.graphql_mybatis_demo.dao.TeacherDao
import com.example.graphql_mybatis_demo.dto.Teacher
import com.example.graphql_mybatis_demo.service.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 *@author zhangqiang
 *@date   2019/1/29
 */
@Service
class TeacherServiceImp : TeacherService {

    @Autowired
    private lateinit var teacherDao: TeacherDao

    override fun listTeachers(): List<Teacher> {
        return teacherDao.listTeachers()
    }

    override fun getTeachersBySchoolId(schoolId: String): List<Teacher> {
        return teacherDao.getTeachersBySchoolId(schoolId)
    }

    override fun insertTeacher(teacher: Teacher) {
        teacherDao.insertTeacher(teacher)
    }

    override fun updateTeacher(teacher: Teacher) {
        teacherDao.updateTeacher(teacher)
    }

    override fun deleteTeacherByTeacherId(teacherId: String) {
        teacherDao.deleteTeacherByTeacherId(teacherId)
    }

}