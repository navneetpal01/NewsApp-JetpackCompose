package com.loc.newsapp.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.loc.newsapp.domain.usecases.app_entry.AppEntryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(
    private val appEntryUseCases: AppEntryUseCases
) : ViewModel() {
    //Like Combination between MVI and MVVM because we don't want to use ViewModel Directly inside our Screen
    fun onEvent(event: OnBoardingEvent){
        when(event){
            is OnBoardingEvent.SavedAppEntry -> {
                saveAppEntry()
            }
        }
    }
    private fun saveAppEntry(){
        viewModelScope.launch {
            appEntryUseCases.saveAppEntry()
        }
    }


}