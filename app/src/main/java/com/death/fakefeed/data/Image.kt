package com.death.fakefeed.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class ImagePost(
    @SerialName("multiple")
    val multiple: Boolean,
    @SerialName("urls")
    val urls: List<ImageData>
)