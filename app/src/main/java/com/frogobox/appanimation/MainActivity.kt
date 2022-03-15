package com.frogobox.appanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.frogobox.animation.Bounce
import com.frogobox.animation.FrogoAnimation
import kotlin.render.demo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.TextView)

        val render = FrogoAnimation(this)
        render.setAnimation(Bounce().In(textView))
        render.setDuration(50000)
        render.start()
    }
}
