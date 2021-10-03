package ru.geekbrains.kotlinforandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.geekbrains.kotlinforandroid.model.Currency
import ru.geekbrains.kotlinforandroid.model.Furniture
import ru.geekbrains.kotlinforandroid.model.Price

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bed = Furniture("Односпальная кровать SOLO")

        val currency = Currency("Рубль", "RUR")
        val price = Price(bed, 1600.00, currency)

        val priceList = listOf<Price>(price)

        //val currentPrice: Double = currentPrice.getPrice(priceList, bed);
    }
}