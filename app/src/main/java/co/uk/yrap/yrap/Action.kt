package co.uk.yrap.yrap

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