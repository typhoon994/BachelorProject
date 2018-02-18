package degree.bachelor.ftn.diplomskirad.adapter

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import degree.bachelor.ftn.diplomskirad.fragment.DiplomskiFragment
import degree.bachelor.ftn.diplomskirad.fragment.GridFragment
import degree.bachelor.ftn.diplomskirad.fragment.ListFragment


class HomePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val screens = arrayListOf<DiplomskiFragment>(GridFragment(), ListFragment())

    override fun getItem(position: Int) = screens[position]

    override fun getCount() = screens.size

    override fun getPageTitle(position: Int) = screens[position].getTabTitle()
}