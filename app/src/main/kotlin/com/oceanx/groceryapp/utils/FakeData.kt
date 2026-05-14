package com.oceanx.groceryapp.utils

import com.oceanx.groceryapp.data.model.Product

object FakeData {

    val categories = listOf("All", "Fruits", "Vegetables", "Dairy", "Bakery", "Beverages", "Snacks")

    val products = listOf(
        Product(1,  "Apple",          "Fruits",     120.0, "https://images.unsplash.com/photo-1568702846914-96b305d2aaeb?w=300", "1 kg"),
        Product(2,  "Banana",         "Fruits",      50.0, "https://images.unsplash.com/photo-1571771894821-ce9b6c11b08e?w=300", "Dozen"),
        Product(3,  "Mango",          "Fruits",     180.0, "https://images.unsplash.com/photo-1601493700631-2b16ec4b4716?w=300", "1 kg"),
        Product(4,  "Grapes",         "Fruits",      90.0, "https://images.unsplash.com/photo-1474772436896-0b88b7e5fa85?w=300", "500 g"),
        Product(5,  "Tomato",         "Vegetables",  40.0, "https://images.unsplash.com/photo-1561155707-7eb7f4c45a1b?w=300", "1 kg"),
        Product(6,  "Onion",          "Vegetables",  30.0, "https://images.unsplash.com/photo-1618512496248-a07fe83aa8cb?w=300", "1 kg"),
        Product(7,  "Spinach",        "Vegetables",  25.0, "https://images.unsplash.com/photo-1576045057995-568f588f82fb?w=300", "250 g"),
        Product(8,  "Carrot",         "Vegetables",  35.0, "https://images.unsplash.com/photo-1598170845058-32b9d6a5da37?w=300", "500 g"),
        Product(9,  "Milk",           "Dairy",       60.0, "https://images.unsplash.com/photo-1563636619-e9143da7973b?w=300", "1 L"),
        Product(10, "Paneer",         "Dairy",       90.0, "https://images.unsplash.com/photo-1631452180519-c014fe946bc7?w=300", "200 g"),
        Product(11, "Curd",           "Dairy",       45.0, "https://images.unsplash.com/photo-1488477181228-c84def5b9b7e?w=300", "500 g"),
        Product(12, "Bread",          "Bakery",      45.0, "https://images.unsplash.com/photo-1509440159596-0249088772ff?w=300", "400 g"),
        Product(13, "Bun",            "Bakery",      30.0, "https://images.unsplash.com/photo-1555507036-ab1f4038808a?w=300", "Pack of 6"),
        Product(14, "Orange Juice",   "Beverages",   80.0, "https://images.unsplash.com/photo-1600271886742-f049cd451bba?w=300", "1 L"),
        Product(15, "Mineral Water",  "Beverages",   20.0, "https://images.unsplash.com/photo-1548839140-29a749e1cf4d?w=300", "1 L"),
        Product(16, "Chips",          "Snacks",      30.0, "https://images.unsplash.com/photo-1566478989037-eec170784d0b?w=300", "50 g"),
        Product(17, "Biscuits",       "Snacks",      25.0, "https://images.unsplash.com/photo-1558961363-fa8fdf82db35?w=300", "100 g")
    )
}
