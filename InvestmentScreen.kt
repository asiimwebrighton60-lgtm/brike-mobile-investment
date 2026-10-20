package com.brike.investment.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InvestmentScreen() {
    var showDialog by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Bicycle Investment Packages", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(16.dp))

        Card(shape = RoundedCornerShape(12.dp), modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Standard Bicycle Package", style = MaterialTheme.typography.titleLarge)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Investment Amount: UGX 50,000")
                Text(text = "Daily Payout Example: UGX 5,500 / day")
                Text(text = "Duration: 5 Days")
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { showDialog = true }, modifier = Modifier.fillMaxWidth()) {
                    Text("Invest Now (Demo)")
                }
            }
        }

        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = { Text("Confirm Investment") },
                text = { Text("Simulate investing UGX 50,000?") },
                confirmButton = { TextButton(onClick = { showDialog = false }) { Text("Confirm") } },
                dismissButton = { TextButton(onClick = { showDialog = false }) { Text("Cancel") } }
            )
        }
    }
}