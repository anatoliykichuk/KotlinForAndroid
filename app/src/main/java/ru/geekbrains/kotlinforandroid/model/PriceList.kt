package ru.geekbrains.kotlinforandroid.model

import java.util.*

data class PriceList(val date: Date, val furniture: Furniture,
                     val currency: Currency, val price: Double) {

}