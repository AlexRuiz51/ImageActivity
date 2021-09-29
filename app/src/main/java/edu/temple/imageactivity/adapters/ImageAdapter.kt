package edu.temple.imageactivity.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import edu.temple.imageactivity.R
import edu.temple.imageactivity.model.AlphaChar

class ImageAdapter(var context: Context, var arrayList: ArrayList<AlphaChar>) : RecyclerView.Adapter<ImageAdapter.ItemHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.grid_layout_list_item, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val alphaChar:AlphaChar = arrayList[position]
        holder.icons.setImageResource(alphaChar.iconsChar!!)
        holder.alphas.text = alphaChar.alphaChar

        holder.alphas.setOnClickListener{
            Toast.makeText(context, alphaChar.alphaChar, Toast.LENGTH_LONG).show()
        }
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var icons: ImageView = itemView.findViewById(R.id.icons_image)
        var alphas: TextView = itemView.findViewById(R.id.alpha_text_view)
    }
}