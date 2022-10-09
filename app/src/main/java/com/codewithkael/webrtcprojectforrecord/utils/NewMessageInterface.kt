package com.codewithkael.webrtcprojectforrecord.utils

import com.codewithkael.webrtcprojectforrecord.models.MessageModel

interface NewMessageInterface {
    fun onNewMessage(message: MessageModel)
}