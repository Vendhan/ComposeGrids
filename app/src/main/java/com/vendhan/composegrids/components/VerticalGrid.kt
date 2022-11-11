package com.vendhan.composegrids.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun VerticalGrid() {
    // val images = listOf(Icons.Filled.Home)
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 90.dp),
        // columns = GridCells.Fixed(count = 3),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(
            horizontal = 8.dp,
            vertical = 16.dp
        ),

    ) {
        items(count = 100) {
            Box(
                modifier = Modifier
                    .clickable { }
                    .size(80.dp)
                    .border(width = 2.dp, color = Color.Gray)
                    .background(color = Color.LightGray)
            ) {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "Home",
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }
        }
    }
}
