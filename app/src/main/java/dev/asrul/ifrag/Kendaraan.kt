package dev.asrul.ifrag

import android.os.Parcel
import android.os.Parcelable

data class Kendaraan (
    val nama: String?,
    val jumlah_roda: Int?,
    val warna: String?,
    val harga: String?
    ): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeValue(jumlah_roda)
        parcel.writeString(warna)
        parcel.writeString(harga)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Kendaraan> {
        override fun createFromParcel(parcel: Parcel): Kendaraan {
            return Kendaraan(parcel)
        }

        override fun newArray(size: Int): Array<Kendaraan?> {
            return arrayOfNulls(size)
        }
    }
}