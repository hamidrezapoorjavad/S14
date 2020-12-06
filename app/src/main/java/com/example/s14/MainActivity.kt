package com.example.s14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.navigation.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        setupToolbar()


    }

    private fun setupToolbar() {
        actionBar?.setHomeButtonEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        val drawerToggel= ActionBarDrawerToggle(this, drawerLayout,toolbar,0,0)
        drawerToggel.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(drawerToggel)
        drawerToggel.syncState()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.overflow_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val massage = when(item.itemId){
            R.id.menu_like -> "like  clicked"
            R.id.menu_save -> "save  clicked"
            R.id.menu_search -> "search clicked"
            else -> "!!!!!!!!!!!!"

    }

        Toast.makeText(this,massage, Toast.LENGTH_LONG).show()
        return true}
}