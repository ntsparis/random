package co.uk.random.view.video

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import co.uk.random.R
import javax.inject.Inject

class VideoFragment : AppCompatActivity() {
    @Inject
    lateinit var videoViewModel: VideoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_video)
    }
}