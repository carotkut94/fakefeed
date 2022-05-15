package com.death.fakefeed.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class Content(
    @SerialName("compressed_text")
    val compressedText: String,
    @SerialName("full_text")
    val fullText: String
)