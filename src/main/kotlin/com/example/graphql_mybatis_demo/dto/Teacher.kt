package com.example.graphql_mybatis_demo.dto

import com.alibaba.fastjson.JSON
import com.fasterxml.jackson.databind.JsonSerializer
import com.sun.xml.internal.ws.developer.Serialization
import jdk.nashorn.internal.parser.JSONParser

/**
 *@author zhangqiang
 *@date   2019/1/29
 */
@Serialization
data class Teacher(
        val id: String = "commonId",
        var teacherId: String = "",
        var teacherName: String = "",
        var teacherPhone: String = "",
        var schoolId: String = ""
) {
    override fun toString(): String {
        return JSON.toJSONString(this)
    }
}

@Serialization
data class TeacherInput(
        val id: String = "commonId",
        var teacherId: String = "",
        var teacherName: String = "",
        var teacherPhone: String = "",
        var schoolId: String = ""
) {
    override fun toString(): String {
        return JSON.toJSONString(this)
    }

    fun toTeacher():Teacher
    {
        return Teacher(id,teacherId,teacherName,teacherPhone,schoolId)
    }
}