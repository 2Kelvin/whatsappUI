package com.example.whatsappui.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.whatsappui.R
import com.example.whatsappui.ui.theme.WhatsappUITheme

/** All chats screen */
@Composable
fun Chats(modifier: Modifier = Modifier) {
    /*
    Scaffold(
        topBar = { WhatsappTopAppBar() }
    ) { innerPadding ->
        //todo
    }
     */
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
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.primary,
                fontFamily = FontFamily(Font(R.font.nunito_sans_bold)),
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.camera),
                    contentDescription = null
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = null
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.MoreVert,
                    contentDescription = null
                )
            }
        },
        modifier = modifier
    )
}

/** Previews */
@Preview
@Composable
fun WhatsappTopAppBarPreview() {
    WhatsappUITheme {
        WhatsappTopAppBar()
    }
}
