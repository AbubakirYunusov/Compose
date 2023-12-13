package com.example.compose.presentation.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.compose.data.model.AkcessoiresModel

@Composable
fun AkcessoiresItem(
    akcessoiresModel: AkcessoiresModel,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clip(RoundedCornerShape(22.dp))
    ) {
        AsyncImage(
            model = akcessoiresModel.AkcessoiresImg,
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
                .background(Color.Transparent),
            contentScale = ContentScale.Crop,
            contentDescription = null,
        )
    }
}

@Composable
fun Akcessoires2Item(
    akcessoiresModel: AkcessoiresModel
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row {
            Column(
                modifier = Modifier.background(Color.Transparent)
            ) {
                AsyncImage(
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(10.dp)),
                    model = akcessoiresModel.AkcessoiresImg,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = akcessoiresModel.AkcessoiresName,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = akcessoiresModel.AckcessoiresPrice,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Composable
fun Akcessoires3Item(
    akcessoiresModel: AkcessoiresModel
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        AsyncImage(
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp)),
            model = akcessoiresModel.AkcessoiresImg,
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        Column(
            modifier = Modifier.background(Color.Transparent)
        ) {
            Text(
                modifier = Modifier.padding(start = 8.dp),
                text = akcessoiresModel.AckcessoModel,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                modifier = Modifier.padding(start = 8.dp),
                text = akcessoiresModel.AkcessoiresName,
                fontSize = 14.sp,
            )
            Text(
                modifier = Modifier.padding(start = 8.dp),
                text = akcessoiresModel.AckcessoiresPrice,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}


