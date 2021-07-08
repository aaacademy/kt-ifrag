package dev.asrul.ifrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahDenganDataActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAMA = "extra nama"
        const val EXTRA_USIA = "extra usia"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_dengan_data)
        val tvDataDiterima: TextView = findViewById(R.id.tv_data_diterima)
        val nama = intent.getStringExtra(EXTRA_NAMA)
        val umur = intent.getIntExtra(EXTRA_USIA, 0)
        val result = "Jadi nama kamu adalah : $nama \ndan usia kamu adalah $umur"
        tvDataDiterima.text = result
    }

}