package com.devspace.recyclerview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvlist = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()

        rvlist.adapter = adapter
        rvlist.layoutManager = LinearLayoutManager (this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvlist.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
           rvlist.layoutManager = LinearLayoutManager (this)
        }

        adapter.setOnClickLister { contact ->
            val intent = Intent(this, ContactDetailActivity::class.java)
            intent.putExtra("name", contact.name)
            intent.putExtra("phone", contact.phone)
            intent.putExtra("icon", contact.icon)
            startActivity(intent)

        }

    }
}


private val contacts = listOf(
    Contact(
        name= "Shirley",
        phone= "(55) 11 945364589",
        icon= R.drawable.sample1
    ),
    Contact(
       name= "Aurea",
       phone= "(55) 21 944564589",
       icon=  R.drawable.sample3
        ),
    Contact(
       name=  "Sergio",
       phone=  "(55) 85 945368639",
       icon=  R.drawable.sample2
    ),
    Contact(
       name= "Monique",
       phone=  "(55) 81 945401589",
       icon= R.drawable.sample11
    ),
    Contact(
        name= "Sofia",
        phone = "(55) 31 962364589",
        icon= R.drawable.sample4
    ),
    Contact(
        name= "Rosario",
        phone= "(55) 87 945369379",
        icon= R.drawable.sample16
    ),
    Contact(
        name= "Fernando",
        phone= "(55) 75 927134589",
        icon= R.drawable.sample10
    ),
    Contact(
        name= "Arnoldo",
        phone= "(55) 71 992236819",
        icon= R.drawable.sample12
    ),
    Contact(
        name= "Fabricio",
        phone= "(55) 22 927164589",
        icon= R.drawable.sample8
    ),
    Contact(
        name= "Cristian",
        phone= "(55) 51 983164589",
        icon= R.drawable.sample9
    ),
    Contact(
        name= "Radassa",
        phone= "(55) 83 934364553",
        icon= R.drawable.sample7
    ),
)