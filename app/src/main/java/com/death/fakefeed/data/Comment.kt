package com.death.fakefeed.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class Comment(
    @SerialName("count")
    val count: Int,
    @SerialName("enabled")
    val enabled: Boolean
)