package me.kyledunne.kylesmusicreviewsapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val albums = mutableListOf<Album>()
        albums.add(Album(null, "Twilight Cinema", "Major Parkinson", "76"))
        albums.add(Album(null, "Black Holes and Revelations", "Muse", "66"))
        albums.add(Album(null, "Showbiz", "Muse", "68"))
        albums.add(Album(null, "Victims of the Modern Age", "Arjen Anthony Lucassen's Star One", "76"))
        albums.add(Album(null, "Space Metal", "Arjen Anthony Lucassen's Star One", "72"))
        albums.add(Album(null, "148", "C418", "78"))
        albums.add(Album(null, "7", "art1", "97"))
        albums.add(Album(null, "8", "art2", "98"))
        albums.add(Album(null, "9", "art3", "99"))
        albums.add(Album(null, "10", "art4", "910"))
        albums.add(Album(null, "11", "art5", "911"))
        albums.add(Album(null, "12", "art6", "912"))
        val albumListAdapter = AlbumListAdapter(albums)
        val viewManager = LinearLayoutManager(this)

        val albumListRecyclerView = findViewById<RecyclerView>(R.id.album_list_recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = albumListAdapter
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
