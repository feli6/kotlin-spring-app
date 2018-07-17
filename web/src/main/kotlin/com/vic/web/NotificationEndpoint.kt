package com.vic.web

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/notifications")
class NotificationEndpoint {

    @GetMapping("/")
    fun findAll(@RequestParam challengeId: String) =
            listOf(engageNotification()
            )

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long) =
            engageNotification()

    data class PlayereNotification(val id: Long,
                                   val notificationMessages: List<NotificationMessage>)


    data class NotificationMessage(val on: String,
                                   val messageKey: String,
                                   val badge: String,
                                   val messages: List<Message>
    )

    data class Message(val lang: String,
                       val body: String)

    private fun engageNotification(): PlayereNotification {
        return PlayereNotification(id = 1,
                notificationMessages =
                listOf(NotificationMessage(on = "completed",
                        badge = "icon.png",
                        messageKey = "completion_message_key",
                        messages = listOf(Message("en", "Congratulations !!"), Message("sv", "Grattis!"))
                )
                )
        )
    }

}