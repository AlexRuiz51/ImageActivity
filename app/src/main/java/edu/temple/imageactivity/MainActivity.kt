package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.temple.imageactivity.adapters.ImageAdapter
import edu.temple.imageactivity.model.AlphaChar

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView ? = null
    private var gridLayoutManager:GridLayoutManager ? = null
    private var arrayList:ArrayList<AlphaChar> ? = null
    private var imageAdapter:ImageAdapter ? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        imageAdapter = ImageAdapter(applicationContext, arrayList!!)
        recyclerView?.adapter = imageAdapter

    }

    private fun setDataInList() : ArrayList<AlphaChar>{
        var items: ArrayList<AlphaChar> = ArrayList()

        items.add(AlphaChar(R.drawable.elise, "Elise"))
        items.add(AlphaChar(R.drawable.evelynn, "Evelynn"))
        items.add(AlphaChar(R.drawable.kayn, "Kayn"))
        items.add(AlphaChar(R.drawable.khazix, "Kha'Zix"))
        items.add(AlphaChar(R.drawable.nunuwill, "Nunu & Willump"))
        items.add(AlphaChar(R.drawable.rammus, "Rammus"))
        items.add(AlphaChar(R.drawable.rengar, "Rengar"))
        items.add(AlphaChar(R.drawable.shen, "Shen"))
        items.add(AlphaChar(R.drawable.swain, "Swain"))
        items.add(AlphaChar(R.drawable.warwick, "Warwick"))



        return items
    }

}