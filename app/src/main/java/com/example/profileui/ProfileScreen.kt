package com.example.profileui

import android.R.attr.bottom
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileui.ui.theme.AccentGreen
import com.example.profileui.ui.theme.BackgroundDark
import com.example.profileui.ui.theme.CardBackground
import com.example.profileui.ui.theme.TextPrimary
import com.example.profileui.ui.theme.TextSecondary

private val DividerColor = Color(0xFF2A2A2A)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = BackgroundDark
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            // Top App Bar
            ProfileTopBar()

            // Profile Section
            ProfileSection()

            // Vehicle Card
            VehicleCard()

            Spacer(modifier = Modifier.height(8.dp))

            // Credit Score
            InfoRow(
                iconResId = R.drawable.img_1,
                title = "credit score",
                hasRefresh = true,
                value = "757",
                hasArrow = true
            )

            HorizontalDivider(
                color = DividerColor,
                thickness = 1.dp,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            // Lifetime Cashback
            InfoRow(
                iconResId = R.drawable.img_2,
                title = "lifetime cashback",
                value = "₹3",
                hasArrow = true
            )

            HorizontalDivider(
                color = DividerColor,
                thickness = 1.dp,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            // Bank Balance
            InfoRow(
                iconResId = R.drawable.img_3,
                title = "bank balance",
                value = "check",
                hasArrow = true
            )

            // Section Title
            SectionTitle(title = "YOUR REWARDS & BENEFITS")

            // Cashback Balance
            RewardRow(title = "cashback balance", value = "₹0")

            HorizontalDivider(
                color = DividerColor,
                thickness = 1.dp,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            // Coins
            RewardRow(title = "coins", value = "26,46,583")

            HorizontalDivider(
                color = DividerColor,
                thickness = 1.dp,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            // Refer and Earn
            ReferRow()

            // Section Title
            SectionTitle(title = "TRANSACTIONS & SUPPORT")

            // All Transactions
            TextWithArrow(text = "all transactions")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileTopBar() {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = BackgroundDark,
            titleContentColor = TextPrimary,
            navigationIconContentColor = TextPrimary,
            actionIconContentColor = TextSecondary
        ),
        title = { Text("Profile", fontWeight = FontWeight.Bold) },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        },
        actions = {
            FilledTonalButton(
                onClick = { },
                colors = ButtonDefaults.filledTonalButtonColors(
                    containerColor = Color(0xFF242424),
                    contentColor = TextSecondary
                ),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text("support")
            }
        }
    )
}

@Composable
fun ProfileSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 24.dp)
    ) {
        Box(contentAlignment = Alignment.BottomEnd) {
            // Profile Image
            Image(
                painter = painterResource(id = R.drawable.img_4),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )

            // Edit Button
            FloatingActionButton(
                onClick = { },
                containerColor = CardBackground,
                contentColor = TextPrimary,
                shape = CircleShape,
                elevation = FloatingActionButtonDefaults.elevation(0.dp),
                modifier = Modifier.size(32.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Edit Profile",
                    modifier = Modifier.size(16.dp)
                )
            }
        }

        Text(
            text = "Vaibhav Gupta",
            color = TextPrimary,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "member since Dec, 2020",
            color = TextSecondary,
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Composable
fun VehicleCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = CardBackground
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                modifier = Modifier.size(40.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF2A2A2A)
                ),
                shape = CircleShape
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = null,
                        tint = TextPrimary,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }

            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(
                    text = "get to know your vehicles, inside out",
                    modifier = Modifier.padding(bottom = 4.dp),
                    color = TextPrimary,
                    fontSize = 14.sp

                )

                Text(
                    text = "CRED garage",
                    color = TextSecondary,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Forward",
                tint = TextSecondary
            )
        }
    }
}

@Composable
fun InfoRow(iconResId: Int, title: String, value: String, hasArrow: Boolean, hasRefresh: Boolean = false) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconResId),
            contentDescription = null,
            tint = TextSecondary,
            modifier = Modifier.size(24.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(
                text = title,
                color = TextSecondary,
                fontSize = 16.sp
            )

            if (hasRefresh) {
                Text(
                    text = " • ",
                    color = AccentGreen,
                    fontSize = 16.sp
                )

                Text(
                    text = "REFRESH AVAILABLE",
                    color = AccentGreen,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = value,
            color = TextPrimary,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        )

        if (hasArrow) {
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Forward",
                tint = TextSecondary,
                modifier = Modifier.padding(start = 16.dp)
            )
        }
    }
}

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        color = TextSecondary,
        fontSize = 12.sp,
        letterSpacing = 1.sp,
        modifier = Modifier.padding(start = 16.dp, top = 24.dp, bottom = 16.dp)
    )
}

@Composable
fun RewardRow(title: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            color = TextPrimary,
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = value,
            color = TextPrimary,
            fontSize = 16.sp
        )

        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = "Forward",
            tint = TextSecondary,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

@Composable
fun ReferRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "win upto Rs 1000",
                color = TextPrimary,
                fontSize = 16.sp
            )

            Text(
                text = "refer and earn",
                color = TextSecondary,
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = "Forward",
            tint = TextSecondary
        )
    }
}

@Composable
fun TextWithArrow(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            color = TextPrimary,
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = "Forward",
            tint = TextSecondary
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF121212)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}