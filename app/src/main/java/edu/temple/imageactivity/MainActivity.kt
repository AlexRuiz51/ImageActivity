package edu.temple.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClickListener();
    }
    fun onClickListener(){
        cElise.setOnClickListener{
            startActivity(Intent(this, Elise_Activity::class.java).putExtra("name", "Elise").putExtra("image",R.drawable.elise))
        }
        cEvelynn.setOnClickListener{
            startActivity(Intent(this, Evelynn_Activity::class.java).putExtra("name", "Evelynn").putExtra("image",R.drawable.evelynn))
        }
        cKayn.setOnClickListener{
            startActivity(Intent(this, Kayn_Activity::class.java).putExtra("name", "Kayn").putExtra("image",R.drawable.kayn))
        }
        cKhazix.setOnClickListener{
            startActivity(Intent(this, KhaZix_Activity::class.java).putExtra("name", "Kha'Zix").putExtra("image",R.drawable.khazix))
        }
        cNunuWill.setOnClickListener{
            startActivity(Intent(this, NunuWillump_Activity::class.java).putExtra("name", "Nunu & Willump").putExtra("image",R.drawable.nunuwill))
        }
        cRammus.setOnClickListener{
            startActivity(Intent(this, Rammus_Activity::class.java).putExtra("name", "Rammus").putExtra("image",R.drawable.rammus))
        }
        cRengar.setOnClickListener{
            startActivity(Intent(this, Rengar_Activity::class.java).putExtra("name", "Rengar").putExtra("image",R.drawable.rengar))
        }
        cShen.setOnClickListener{
            startActivity(Intent(this, Shen_Activity::class.java).putExtra("name", "Shen").putExtra("image",R.drawable.shen))
        }
        cSwain.setOnClickListener{
            startActivity(Intent(this, Swain_Activity::class.java).putExtra("name", "Swain").putExtra("image",R.drawable.swain))
        }
        cWarwick.setOnClickListener{
            startActivity(Intent(this, Warwick_Activity::class.java).putExtra("name", "Warwick").putExtra("image",R.drawable.warwick))
        }
    }
}