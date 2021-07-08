package dev.asrul.ifrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class KendaraanObjectActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_KENDARAAN = "extra kendaraan"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kendaraan_object)
        val tvObjName: TextView = findViewById(R.id.tv_obj_name)

        val kendaraan = intent.getParcelableExtra<Kendaraan>(EXTRA_KENDARAAN) as Kendaraan
        val objek = "nama: ${kendaraan.nama.toString()}, \n warna: ${kendaraan.warna.toString()} \nharga: ${kendaraan.harga.toString()} dan dan jumlah roda : ${kendaraan.jumlah_roda}"
        tvObjName.text = objek

    }
}