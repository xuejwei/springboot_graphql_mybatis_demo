package com.example.graphql_mybatis_demo.service

import com.example.graphql_mybatis_demo.dto.School

/**
 *@author zhangqiang
 *@date   2019/1/29
 */
interface SchoolService {

    fun listSchools(): List<School>

    fun getSchoolBySchoolId(schoolId: String): School

    fun insertSchool(school: School)

    fun updateSchool(school: School)

    fun deleteSchoolBySchoolId(schoolId: String)
}