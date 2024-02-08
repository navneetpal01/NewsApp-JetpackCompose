package com.loc.newsapp.domain.usecases.app_entry

import com.loc.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow
//The invoke() operator in Kotlin is used to overload the function call operator (). This allows an instance of a class to be called as if it were a function
class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    operator fun invoke() : Flow<Boolean> {
       return localUserManager.readAppEntry()
    }
}