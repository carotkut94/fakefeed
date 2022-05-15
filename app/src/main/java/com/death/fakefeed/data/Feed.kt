package com.death.fakefeed.data


import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Keep
@Serializable
data class Feed(
    @SerialName("bottom_strip")
    val bottomStrip: BottomStrip,
    @SerialName("header")
    val header: Header,
    @SerialName("image_post")
    val image: ImagePost?,
    @SerialName("post_id")
    val postId: Int,
    @SerialName("text_post")
    val text: Text?,
    @SerialName("type")
    val type: String,
    @SerialName("video_post")
    val video: Video?
)