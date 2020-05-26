package com.example.tourweatherreminder


data class CityWeather(val city: String,
                       val weatherDescription: String,
                       val temperature: Float,
                       val rainPercentage: String,
                       val cloudyPercentage: String,
                       val windSpeed: String) : ViewType {

    override fun getViewType(): Int = ViewType.HEADER

}
