package com.example.pertemuan_1.data.model

data class Category(
    val id: Int,
    val name: String,
    val description: String? = null,
    val products_count: Int? = null
)

data class Product(
    val id: Int,
    val category_id: Int,
    val category: Category? = null,
    val name: String,
    val description: String? = null,
    val price: Double,
    val stock: Int,
    val img: String? = null
)

