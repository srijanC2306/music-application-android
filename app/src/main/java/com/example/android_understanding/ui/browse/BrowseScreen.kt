package com.example.android_understanding.ui.browse

import SearchBar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview
fun BrowseScreen(){


    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){

        SearchBar()
        Spacer(modifier = Modifier.height(16.dp))



    }
}