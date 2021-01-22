package mx.com.cargamos.library.opencvlibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.opencv.ocr.activity.OcrRecgnition

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, OcrRecgnition::class.java)
        startActivity(intent)

        capture.setOnClickListener {
            val intent = Intent(this, OcrRecgnition::class.java)
            startActivity(intent)
        }
    }
}