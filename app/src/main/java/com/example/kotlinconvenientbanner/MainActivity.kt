package com.example.kotlinconvenientbanner
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlinconvenientbanner.ui.ViewPagerLocalActivity
import com.example.kotlinconvenientbanner.ui.ViewPagerNetActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {
        findViewById<View>(R.id.btn_local).setOnClickListener {
            val intent = Intent(this@MainActivity, ViewPagerLocalActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.btn_net).setOnClickListener {
            val intent = Intent(this@MainActivity, ViewPagerNetActivity::class.java)
            startActivity(intent)
        }
    }

}