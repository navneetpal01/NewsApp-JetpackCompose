package com.loc.newsapp.domain.manager

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {
    //Flow can return multiple values unlike Suspend Function
    suspend fun saveAppEntry()
    fun readAppEntry(): Flow<Boolean>
}