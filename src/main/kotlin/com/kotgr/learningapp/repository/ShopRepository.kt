package com.kotgr.learningapp.repository

import com.kotgr.learningapp.model.Shop
import org.springframework.stereotype.Repository

@Repository
interface ShopRepository : BaseRepository<Shop, Long>