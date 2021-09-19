package com.kotgr.learningapp.controller

import com.kotgr.learningapp.dto.ShopDto
import com.kotgr.learningapp.service.ShopService
import io.swagger.annotations.Api
import io.swagger.annotations.SwaggerDefinition
import io.swagger.annotations.Tag
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.*

/**
 * ShopController.
 * @author Ephanov Ivan
 */
@RestController
@Api(value = "ShopController", tags = ["shop-api"])
@SwaggerDefinition(tags = [Tag(name = "shop", description = "Контроллер для обработки запросов на CRUD операции для сущности shop")])
@RequestMapping("/v1/api/shop")
class ShopController(private val service: ShopService) {

    @PostMapping
    fun create(@RequestBody dto: ShopDto): ResponseEntity<Long> = ok(service.create(dto))

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): ResponseEntity<ShopDto> = ok(service.get(id))
}