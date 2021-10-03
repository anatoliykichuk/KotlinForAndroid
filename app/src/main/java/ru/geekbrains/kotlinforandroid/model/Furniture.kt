package ru.geekbrains.kotlinforandroid.model

import java.util.*

class Furniture(val name: String,
                val description: String = "",
                val kind: KindOfFurniture = KindOfFurniture.BED,
                val style: StyleOfFurniture = StyleOfFurniture.HIGTTECH,
                val dateOfManufacture: Date = Calendar.getInstance().time)