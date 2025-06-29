
package com.ronik.weatherapp.domain.repository

import com.ronik.weatherapp.domain.util.Resource
import com.ronik.weatherapp.domain.weather.WeatherInfo


interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}