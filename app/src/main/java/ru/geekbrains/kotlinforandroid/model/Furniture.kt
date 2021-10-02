package ru.geekbrains.kotlinforandroid.model

import java.util.*

interface Furniture {
    val name: String
    val description: String
    val kind: KindOfFurniture
    val style: StyleOfFurniture
    val dateOfManufacture: Date
}