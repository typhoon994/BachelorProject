package degree.bachelor.ftn.diplomskirad.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import degree.bachelor.ftn.diplomskirad.R
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity(), Animation.AnimationListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        val anim = AnimationUtils.loadAnimation(this, R.anim.push_logo_anim)
        anim.setAnimationListener(this)

        Handler().postDelayed({
            logo.startAnimation(anim)
        }, 2000)
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
        overridePendingTransition(R.anim.anim_in_left, R.anim.anim_out_left)
    }

    override fun onAnimationStart(p0: Animation?) {
        val anim = AnimationUtils.loadAnimation(this, R.anim.abc_fade_in)
        anim.duration = 800
        anim.fillAfter = true
        text.startAnimation(anim)
    }
}
