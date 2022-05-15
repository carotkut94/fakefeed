package com.death.fakefeed.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class ImageData(
    @SerialName("high")
    val high: ImageUrl,
    @SerialName("low")
    val low: ImageUrl,
    @SerialName("medium")
    val medium: ImageUrl
)