package com.rankup.demo.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ClubListScreen() {
    val clubs = listOf("서울 FC", "부산 드래곤즈", "인천 유나이티드")

    Column(modifier = Modifier.padding(16.dp)) {
        Text("🔥 인기 동호회", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(12.dp))

        clubs.forEach { club ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp)
                    .clickable { /* TODO: Navigate to ClubProfile */ },
                elevation = CardDefaults.cardElevation()
            ) {
                Text(
                    text = club,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}
