package mk.padc.projectgradlebestpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mk.padc.share.activities.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}