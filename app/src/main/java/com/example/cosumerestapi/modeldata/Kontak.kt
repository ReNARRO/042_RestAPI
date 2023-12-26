package com.example.cosumerestapi.modeldata

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    //memberikan nama yang sesuai dengan nama yang ada di API
    @SerialName(value = "nama")
    val nama: String,
    @SerialName(value = "email")
    val email: String,
    @SerialName(value = "nohp")
    val nohp: String
)
