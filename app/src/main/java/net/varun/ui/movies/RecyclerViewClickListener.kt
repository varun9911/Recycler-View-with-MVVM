package net.varun.ui.movies

import android.view.View
import net.varun.data.models.Movie

interface RecyclerViewClickListener {
    fun onRecyclerViewItemClick(view: View, movie: Movie)
}