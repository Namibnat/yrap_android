package co.uk.yrap.yrap

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