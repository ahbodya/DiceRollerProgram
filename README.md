# Dice Roller Program / Програма кидання кубиків / Программа броска кубиков

<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white">
  <img alt="Build" src="https://img.shields.io/badge/Build-Passing-brightgreen">
  <img alt="License" src="https://img.shields.io/badge/License-Educational-blue">
  <img alt="Platform" src="https://img.shields.io/badge/Platform-Console-lightgrey">
</p>

<p align="center">
  A simple and beautiful Java console dice roller with ASCII art output.<br>
  Простий і красивий Java-консольний ролер кубиків з ASCII-графікою.<br>
  Простой и красивый Java-консольный роллер кубиков с ASCII-графикой.
</p>

---

## Table of Contents

- [Screenshots / GIF](#screenshots--gif)
- [English](#english)
- [Українська](#українська)
- [Русский](#русский)
- [Project Structure](#project-structure)
- [Ideas for Improvement](#ideas-for-improvement)

---
## English

### Overview

This project rolls one or more dice, prints each result as ASCII-art dice, and calculates the total.

### Features

- Nice startup banner in the terminal
- Custom number of dice
- ASCII-art dice faces for values `1-6`
- Total sum after all rolls
- Beginner-friendly single-file code (`src/Main.java`)

### Requirements

- JDK 17 or newer (recommended)

### Run (PowerShell)

```powershell
javac -d out src\Main.java
java -cp out Main
```

### Example Output

```text
Enter the number of dice to roll:
3
You rolled a 5
You rolled a 2
You rolled a 6
Total: 13
```

---

## Українська

### Опис

Цей проєкт кидає один або кілька кубіків, виводить кожен результат у вигляді ASCII-кубика та рахує загальну суму.

### Можливості

- Красивий стартовий банер у консолі
- Користувач задає кількість кубиків
- ASCII-гранi кубика для значень `1-6`
- Підрахунок загальної суми всіх кидків
- Простий код в одному файлі (`src/Main.java`)

### Вимоги

- JDK 17 або новіше (рекомендовано)

### Запуск (PowerShell)

```powershell
javac -d out src\Main.java
java -cp out Main
```

### Приклад виводу

```text
Введіть кількість кубиків для кидка:
3
You rolled a 5
You rolled a 2
You rolled a 6
Total: 13
```

---

## Русский

### Описание

Этот проект бросает один или несколько кубиков, выводит каждый результат в виде ASCII-кубика и считает итоговую сумму.

### Возможности

- Красивый стартовый баннер в консоли
- Пользователь задает количество кубиков
- ASCII-грани кубика для значений `1-6`
- Подсчет общей суммы всех бросков
- Простой код в одном файле (`src/Main.java`)

### Требования

- JDK 17 или новее (рекомендуется)

### Запуск (PowerShell)

```powershell
javac -d out src\Main.java
java -cp out Main
```

### Пример вывода

```text
Введите количество кубиков:
3
You rolled a 5
You rolled a 2
You rolled a 6
Total: 13
```

---

## Project Structure

```text
diceRollerProgram/
|- src/
|  `- Main.java
|- README.md
`- diceRollerProgram.iml
```

## Ideas for Improvement

- Validate non-numeric input safely
- Support custom dice types (`d4`, `d8`, `d20`, etc.)
- Add replay mode without restarting
- Save roll history and basic statistics
- Add unit tests for input and roll logic

---

## Notes

- The app currently uses Unicode box-drawing characters for dice faces.
- If GitHub images do not appear, ensure files exist at `assets/screenshot.png` and `assets/demo.gif`.
