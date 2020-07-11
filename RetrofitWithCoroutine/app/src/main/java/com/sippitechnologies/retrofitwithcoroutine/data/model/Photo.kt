package com.sippitechnologies.retrofitwithcoroutine.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Photo(

	@Json(name="albumId")
	val albumId: Int? = null,

	@Json(name="id")
	val id: Int? = null,

	@Json(name="title")
	val title: String? = null,

	@Json(name="url")
	val url: String? = null,

	@Json(name="thumbnailUrl")
	val thumbnailUrl: String? = null
)
