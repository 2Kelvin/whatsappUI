package com.example.whatsappui.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappui.R
import com.example.whatsappui.ui.SingleChat
import com.example.whatsappui.ui.TopButton
import com.example.whatsappui.ui.theme.WhatsappUITheme

/** All chats screen */
@Composable
fun ChatsScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { WhatsappTopAppBar() },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "Add"
                )
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(10) {
                SingleChat(
                    imageID = R.drawable.pic0,
                    name = "Bellamy Okogie",
                    time = "8.19 AM",
                    message = "Hey. Are we still on for today?",
                    messageCount = 1,
                )
            }
        }
    }
}

/** WhatsApp topAppBar */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WhatsappTopAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(
                text = "WhatsApp",
                fontSize = 22.sp,
                color = MaterialTheme.colorScheme.primary,
                fontFamily = FontFamily(Font(R.font.nunito_sans_bold)),
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.camera),
                    contentDescription = "camera"
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "search"
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.MoreVert,
                    contentDescription = "options"
                )
            }
        },
        modifier = modifier
    )
}

/** Group buttons */
@Composable
fun GroupButtons(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp, start = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TopButton(btnText = "All", isActive = true)
        Spacer(modifier = Modifier.width(12.dp))
        TopButton(btnText = "Unread", isActive = false)
        Spacer(modifier = Modifier.width(12.dp))
        TopButton(btnText = "Groups", isActive = false)
    }
}

/** LazyVerticalList of chats */

/** Previews */
@Preview
@Composable
fun WhatsappTopAppBarPreview() {
    WhatsappUITheme {
        WhatsappTopAppBar()
    }
}

@Preview(showBackground = true)
@Composable
fun GroupButtonsPreview() {
    WhatsappUITheme {
        GroupButtons()
    }
}

@Preview(showBackground = true)
@Composable
fun ChatsScreenPreview() {
    WhatsappUITheme {
        ChatsScreen()
    }
}
