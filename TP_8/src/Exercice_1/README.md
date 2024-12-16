# Number Guessing Game

## Overview

This project consists of a simple number guessing game implemented using Java sockets. The game includes a server that generates a random number and a client that attempts to guess the number. The server provides feedback to the client to guide the guessing process.

## Server

### Class Definition

#### `Server` Class

The `Server` class listens for client connections and manages the number guessing game. It generates a random number and provides feedback to the client based on their guesses.

### How It Works

1. **Initialization**:
    - The server starts and listens on port 1337.
    - It waits for a client to connect.

2. **Game Loop**:
    - The server generates a random number between 0 and 100.
    - It reads the client's guesses and provides feedback:
        - Sends `0` if the guess is correct.
        - Sends `1` if the guess is too low.
        - Sends `-1` if the guess is too high.
    - The game continues until the client guesses the correct number.

### Example Usage

To run the server, compile the `Server` class and execute the generated `Server.class` file.

```bash
javac Exercice_1/Server.java
java Exercice_1.Server
```

## Client 

### Class Definition

#### `Client` Class

The `Client` class connects to the server and plays the number guessing game. It sends guesses to the server and receives feedback based on the correctness of the guesses.

### How It Works

1. **Initialization**:
    - The client connects to the server on port 1337.

2. **Game Loop**:
   
    - The client sends a guess to the server.
    - It receives feedback from the server:
        - `0` if the guess is correct.
        - `1` if the guess is too low.
        - `-1` if the guess is too high.
    - The game continues until the correct number is guessed.

### Example Usage

To run the client, compile the `Client` class and execute the generated `Client.class` file.

```bash
javac Exercice_1/Client.java
java Exercice_1.Client
```

## Directory Structure

```
Exercice_1/
├── Client.java
└── Server.java
```