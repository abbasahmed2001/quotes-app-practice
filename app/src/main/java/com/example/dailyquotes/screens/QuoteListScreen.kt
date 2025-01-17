package com.example.dailyquotes.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyquotes.models.Quote
import com.example.quotecomposeapp.screens.QuoteList


@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: ()->Unit) {
    Column {
        Text(text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(),
            style = MaterialTheme.typography.titleMedium
            )

        QuoteList(data = data){
            onClick()
        }

    }
}