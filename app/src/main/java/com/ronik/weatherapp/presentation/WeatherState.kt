

package com.ronik.weatherapp.presentation
import com.ronik.weatherapp.domain.weather.WeatherInfo


data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)