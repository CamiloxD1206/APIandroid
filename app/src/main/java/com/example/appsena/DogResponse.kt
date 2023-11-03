package com.example.appsena

import com.google.gson.annotations.SerializedName

class DogResponse(
    @SerializedName("message") var images:List<String>,
    @SerializedName("status") var status:String

    )