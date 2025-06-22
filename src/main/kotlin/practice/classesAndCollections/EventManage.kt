package practice.classesAndCollections

enum class DayPart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val duration: Int,
)

val e = mutableListOf(
    Event(title = "Study Kotlin", description = "commit to studying at least 15 min", dayPart = DayPart.EVENING, duration = 15),
    Event(title = "Wake up", description = "Time to get up", dayPart = DayPart.MORNING, duration = 0),
    Event(title = "Eat breakfast", dayPart = DayPart.MORNING, duration = 15),
    Event(title = "Learn about Kotlin", dayPart = DayPart.AFTERNOON, duration = 30),
    Event(title = "Practice Compose", dayPart = DayPart.AFTERNOON, duration = 60),
    Event(title = "Watch latest DevBytes video", dayPart = DayPart.AFTERNOON, duration = 10),
    Event(title = "Check out latest Android Jetpack library", dayPart = DayPart.EVENING, duration = 45)
)

//val (title, description) = e[0] kind of destructuring

fun main() {

     // use of filter function
    println("shorter events are:")
    val er = e.filter { it.duration < 50 }
    println("you have ${er.size} shorter events")
    println("you have 1st ${e[0].durationOfEvent}er events")


    // use of grouped by function
    println("if user want to see data in group")
    val groupedEvents = e.groupBy { it.dayPart }
    groupedEvents.forEach { (day, event) -> println("$day: ${event.size} events") }

    // how to access the last element of the list
    val lastElement = e.last().title
    println("last event of the day is: $lastElement")
}

// extension function

val Event.durationOfEvent : String
    get() = if (this.duration < 50) { "short" } else { "long" }
