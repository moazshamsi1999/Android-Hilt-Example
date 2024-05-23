package com.example.androiddaggerexample.di

import com.example.androiddaggerexample.data.BeverageService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetModule {
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://popularBeveraged.com/")
            .build()
    }

    @Singleton
    @Provides
    fun provideBeverageService(retrofit: Retrofit): BeverageService {
        return retrofit.create(BeverageService::class.java)
    }
}