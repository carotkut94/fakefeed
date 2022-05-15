package com.death.fakefeed.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class BottomStrip(
    @SerialName("comment")
    val comment: Comment,
    @SerialName("like")
    val like: Like,
    @SerialName("share")
    val share: Share
)