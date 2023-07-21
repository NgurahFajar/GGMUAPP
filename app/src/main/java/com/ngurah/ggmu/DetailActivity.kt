package com.ngurah.ggmu

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import android.graphics.Color
import android.view.View

class DetailActivity : AppCompatActivity(){

    companion object{
        const val KEY_VALUE = "value"
    }

    private lateinit var posPhoto: ImageView
    private lateinit var posName: TextView
    private lateinit var posTitle: TextView
    private lateinit var posDeskripsi: TextView
    private lateinit var posPrestasinya: TextView
    private lateinit var posPrestasi: TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setTitle("OUR LEGEND")

        val btnShare= findViewById<Button>(R.id.btn_share)
        val post = intent.getSerializableExtra(MainActivity.KEY_VALUE)as Legend


        posPhoto = findViewById(R.id.img_item_photo)
        posName = findViewById(R.id.tv_set_name)
        posTitle = findViewById(R.id.title)
        posDeskripsi = findViewById(R.id.description)
        posPrestasi = findViewById(R.id.prestasi)
        posPrestasinya = findViewById(R.id.prestasinya)


            posPrestasi.text = post.prestasi
            posTitle.text = post.title
            posName.text = post.name
            posDeskripsi.text = post.description
            posPrestasinya.text = post.prestasinya

            val bmPost = BitmapFactory.decodeResource(resources, post.photo)

            posPhoto.setImageBitmap(bmPost)



        btnShare.setOnClickListener(View.OnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Ini Artikel yang ingin saya bagikan.")
            startActivity(Intent.createChooser(shareIntent, "Bagikan dengan"))
        })




    }
    fun TextView.setTextColor(color: Long) = this.setTextColor(color.toInt())
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}



