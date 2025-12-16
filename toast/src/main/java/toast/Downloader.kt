package toast

import android.content.Context
import android.widget.Toast

class Downloader {
    fun showMessage(context: Context) {
        Toast.makeText(context, "Testing 1, 2, 3", Toast.LENGTH_SHORT).show()
    }
}
