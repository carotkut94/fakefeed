package com.death.fakefeed.data


import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Keep
@Serializable
data class Video(
    @SerialName("image")
    val image: ImageData,
    @SerialName("video_url")
    val videoUrl: String
)