package degree.bachelor.ftn.diplomskirad.fragment

import android.support.v4.app.Fragment

abstract class DiplomskiFragment : Fragment() {
    abstract fun getTabTitle() : String
}