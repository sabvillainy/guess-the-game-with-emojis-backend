# Guess The Game With Emojis - Backend
Welcome to the backend repository for the "Guess The Game With Emojis" project. This repository contains the server-side code implemented using Java and the Spring Framework.
The backend handles game data, retrieves emoji hints, and processes user guesses.

## Project Overview
"Guess The Game With Emojis" is an interactive game where users try to guess the name of a video game based on a series of emojis that represent the game. Each game in the database has a corresponding set of emojis that give users hints about the game title.

## Features
- **Random Game Hint:** Provides a random set of emojis for a game from the database.
- **Guess Submission:** Accepts user guesses and checks if they are correct.
- **Auto-Complete:** Suggests game names as the user types their guess.
- **Database Integration:** Utilizes MySQL to store game data and emojis.

## Endpoints
- `/get-random-hint`: Returns a random game hint with emojis.
- `/submit-game`: Accepts game ID and user’s guessed game name, returns whether the guess is correct.
- `/auto-complete`: Provides a list of game names that match the user’s input.,

## Future Enhancements
### 1. Hint System:
- Users will have 5 attempts to guess the game.
- Initially, only one emoji will be shown.
- For each incorrect guess, an additional emoji and a hint (e.g., Metacritic score, release year, genre) will be revealed.

### 2. Game Over Mechanism:
- The game will end after 5 incorrect guesses, indicating the user did not guess the game.

### 3. User Authentication:
- Implement user authentication to track scores and progress.

### 4. Leaderboard:
- Create a leaderboard to display top players based on their scores.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure that your code adheres to the project's coding standards and includes appropriate tests.
