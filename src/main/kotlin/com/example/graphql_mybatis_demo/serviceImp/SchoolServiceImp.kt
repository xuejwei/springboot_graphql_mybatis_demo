package com.example.graphql_mybatis_demo.serviceImp

import com.example.graphql_mybatis_demo.dao.SchoolDao
import com.example.graphql_mybatis_demo.dto.School
import com.example.graphql_mybatis_demo.service.SchoolService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 *@author zhangqiang
 *@date   2019/1/29
 */
@Service
class SchoolServiceImp : SchoolService {

    @Autowired
    private lateinit var schoolDao: SchoolDao

    override fun updateSchool(school: School) {
        schoolDao.updateSchool(school)
    }

    override fun insertSchool(school: School) {
        schoolDao.insertSchool(school)
    }

    override fun deleteSchoolBySchoolId(schoolId: String) {
        schoolDao.deleteSchoolBySchoolId(schoolId)
    }

    override fun listSchools(): List<School> {
        return schoolDao.listSchools()
    }

    override fun getSchoolBySchoolId(schoolId: String): School {
        return schoolDao.getSchoolBySchoolId(schoolId)
    }

}