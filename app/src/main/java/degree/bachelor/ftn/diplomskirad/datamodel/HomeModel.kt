package degree.bachelor.ftn.diplomskirad.datamodel

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
class HomeModel constructor(val title: String,
                            val description: String,
                            val imageLink: String) : Parcelable {
    companion object {
        fun getInstances() = arrayListOf(
                HomeModel("Lorem ipsum",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum",
                        "https://burst.shopifycdn.com/photos/coffee-beans-spilled_925x@2x.jpg"),
                HomeModel("Lorem ipsum",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                        "https://images.unsplash.com/photo-1444418776041-9c7e33cc5a9c?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=f7829970c468f42bacfd430a4ad7f388&auto=format&fit=crop&w=1500&q=80.jpg"),
                HomeModel("Lorem ipsum",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                        "https://images.unsplash.com/photo-1422207049116-cfaf69531072?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=85a9d93b9441617bb2fce231a81de8c0&auto=format&fit=crop&w=2520&q=80.jpg"),
                HomeModel("Lorem ipsum",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                        "https://images.unsplash.com/photo-1490890870453-549b7f8d3bb5?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=7c0721ecb0f022efcbde30bc12f65e3c&auto=format&fit=crop&w=1166&q=80.jpg"),
                HomeModel("Lorem ipsum",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                        "https://images.unsplash.com/uploads/141132428651583f8c0fd/5cde60f6?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=743544b54dcf7700b89ca8792020bb43&auto=format&fit=crop&w=1500&q=80.jpg"),
                HomeModel("Lorem ipsum",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                        "https://images.unsplash.com/photo-1515388293731-e768737d41e7?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=ce9a0664dd88f0b6563b1bfa9f98bbbe&auto=format&fit=crop&w=1500&q=80.jpg")
        )
    }
}