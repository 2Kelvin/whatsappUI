package com.example.whatsappui.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

/**
 * Whatsapp contact on the chats section
 * with a profile image, name and message, message peek & message count
 */
@Composable
fun ChatPerson(
    imageID: Int,
    name: String,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Image( // profile image
            painter = painterResource(imageID),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
                .padding(2.dp)
                .border(
                    BorderStroke(2.dp, Color.Green),
                    CircleShape
                ),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(6.dp)) // space between profile image & name

        Column {
            Row { // name & time row
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}