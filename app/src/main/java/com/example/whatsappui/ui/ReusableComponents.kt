package com.example.whatsappui.ui

import android.graphics.ColorMatrix
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappui.R

/**
 * Whatsapp contact on the chats section
 * with a profile image, name and message, message peek & message count
 */
@Composable
fun ChatPerson(
    imageID: Int,
    name: String,
    time: String,
    message: String,
    messageCount: Int,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Image( // profile image
            painter = painterResource(imageID),
            contentDescription = null,
            modifier = Modifier
                .size(74.dp)
                .border(
                    BorderStroke(2.dp, Color.Green),
                    CircleShape
                )
                .padding(5.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(16.dp)) // space between profile image & name

        Column(modifier = Modifier.weight(1f),) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) { // name & time row
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = time,
                    fontWeight = FontWeight.Bold,
                    color = Color.Green
                )
            }

            Spacer(modifier = Modifier.height(6.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) { // message peek & message count
                Text(
                    text = message,
                    color = Color.Gray
                )
                Card(
                    modifier = Modifier
                        .size(24.dp),
                    colors = CardDefaults.cardColors(Color.Green),
                    shape = CircleShape
                ) {
                    Column(modifier = Modifier.padding(4.dp)) {
                        Text(
                            text = messageCount.toString(),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            }
        }
    }
}

/* Previews */
@Preview(showBackground = true)
@Composable
fun ChatPersonPreview() {
    ChatPerson(
        imageID = R.drawable.pic0,
        name = "Bellamy",
        time = "8.19 AM",
        message = "Hey there. Are we still on for today.",
        messageCount = 1
    )
}