package com.kotgr.learningapp.mapper

import com.kotgr.learningapp.commons.CommonConstants.SPRING
import com.kotgr.learningapp.dto.ShopDto
import com.kotgr.learningapp.model.Shop
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy.IGNORE

/**
 * ShopMapper.
 * @author Ephanov Ivan
 */
@Mapper(unmappedTargetPolicy = IGNORE, componentModel = SPRING)
interface ShopMapper {

    fun toDto(model: Shop): ShopDto

    fun toModel(dto: ShopDto): Shop
}