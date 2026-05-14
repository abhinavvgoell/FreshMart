# 🛒 FreshMart – Mini Grocery Delivery App

A Blinkit-style grocery delivery Android app built for the **OceanX Agency Kotlin Android Assignment**.

---

## 📱 Features

### Core Features
| Screen | Features |
|---|---|
| **Login / OTP** | Mobile number input, fake OTP (1234), 30s resend timer, navigate to Home |
| **Home Screen** | Search products, category filter, product grid (image, name, price), add to cart |
| **Cart Screen** | Show added items, increase/decrease quantity, remove item, bill summary with delivery fee |
| **Checkout Screen** | Delivery address input, COD / Online payment options, place order |
| **Order Success** | Order ID, estimated delivery time (30–45 min), address & payment summary |

### Bonus Features ✅
- **MVVM Architecture** – ViewModel + LiveData throughout
- **Room Database** – Cart persisted locally using Room DB
- **Smooth UI** – RecyclerView with DiffUtil, card animations

---

## 🛠 Tech Stack

- **Language:** Kotlin
- **UI:** XML Layouts, RecyclerView, CardView, Material Components
- **Architecture:** MVVM (ViewModel + LiveData)
- **Database:** Room DB (local cart persistence)
- **Image Loading:** Glide
- **Async:** Kotlin Coroutines

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/FreshMart.git
   ```
2. Open in **Android Studio Hedgehog** or later
3. Wait for Gradle sync to complete
4. Run on emulator or device (min SDK 24 / Android 7.0)

### Test Login
- Enter any 10-digit mobile number
- Use OTP: **1234**

---

## 📁 Project Structure

```
app/src/main/
├── kotlin/com/oceanx/groceryapp/
│   ├── data/
│   │   ├── local/         # Room DB, DAO
│   │   ├── model/         # Product, CartItem data classes
│   │   └── repository/    # CartRepository
│   ├── ui/
│   │   ├── login/         # LoginActivity
│   │   ├── home/          # HomeActivity, ProductAdapter, CategoryAdapter
│   │   ├── cart/          # CartActivity, CartAdapter
│   │   ├── checkout/      # CheckoutActivity
│   │   └── order/         # OrderSuccessActivity
│   ├── viewmodel/         # CartViewModel
│   └── utils/             # FakeData (product list)
└── res/
    ├── layout/            # All XML layouts
    ├── drawable/          # Icons, selectors, backgrounds
    └── values/            # Colors, themes, strings
```

---

## 📸 Screens

1. Login with OTP verification
2. Home with category filter + product grid
3. Cart with quantity controls + bill summary
4. Checkout with address + payment selection
5. Order success with order details

---

*Built with ❤️ for OceanX Agency Assignment*
