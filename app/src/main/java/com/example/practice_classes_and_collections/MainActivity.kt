package com.example.practice_classes_and_collections

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.practice_classes_and_collections.ui.theme.Practice_ClassesandCollectionsTheme

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

//fun main() {
//    val event = Event(
//        title = "Study Kotlin",
//        description = "Commit to studying Kotlin at least 15 minutes per day.",
//        daypart = Daypart.EVENING,
//        durationInMinutes = 15
//    )
//    println(event)
//}

//3
//fun main() {
//    // Создаем список для хранения всех событий
//    val events = mutableListOf<Event>()
//
//    // Добавляем события в список
//    events.add(Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0))
//    events.add(Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15))
//    events.add(Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30))
//    events.add(Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60))
//    events.add(Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10))
//    events.add(Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45))
//
//    // Выводим количество событий
//    println("Total events: ${events.size}")
//
//    // Выводим все события
//    for (event in events) {
//        println(event)
//    }
//}

//4
//fun main() {
//    // Создаем список событий
//    val events = mutableListOf<Event>(
//        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
//        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
//        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
//        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
//        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
//        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
//    )
//
//    // Отфильтровываем короткие события (менее 60 минут)
//    val shortEvents = events.filter { it.durationInMinutes < 60 }
//
//    // Получаем количество коротких событий
//    println("У вас ${shortEvents.size} коротких событий")
//}


//5
//fun main() {
//    // Список событий
//    val events = mutableListOf<Event>(
//        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
//        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
//        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
//        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
//        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
//        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45),
//        Event(title = "Dinner with family", daypart = Daypart.EVENING, durationInMinutes = 90)
//    )
//
//    // Группируем события по daypart
//    val eventsByDaypart = events.groupBy { it.daypart }
//
//    // Выводим количество событий для каждой части дня
//    for ((daypart, events) in eventsByDaypart) {
//        println("${daypart.name}: ${events.size} events")
//    }
//}

//6
//fun main() {
//    val events = mutableListOf<Event>(
//        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
//        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
//        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
//        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
//        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
//        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45),
//        Event(title = "Dinner with family", daypart = Daypart.EVENING, durationInMinutes = 90)
//    )
//
//    // Используем функцию last() для получения последнего события
//    println("Last event of the day: ${events.last().title}")
//}

val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main() {
    val events = mutableListOf<Event>(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45),
        Event(title = "Dinner with family", daypart = Daypart.EVENING, durationInMinutes = 90)
    )

    // Используем свойство расширения для получения информации о длительности события
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}