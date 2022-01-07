package co.uk.yrap.yrap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProjectHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_home)
    }
    fun addNewProject(view: android.view.View) {
        val newProjectName = "Test Project"

    }
}