package com.example.whatsappui.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappui.R
import com.example.whatsappui.ui.theme.WhatsappUITheme

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
                .size(60.dp)
                .border(
                    BorderStroke(2.dp, MaterialTheme.colorScheme.primary),
                    CircleShape
                )
                .padding(4.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(4.dp)) // space between profile image & name

        Column(modifier = Modifier.weight(1f)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp)
            ) { // name & time row
                Text( // name
                    text = name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp

                )

                Text( //time
                    text = time,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 12.sp
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp)
            ) { // message peek & message count
                Text( // message peek
                    text = message,
                    color = Color.Gray
                )

                Box( // messageCount
                    modifier = Modifier
                        .clip(CircleShape)
                        .wrapContentSize()
                        .background(MaterialTheme.colorScheme.primary)
                        .size(22.dp),
                    contentAlignment = Alignment.Center, // align to the center of the box; vertically & horizontally
                ) {
                    Text(
                        text = messageCount.toString(),
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontWeight = FontWeight.W900,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}

/**
 * "All", "Unread" and "Groups" buttons.
 */
@Composable
fun TopButton(btnText: String, modifier: Modifier = Modifier) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary),
        onClick = { /*TODO*/ }
    ) {
        Text(
            text = btnText,
            color = MaterialTheme.colorScheme.onSecondary,
            fontWeight = FontWeight.W900
        )
    }
}

/**
 * Whatsapp top app bar
 */


/* Previews */
@Preview(showBackground = true)
@Composable
fun ChatPersonPreview() {
    WhatsappUITheme {
        ChatPerson(
            imageID = R.drawable.pic0,
            name = "Bellamy Okogie",
            time = "8.19 AM",
            message = "Hey. Are we still on for today?",
            messageCount = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopButtonPreview() {
    WhatsappUITheme {
        TopButton(btnText = "Unread")
    }
}