package degree.bachelor.ftn.diplomskirad.layoutdecoration

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View


class GridSpacing(private val space: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View,
                                parent: RecyclerView, state: RecyclerView.State) {
        outRect.left = space
        outRect.right = space
        outRect.bottom = space
        outRect.top = space
    }
}