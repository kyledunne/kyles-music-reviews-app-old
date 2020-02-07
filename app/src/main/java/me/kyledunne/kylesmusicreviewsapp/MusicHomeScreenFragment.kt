package me.kyledunne.kylesmusicreviewsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_music_home_screen.view.*

class MusicHomeScreenFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_music_home_screen, container, false)
        view.fab.setOnClickListener { fab ->
            Snackbar.make(fab, "Replace with your own action", Snackbar.LENGTH_LONG)
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
        val viewManager = LinearLayoutManager(view.context)

        val albumListRecyclerView = view.findViewById<RecyclerView>(R.id.album_list_recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = albumListAdapter
        }
        return view
    }
}
