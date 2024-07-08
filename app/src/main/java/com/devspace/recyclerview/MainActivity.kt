package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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


        // Set Adapter
        // Linear Layout manager
        //Submeter Lista

        val rvlist = findViewById<RecyclerView>(R.id.rv_list)
        val adapter = ContactListAdapter()

        rvlist.adapter = adapter
        rvlist.layoutManager = LinearLayoutManager (this)

        adapter.submitList(contacts)
    }
}

private val contacts = listOf(
    Contact(
        name= "Shirley",
        phone= "(55) 11 945364589",
        icon= R.drawable.contato1
    ),
    Contact(
       name= "Aurea",
       phone= "(55) 21 944564589",
       icon=  R.drawable.contato2
        ),
    Contact(
       name=  "Sergio",
       phone=  "(55) 85 945368639",
       icon=  R.drawable.contato3
    ),
    Contact(
       name= "Monique",
       phone=  "(55) 81 945401589",
       icon= R.drawable.contato4
    ),
    Contact(
        name= "Sofia",
        phone = "(55) 31 962364589",
        icon= R.drawable.contato5
    ),
    Contact(
        name= "Rosario",
        phone= "(55) 87 945369379",
        icon= R.drawable.contato6
    ),
    Contact(
        name= "Fernando",
        phone= "(55) 75 927134589",
        icon= R.drawable.contato7
    ),
    Contact(
        name= "Arnoldo",
        phone= "(55) 71 992236819",
        icon= R.drawable.contato8
    ),
    Contact(
        name= "Fabricio",
        phone= "(55) 22 927164589",
        icon= R.drawable.contato9
    ),
    Contact(
        name= "Cristian",
        phone= "(55) 51 983164589",
        icon= R.drawable.contato10
    ),
    Contact(
        name= "Radassa",
        phone= "(55) 83 934364553",
        icon= R.drawable.contato11
    ),
)