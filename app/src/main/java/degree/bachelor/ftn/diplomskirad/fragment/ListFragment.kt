package degree.bachelor.ftn.diplomskirad.fragment

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import degree.bachelor.ftn.diplomskirad.R
import degree.bachelor.ftn.diplomskirad.adapter.ICardClickListener
import degree.bachelor.ftn.diplomskirad.adapter.ListCardAdapter
import degree.bachelor.ftn.diplomskirad.datamodel.HomeModel
import degree.bachelor.ftn.diplomskirad.initListView


class ListFragment : DiplomskiFragment(), ICardClickListener {

    override fun getTabTitle() = "List"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view?.findViewById<RecyclerView>(R.id.list)?.let {
            initListView(it)
            it.adapter = ListCardAdapter(LayoutInflater.from(context), this)
        }

        return view
    }

    override fun onCardClick(view: View, model: HomeModel) {
        showLocationDialog(model)
    }

    private fun showLocationDialog(model: HomeModel) {
        val builder = AlertDialog.Builder(activity)
        builder.setTitle(model.title)
        builder.setMessage(model.description)

        val positiveText = getString(android.R.string.ok)
        builder.setPositiveButton(positiveText,
                DialogInterface.OnClickListener { dialog, which ->
                    // positive button logic
                })

        val negativeText = getString(android.R.string.cancel)
        builder.setNegativeButton(negativeText,
                DialogInterface.OnClickListener { dialog, which ->
                    // negative button logic
                })

        val dialog = builder.create()
        // display dialog
        dialog.show()
    }
}