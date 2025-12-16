package toast

import android.content.Context
import android.widget.Toast

class Downloader {
    fun showMessage(context: Context) {
        Toast.makeText(context, "Downloading...", Toast.LENGTH_SHORT).show()
    }
}
