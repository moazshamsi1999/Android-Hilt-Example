package com.example.androiddaggerexample.domain

import com.example.androiddaggerexample.data.BeveragesRepository
import javax.inject.Inject

class GetPopularBeveragesUseCase @Inject constructor(private val beveragesRepository: BeveragesRepository) {
    suspend fun execute(): List<String> {
        return beveragesRepository.getBeverages()
    }
}