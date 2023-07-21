package com.ngurah.ggmu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY_VALUE = "value"
    }
    private lateinit var rvLegend: RecyclerView
    private val list:ArrayList<Legend> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setTitle("MANCHESTER UNITED LEGENDS")

        rvLegend = findViewById(R.id.rv_legend)
        rvLegend.setHasFixedSize(true)

        list.addAll(detail_legend.listData)
        showRecyclerList()

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.action_about -> {
                rvLegend.layoutManager = LinearLayoutManager(this)
                setMode(item.itemId)
            }

        }
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val iAbout = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(iAbout)
            }
        }
    }



    private fun showRecyclerList() {
        rvLegend.layoutManager = LinearLayoutManager(this)
        val listlegendAdapter = ListLegendAdapter(list)
        rvLegend.adapter = listlegendAdapter

        listlegendAdapter.setOnItemClickCallback(object : ListLegendAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Legend) {
                showSelectedLegend(data)
            }
        })
    }

    private fun showSelectedLegend(post: Legend) {
        startActivity(Intent(this, DetailActivity::class.java).putExtra(KEY_VALUE, post))
    }


}