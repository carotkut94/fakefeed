package com.death.fakefeed.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class Header(
    @SerialName("name")
    val name: String,
    @SerialName("posted_at")
    val postedAt: String,
    @SerialName("profile_image")
    val profileImage: ImageLinks
)