package com.death.fakefeed.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class Share(
    @SerialName("enabled")
    val enabled: Boolean
)