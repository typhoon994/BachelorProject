package degree.bachelor.ftn.diplomskirad.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.LinkMovementMethod
import android.view.MenuItem
import degree.bachelor.ftn.diplomskirad.R
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        android_developers.movementMethod = LinkMovementMethod.getInstance()
        material_design.movementMethod = LinkMovementMethod.getInstance()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val ret = super.onOptionsItemSelected(item)
        finish()
        return ret
    }

    override fun onDestroy() {
        super.onDestroy()
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
    }
}
