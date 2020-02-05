package me.kyledunne.kylesmusicreviewsapp

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.album_list_element.view.*

class AlbumListAdapter(val albums: MutableList<Album>): RecyclerView.Adapter<AlbumListAdapter.AlbumItemViewHolder>() {

    class AlbumItemViewHolder(val albumItemView: View): RecyclerView.ViewHolder(albumItemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumItemViewHolder {
        val albumListElement = LayoutInflater.from(parent.context).inflate(R.layout.album_list_element, parent, false)
        return AlbumItemViewHolder(albumListElement)
    }

    override fun getItemCount(): Int {
        return albums.size
    }

    override fun onBindViewHolder(holder: AlbumItemViewHolder, position: Int) {
        val albumToBind = albums[position]
        holder.albumItemView.album_name.text = albumToBind.albumName
        holder.albumItemView.artist_name.text = albumToBind.artistName
        holder.albumItemView.rating.text = albumToBind.rating
    }

    fun notifyAlbumListChanged() {
        notifyDataSetChanged()
    }
}

class Album(var albumArtwork: Drawable?, var albumName: String, var artistName: String,
            var rating: String)
