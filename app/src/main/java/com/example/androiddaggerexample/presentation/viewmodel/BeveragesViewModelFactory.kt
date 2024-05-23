package com.example.androiddaggerexample.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androiddaggerexample.domain.GetPopularBeveragesUseCase
import javax.inject.Inject

class BeveragesViewModelFactory @Inject constructor(
    private val getPopularBeveragesUseCase: GetPopularBeveragesUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BeveragesViewModel(
            getPopularBeveragesUseCase
        ) as T
    }
}