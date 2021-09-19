package com.kotgr.learningapp.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.NoRepositoryBean
import java.io.Serializable

/**
 * BaseRepository.
 * @author Ephanov Ivan
 */
@NoRepositoryBean
interface BaseRepository<T, I : Serializable?> : JpaRepository<T, I>, JpaSpecificationExecutor<T>