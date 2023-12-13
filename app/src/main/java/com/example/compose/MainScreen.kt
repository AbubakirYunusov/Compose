package com.example.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.data.fake_data.Akcessoires2FakeDates
import com.example.compose.data.fake_data.Akcessoires3FakeDates
import com.example.compose.data.fake_data.AkcessoiresFakeDates
import com.example.compose.presentation.item.Akcessoires2Item
import com.example.compose.presentation.item.Akcessoires3Item
import com.example.compose.presentation.item.AkcessoiresItem

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
) {
    Scaffold(
        modifier = Modifier.padding(horizontal = 12.dp),
        topBar = {
            TopAppBar(colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.background
            ), title = {
                Column {
                    Text(
                        text = stringResource(R.string.text_hello),
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier.padding(top = 12.dp)
                    )
                    Text(
                        text = stringResource(R.string.text_hari),
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier.padding(top = 4.dp),
                        fontWeight = FontWeight.Bold
                    )
                }
            }, actions = {
                Card(
                    modifier = Modifier
                        .padding(top = 10.dp, start = 15.dp)
                        .clip(CircleShape),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.ShoppingCart,
                            contentDescription = null,
                        )
                    }
                }
            })
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding)
            ) {
                LazyRow(
                    modifier = Modifier
                ) {
                    items(AkcessoiresFakeDates()) { item ->
                        AkcessoiresItem(akcessoiresModel = item)
                    }
                }
                Text(
                    text = stringResource(id = R.string.featured),
                    fontSize = 22.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 14.dp),
                )
                LazyRow(
                    modifier = Modifier
                ) {
                    items(Akcessoires2FakeDates()) { item ->
                        Akcessoires2Item(akcessoiresModel = item)
                    }
                }
                Text(
                    text = stringResource(id = R.string.all),
                    fontSize = 22.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 14.dp),
                )
                LazyColumn(
                    modifier = Modifier
                ) {
                    items(Akcessoires3FakeDates()) { item ->
                        Akcessoires3Item(akcessoiresModel = item)
                    }
                }
            }
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    modifier = Modifier.fillMaxWidth(),
                    selected = false,
                    onClick = {},
                    alwaysShowLabel = true,
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = null,
                        )
                    },
                )
                NavigationBarItem(
                    modifier = Modifier.fillMaxWidth(),
                    selected = false,
                    onClick = {},
                    alwaysShowLabel = true,
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                        )
                    },
                )
                NavigationBarItem(
                    modifier = Modifier.fillMaxWidth(),
                    selected = false,
                    onClick = {},
                    alwaysShowLabel = true,
                    icon = {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = null,
                        )
                    },
                )
                NavigationBarItem(
                    modifier = Modifier.fillMaxWidth(),
                    selected = false,
                    onClick = {},
                    alwaysShowLabel = true,
                    icon = {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = null,
                        )
                    },
                )
            }
        },
    )
}