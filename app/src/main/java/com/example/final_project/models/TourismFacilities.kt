package com.example.final_project.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TourismFacilities(
    val tfacilitiesID: Long,
    val createdAt: String,
    val updatedAt: String? = null,
    val facilitiesName: String
): Parcelable
