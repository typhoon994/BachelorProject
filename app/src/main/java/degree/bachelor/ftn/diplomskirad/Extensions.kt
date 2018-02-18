package degree.bachelor.ftn.diplomskirad

import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import degree.bachelor.ftn.diplomskirad.layoutdecoration.GridSpacing

fun Fragment.initGridView(list: RecyclerView) {
    val manager = GridLayoutManager(context, 2)
    val spacing = this.activity!!.resources.getDimensionPixelSize(R.dimen.grid_spacing)
    list.layoutManager = manager
    list.addItemDecoration(GridSpacing(spacing))
}

fun Fragment.initListView(list: RecyclerView) {
    val manager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    list.layoutManager = manager
    val spacing = this.activity!!.resources.getDimensionPixelSize(R.dimen.list_spacing)
    list.addItemDecoration(GridSpacing(spacing))
}
