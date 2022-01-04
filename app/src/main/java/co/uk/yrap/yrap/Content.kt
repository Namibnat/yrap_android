package co.uk.yrap.yrap


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