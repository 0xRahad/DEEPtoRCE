# DeepToRce Android App

DeepToRce is an Android app that demonstrates handling deep links and potential security risks associated with Remote Code Execution (RCE).

## Features

- Handles deep links with the scheme "https" and the path "/exploit".
- Launches the `RceActivity` to handle deep links containing the specified path.
- Demonstrates potential security vulnerabilities related to RCE.

## Installation

1. Clone or download the repository to your local machine.
2. Open the project in Android Studio.
3. Build and run the app on an Android emulator or a physical device.

## Usage

- The app contains two activities: `MainActivity` and `RceActivity`.
- `MainActivity` is the launcher activity and the entry point of the app.
- `RceActivity` handles deep links with the path "/exploit" and demonstrates potential RCE vulnerabilities.
- Clicking on a deep link with the specified path ("/exploit") will launch `RceActivity` and potentially execute arbitrary code.

## Security Considerations

- **Exercise Caution**: The app demonstrates potential security vulnerabilities and should be used for educational purposes only.
- **Never Deploy Unsanitized Code**: Avoid deploying code with vulnerabilities like RCE in production environments.
- **Follow Security Best Practices**: Always validate and sanitize input data, especially when handling deep links or external data.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
