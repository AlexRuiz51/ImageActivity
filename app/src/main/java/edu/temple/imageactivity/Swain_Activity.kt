package edu.temple.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_elise.*

class Swain_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swain)

        val intent: Intent = intent;
        var image:Int = intent.getIntExtra("image", 0);
        var name: String = "League of Legends Champion: " + intent.getStringExtra("name")!!;
        imageView.setImageResource(image);
        textView.setText(name)
    }
}