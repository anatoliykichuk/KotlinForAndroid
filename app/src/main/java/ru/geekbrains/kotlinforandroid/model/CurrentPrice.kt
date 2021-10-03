package ru.geekbrains.kotlinforandroid.model

import java.time.LocalDate
import java.util.*

class CurrentPrice() {

    companion object {
        fun getPrice(priceList: List<Price>, furniture: Furniture) {
            val currentPrice: Price
            val date: Date
            val currentDate = Calendar.getInstance().time

            for (price in priceList) {

//                if(price.date <= currentDate &&  price.date > date) {
//
//                }

            }
        }
    }
}