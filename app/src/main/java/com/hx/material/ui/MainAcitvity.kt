package com.hx.material.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hx.material.ui.folding.FoldContentActivity
import com.hx.material.ui.folding.FoldDrawerMenu2Activity
import com.hx.material.ui.folding.FoldDrawerMenuActivity
import kotlinx.android.synthetic.main.acitvity_main.*
import ui.material.hx.com.hxmaterial.R

class MainAcitvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitvity_main)
        fold_cotnent.setOnClickListener {
            startActivity(Intent(this, FoldContentActivity::class.java))
        }

        fold_menu.setOnClickListener {
            startActivity(Intent(this, FoldDrawerMenuActivity::class.java))
        }

        fold_menu2.setOnClickListener {
            startActivity(Intent(this, FoldDrawerMenu2Activity::class.java))
        }
    }
}