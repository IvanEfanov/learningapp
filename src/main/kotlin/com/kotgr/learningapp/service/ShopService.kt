package com.kotgr.learningapp.service

import com.kotgr.learningapp.dto.ShopDto
import com.kotgr.learningapp.mapper.ShopMapper
import com.kotgr.learningapp.repository.ShopRepository
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service

/**
 * ShopService.
 * @author Ephanov Ivan
 */
@Service
class ShopService(private val shopRepository: ShopRepository) {

    val mapper: ShopMapper = Mappers.getMapper(ShopMapper::class.java)

    fun create(dto: ShopDto): Long = shopRepository.save(mapper.toModel(dto)).id

    fun get(id: Long): ShopDto = mapper.toDto(shopRepository.getById(id))
}