package android.render.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import render.animations.*
import kotlin.render.demo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.TextView)

        val render = Render(this)
        render.setAnimation(Bounce().In(textView))
        render.setDuration(50000)
        render.start()
    }
}
