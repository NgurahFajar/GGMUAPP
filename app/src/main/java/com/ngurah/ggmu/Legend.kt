package com.ngurah.ggmu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable



data class Legend(
    var name: String ="",
    var photo: Int = 0,
    var description: String="",
    var title: String= "",
    var prestasinya: String= "",
    var prestasi: String=""

):Serializable