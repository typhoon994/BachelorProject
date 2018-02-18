package degree.bachelor.ftn.diplomskirad.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import degree.bachelor.ftn.diplomskirad.R
import degree.bachelor.ftn.diplomskirad.datamodel.HomeModel
import kotlinx.android.synthetic.main.item_home.view.*

class ListCardAdapter(private val inflater: LayoutInflater, private val listener: ICardClickListener?) : RecyclerView.Adapter<ListCardAdapter.CardViewHolder>() {

    private val models = HomeModel.getInstances()

    class CardViewHolder(itemView: View, private val listener: ICardClickListener?) : RecyclerView.ViewHolder(itemView) {
        fun render(model: HomeModel) {
            Picasso.with(itemView.context)
                    .load(model.imageLink)
                    .resize(800, 450)
                    .into(itemView.card_image)
            itemView.title.visibility = View.GONE
            itemView.setOnClickListener { listener?.onCardClick(it.card_image, model) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CardViewHolder {
        val view = inflater.inflate(R.layout.item_home, parent, false)
        return CardViewHolder(view, listener)
    }

    override fun getItemCount() = models.size

    override fun onBindViewHolder(holder: CardViewHolder?, position: Int) {
        holder?.render(models[position])
    }
}