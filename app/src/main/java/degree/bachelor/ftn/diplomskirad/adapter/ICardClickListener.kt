package degree.bachelor.ftn.diplomskirad.adapter

import android.view.View
import degree.bachelor.ftn.diplomskirad.datamodel.HomeModel

interface ICardClickListener {
    fun onCardClick(view: View, model: HomeModel)
}