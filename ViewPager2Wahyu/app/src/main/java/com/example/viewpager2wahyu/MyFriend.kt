package com.example.viewpager2wahyu

import android.media.Image
import android.provider.ContactsContract.CommonDataKinds.Email
import android.provider.ContactsContract.CommonDataKinds.Phone

data class MyFriend (
    val name: String,
    val jekel: String,
    val phone: String,
    val email: String,
    val image: Int
)