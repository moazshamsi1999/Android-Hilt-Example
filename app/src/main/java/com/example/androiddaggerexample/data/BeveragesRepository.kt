package com.example.androiddaggerexample.data

import kotlinx.coroutines.delay
import javax.inject.Inject

class BeveragesRepository @Inject constructor(beverageService: BeverageService) {
    private val beverages = listOf("Coke", "Pepsi", "Fanta", "Sprite")
    suspend fun getBeverages(): List<String> {
        //It shouldve been beverageService.getBeverages() but we are not using it,since purpose is to understand DI
        delay(1000)
        return beverages
    }

}