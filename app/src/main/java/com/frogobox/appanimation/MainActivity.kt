package com.frogobox.appanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.animation.core.Bounce
import com.frogobox.animation.FrogoAnimation
import com.frogobox.animation.core.Attention
import com.frogobox.animation.core.Rotate
import kotlin.render.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        FrogoAnimation().apply {
            setAnimation(Attention.Ruberband(binding.TextView))
            setRepeated()
            setDuration(1500)
        }.start()

    }

}