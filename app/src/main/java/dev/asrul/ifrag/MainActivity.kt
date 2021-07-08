package dev.asrul.ifrag

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.net.URI

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPindahActivity: Button = findViewById(R.id.btn_pindah_activity)
        val btnPindahActivityDenganData: Button = findViewById(R.id.btn_pindah_activity_dengan_data)
        val btnTelponAku: Button = findViewById(R.id.btn_telpon_aku)
        val btnKirimObj: Button = findViewById(R.id.btn_kirim_obj)

        btnPindahActivity.setOnClickListener(this)
        btnPindahActivityDenganData.setOnClickListener(this)
        btnTelponAku.setOnClickListener(this)
        btnKirimObj.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_pindah_activity -> {
                val pindahIntent = Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(pindahIntent)
            }
            R.id.btn_pindah_activity_dengan_data -> {
                val pindahIntentDenganData = Intent(this@MainActivity, PindahDenganDataActivity::class.java)
                pindahIntentDenganData.putExtra(PindahDenganDataActivity.EXTRA_NAMA, "Martinus Sense")
                pindahIntentDenganData.putExtra(PindahDenganDataActivity.EXTRA_USIA, 26)
                startActivity(pindahIntentDenganData)
            }
            R.id.btn_telpon_aku -> {
                val telponku = "081211752502"
                val telponSekarang = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$telponku"))
                startActivity(telponSekarang)
            }
            R.id.btn_kirim_obj -> {
                val kendaraan = Kendaraan("Mobil Baru", 4, "Merah Cerah", "20000")
                val pindahDenganObjek = Intent(this@MainActivity, KendaraanObjectActivity::class.java)
                pindahDenganObjek.putExtra(KendaraanObjectActivity.EXTRA_KENDARAAN, kendaraan)
                startActivity(pindahDenganObjek)
            }
        }
    }
}