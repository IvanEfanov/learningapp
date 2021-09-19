package com.kotgr.learningapp.dto

/**
 * ShopDto.
 * @author Ephanov Ivan
 */
data class ShopDto(
        var id: Long = -1L,
        var name: String = "",
        var address: String = "",
        var phone: String = ""
)