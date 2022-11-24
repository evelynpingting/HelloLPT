package my.edu.tarc.hellolpt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resource class
        setContentView(R.layout.activity_main)
    }
}