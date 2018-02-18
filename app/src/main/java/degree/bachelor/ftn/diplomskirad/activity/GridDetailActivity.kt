package degree.bachelor.ftn.diplomskirad.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.SharedElementCallback
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import degree.bachelor.ftn.diplomskirad.R
import degree.bachelor.ftn.diplomskirad.datamodel.HomeModel
import kotlinx.android.synthetic.main.activity_coffe_detail.*

class GridDetailActivity : AppCompatActivity() {

    companion object {
        private val MODEL_EXTRA = "MODEL_EXTRA"

        fun newInstance(context: Context, model: HomeModel) : Intent {
            val i = Intent(context, GridDetailActivity::class.java)
            i.putExtra(MODEL_EXTRA, model)
            return i
        }
    }

    private lateinit var model: HomeModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffe_detail)
        supportActionBar?.hide()

        model = intent.extras.getParcelable<HomeModel>(MODEL_EXTRA)

        setEnterSharedElementCallback(object : SharedElementCallback() {
            override fun onSharedElementEnd(names: List<String>,
                                   elements: List<View>,
                                   snapshots: List<View>) {
                super.onSharedElementEnd(names, elements, snapshots)
                    Picasso.with(elements[0].context)
                            .load(model.imageLink)
                            .resize(800, 450)
                            .into(elements[0] as ImageView)
            }
        })

        description.text = model.description
        (findViewById<TextView>(R.id.title)).text = model.title
    }




}
