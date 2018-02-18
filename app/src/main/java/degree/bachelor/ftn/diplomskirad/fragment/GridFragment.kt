package degree.bachelor.ftn.diplomskirad.fragment

import android.app.Activity
import android.app.ActivityOptions
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import degree.bachelor.ftn.diplomskirad.R
import degree.bachelor.ftn.diplomskirad.activity.GridDetailActivity
import degree.bachelor.ftn.diplomskirad.adapter.GridCardAdapter
import degree.bachelor.ftn.diplomskirad.adapter.ICardClickListener
import degree.bachelor.ftn.diplomskirad.datamodel.HomeModel
import degree.bachelor.ftn.diplomskirad.initGridView

class GridFragment : DiplomskiFragment(), ICardClickListener {

    override fun getTabTitle() = "Grid"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view?.findViewById<RecyclerView>(R.id.list)?.let {
            initGridView(it)
            it.adapter = GridCardAdapter(LayoutInflater.from(context), this)
        }

        return view
    }

    override fun onCardClick(view: View, model: HomeModel) {
        val bundle = ActivityOptions.makeSceneTransitionAnimation(activity as Activity,
                android.util.Pair(view, "coffeeImage")).toBundle()
        val intent = GridDetailActivity.newInstance(context, model)

        startActivity(intent, bundle)
    }
}