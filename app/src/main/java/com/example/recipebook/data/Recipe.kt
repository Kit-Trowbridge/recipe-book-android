package com.example.recipebook.data

data class Recipe (
    val title: String,
    val image: Int, // can import images as drawable resources and use the drawable resource ID
    val ingredients: List<String>,
    val steps: List<String>
)
