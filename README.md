# 📱 ProfileUI

A clean and modern static profile screen UI built using **Jetpack Compose** in Android. This project demonstrates how to create a simple, elegant, and responsive profile layout with Material Design principles. ProfileUI showcases component composition and responsive design patterns in Compose — perfect for learning UI design or integrating into social and user-centric apps.

---

## ✨ Features

- 🚀 Built entirely with Jetpack Compose
- 🎨 Minimal and modern Material Design implementation
- 📱 Responsive and adaptive layout for different screen sizes


- ♻️ Reusable and composable UI components
- 🧩 Clean architecture with separation of UI and logic

---

## 📸 Preview

<img width="339" alt="ProfileUI Screenshot" src="https://github.com/user-attachments/assets/6eb21e01-bd03-4a39-931d-95b6aac90d61" />

<!-- This section is for future screenshots -->

---

## 🛠️ Built With

- **Kotlin** - Primary programming language
- **Jetpack Compose** - Modern toolkit for building native UI
- **Material Design Components** - For consistent design language
- **Android Studio** - Development environment

---

## 📋 Requirements

- Android Studio Arctic Fox (2021.3.1) or newer
- Minimum SDK: API 21 (Android 5.0)
- Target SDK: API 34 (Android 14)
- Kotlin 1.8.0+

---

## 📁 Project Structure

```
app/
├── src/main/
│   ├── java/com/vaibhavgupta/profileui/
│   │   ├── components/       # Reusable UI components
│   │   ├── theme/            # Theme colors, typography and shapes
│   │   ├── model/            # Data models
│   │   ├── ui/               # Screen UI implementations
│   │   └── MainActivity.kt   # Entry point
│   └── res/                  # Resources
└── build.gradle              # App level dependencies
```

---

## 💻 Code Highlight

Here's a glimpse of how the profile card is implemented:

```kotlin
@Composable
fun ProfileCard(
    name: String,
    bio: String,
    profileImage: Painter,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = profileImage,
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape),
                contentScale = ContentScale.Crop
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Text(
                text = name,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Text(
                text = bio,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
            )
        }
    }
}
```

---

## 🚀 Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/VaibhavGupta-1/ProfileUI.git
   ```

2. **Open in Android Studio:**
   - Launch Android Studio
   - Select "Open an existing Android Studio project"
   - Navigate to the cloned project directory

3. **Configure the project:**
   - Make sure you have the required Android SDK versions installed
   - Sync the project with Gradle files

4. **Run the app:**
   - Select an emulator or connect a physical device
   - Click the "Run" button (▶️) or press Shift+F10

---

## 🔮 Roadmap

- [ ] Add animations and transitions
- [ ] Implement profile editing functionality
- [ ] Add light/dark theme support
- [ ] Create tablet-optimized layout
- [ ] Integrate with sample backend

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

For major changes, please open an issue first to discuss what you would like to change.

---

## 📄 License

This project is open source and available under the MIT License. See [LICENSE](LICENSE) file for details.

---

## 🙌 Acknowledgements

- Inspired by modern Android design principles and the power of Jetpack Compose
- Material Design guidelines by Google
- Android Compose documentation and codelabs

---

## 📱 Connect with Me

- GitHub: [VaibhavGupta-1](https://github.com/VaibhavGupta-1)
- Website: https://vaibhavgupta-1.github.io/VaibhavPortfolio/

Feel free to reach out if you have any questions or suggestions!
