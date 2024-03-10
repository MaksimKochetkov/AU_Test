package com.example.au_test

import com.bumptech.glide.Glide

data class RecyclerDataclass(val photo: String)
class Photo_list {val list = arrayListOf(
        RecyclerDataclass("https://s5.afisha.ru/mediastorage/2f/f6/79b8c257133b4581ab21a52df62f.jpg"),
        RecyclerDataclass("https://s1.afisha.ru/mediastorage/ff/a0/a0db69b60c484a65a77c9c1aa0ff.jpg"),
        RecyclerDataclass("https://s2.afisha.ru/mediastorage/5c/08/e9551497d515423382578b65085c.jpg"),
        RecyclerDataclass("https://burninghut.ru/wp-content/uploads/2022/03/YA-krasneyu-1.jpg")
    )
}

