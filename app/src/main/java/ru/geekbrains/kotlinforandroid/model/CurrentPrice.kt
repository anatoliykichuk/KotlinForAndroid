package ru.geekbrains.kotlinforandroid.model

import java.time.LocalDate
import java.util.*

class CurrentPrice() {

    companion object {
        fun getPrice(priceList: List<Price>, furniture: Furniture): Double {
            val currentDate = Date()
            var currentPrice: Double = 0.00
            var maxDate: Date = Date(0, 0, 1)

            for (price in priceList) {
                if(price.date > maxDate && price.date <= currentDate) {
                    maxDate = price.date
                    currentPrice = price.price
                }
            }
            return currentPrice
        }
    }
}