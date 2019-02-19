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
data class School(
        val id: String = "commonId",
        var schoolId: String = "",
        var schoolName: String = "",
        var schoolAge: Int = 0,
        var schoolAddress: String = ""
) {
    override fun toString(): String {
        return JSON.toJSONString(this)
    }
}