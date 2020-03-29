package Chaerul.hitung_umur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {

            //deklarasi edit text
            var tahunLahir = etInputUmur.text.toString().toInt()

            //get tahun saat ini dengan kalender
            var tahun:Int = Calendar.getInstance().get(Calendar.YEAR)

            //set umur tahun saat ini dikurangi dengan input pada text
            var umur = tahun - tahunLahir

            //hasil
            tvUmur.text = "Umur anda saat ini adalah $umur tahun"
        }
    }
}
