package co.uk.yrap.yrap

import android.accounts.AuthenticatorDescription
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var newProject = ""  // the first thing I want to be able to do is add projects
        // Projects will need to be some kind of array, as below
        var projects = arrayOf(Project("Get stuff done", "stuff complete"))
        // It will require an api call to store and retrieve from a server.

    }

    fun onGoSomewhere(view: android.view.View) {
        when ((view as Button).id){
            // Make this test for button id, not the text of the button. These will call functions in the end, but for now, just showing text.
            R.id.yrapSelectProjects -> {
                val intent = Intent(this, ProjectHomeActivity::class.java)
                startActivity(intent)
                finish()
            }
            R.id.yrapSelectRoutines -> Toast.makeText(baseContext, "You clicked on Routine", Toast.LENGTH_SHORT).show()
            R.id.yrapSelectWeeklyReview -> Toast.makeText(baseContext, "You clicked on Weekly Review", Toast.LENGTH_SHORT).show()
            R.id.yrapSelectWeeksWork -> Toast.makeText(baseContext, "You want to work on this week's work", Toast.LENGTH_SHORT).show()
        }
    }
}

/**
 * The main Projects class
 *
 * This class is the top level class for the GTD aspect of this project
 *
 * @author Vernon Swanepoel
 * @param projectName The name given to a project
 * @param doneWhen The statement that will clearly reflect project completion
 */
class Project (projectName: String, doneWhen: String){
    init {
        println("New project created: $projectName")
    }
}

/**
 * Contexts class
 *
 * This class is any context in which a specfic action could be worked on
 *
 * @author Vernon Swanepoel
 * @param contextDes The name of a specific context
 */
class Context (contextDes: String){
    init {
        println("New Context in which actions can take place: $contextDes")
    }
}


/**
 * The Actions class
 *
 * This class is actions that fall under projects in the GTD.
 *
 * @author Vernon Swanepoel
 * @param actionDescription The name given to a action
 */
class Action (project: Project, actionDescription: String){
    init {
        println("New action created: $actionDescription")
    }
}


/**
 * The main Routine class
 *
 * This class manages a specific routine
 *
 * @author Vernon Swanepoel
 * @param routineName The name given to a specific routine
 */
class Routine (routineName: String){
    init {
        println("New routine created: $routineName")
    }
}