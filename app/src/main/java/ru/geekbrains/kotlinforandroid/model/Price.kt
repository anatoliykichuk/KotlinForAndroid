package ru.geekbrains.kotlinforandroid.model

import java.util.*

data class Price(val furniture: Furniture,
                 val price: Double,
                 val currency: Currency,
                 val date: Date = Calendar.getInstance().time)