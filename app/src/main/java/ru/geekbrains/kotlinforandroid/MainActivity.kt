package ru.geekbrains.kotlinforandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.geekbrains.kotlinforandroid.model.Currency
import ru.geekbrains.kotlinforandroid.model.CurrentPrice
import ru.geekbrains.kotlinforandroid.model.Furniture
import ru.geekbrains.kotlinforandroid.model.Price
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bed = Furniture("Односпальная кровать SOLO")
        val rur = Currency("Рубль", "RUR")

        val priceList = arrayListOf<Price>()
        priceList.add(Price(bed, 1450.00, rur, Date(119, 4, 30)))
        priceList.add(Price(bed, 1600.00, rur, Date(120, 8, 31)))

        val currentPrice = CurrentPrice.getPrice(priceList, bed)
        println("Actual price of ${bed.toString()} is $currentPrice")
    }
}