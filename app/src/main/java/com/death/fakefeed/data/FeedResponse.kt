package com.death.fakefeed.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class FeedResponse(
    @SerialName("feed")
    val feed: List<Feed>,
    @SerialName("message")
    val message: String
)