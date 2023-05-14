package com.example.submissionaplikasiandroidsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var list : ArrayList<player> = arrayListOf()
    private var title : String = "Best Basbketball Players"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBar(title)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)

        list.addAll(playerData.listData)
        showList()
    }



    private fun showList() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = listAdapter(list)
        recyclerView.adapter = adapter

        adapter.OnClickListener(object :listAdapter.onClickListener{
            override fun onclick(data: player) {
                selectPlayer(data)
            }

        })
    }


    private fun selectPlayer(data: player) {
        Toast.makeText(this@MainActivity, "You Click ${data.name}", Toast.LENGTH_SHORT).show()
        val intent = Intent(this@MainActivity,details_activity::class.java)
        intent.putExtra(details_activity.nama_players,data.name)
        intent.putExtra(details_activity.details_players,data.details)
        intent.putExtra(details_activity.photo_players,data.photo)
        startActivity(intent)
    }


    private fun setActionBar(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        selectmenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun selectmenu(itemId: Int) {
        when(itemId){
            R.id.account_icon ->{
                val intent = Intent(this@MainActivity,AccountActivity::class.java)
                startActivity(intent)
                title = "Account"
            }
        }
    }






}