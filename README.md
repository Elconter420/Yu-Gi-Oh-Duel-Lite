# 🃏 Yu-Gi-Oh! Duel Lite ⚡

## 🎯 Descripción del Proyecto

Yu-Gi-Oh! Duel Lite es una aplicación de escritorio desarrollada en **Java Swing** que simula un duelo simplificado del juego de cartas **Yu-Gi-Oh!** entre un jugador y la máquina. La aplicación consume datos en tiempo real de la **API YGOProDeck** para obtener cartas Monster aleatorias y gestiona un sistema de combate por turnos donde el primer jugador en ganar **2 de 3 rondas** resulta victorioso. 🏆

## ✨ Características Principales

- 🌐 **Consumo de API REST**: Obtención de cartas Monster aleatorias desde YGOProDeck
- 🎨 **Interfaz Gráfica**: Desarrollada con Java Swing
- ⚔️ **Sistema de Duelo**: Combate por turnos con reglas simplificadas
- 📊 **Gestión de Estado**: Seguimiento de puntajes y registro de batallas
- 🔌 **Arquitectura Desacoplada**: Implementación con listeners para separar lógica e interfaz

## 🛠️ Requisitos del Sistema

- ☕ **Java 11** o superior
- 🌐 **Conexión a Internet** (para consumo de la API)

## 🎮 Instrucciones de Ejecución

1. **📥 Clonar el repositorio**:
   ```bash
   git clone [url-del-repositorio]
   cd yu-gi-oh-duel-lite
   ```

## 🏗️ Diseño y Arquitectura

### 🎨 Patrón de Diseño
La aplicación sigue una arquitectura **MVC simplificada** donde:
- **📦 Modelo**: Clase `Card` que representa las cartas con sus atributos
- **🎮 Controlador**: Clase `Duel` que gestiona la lógica del juego
- **👁️ Vista**: Interfaces Swing que muestran el estado del juego

### 💡 Principios Aplicados
- **🎯 Separación de Responsabilidades**: Cada clase tiene una función específica
- **🔗 Desacoplamiento**: Uso de `BattleListener` para comunicación entre componentes
- **⚡ Manejo Asíncrono**: Las peticiones a la API no bloquean la interfaz de usuario

### 🔄 Flujo de la Aplicación
1. **🔄 Inicialización** y carga de 3 cartas Monster para cada jugador
2. **🎲 Definición aleatoria** del turno inicial
3. **🔄 Por turnos**, el jugador selecciona una carta y la máquina elige aleatoriamente
4. **⚔️ Resolución del combate** según reglas de ATK/DEF
5. **🎉 Finalización** cuando un jugador alcanza 2 victorias

## 📦 Dependencias

- ☕ **Java 11+**: Lenguaje de programación
- 🎨 **Swing**: Librería para interfaz gráfica
- 🌐 **java.net.http.HttpClient**: Para peticiones HTTP
- 📄 **org.json**: Procesamiento de respuestas JSON

## 👥 Desarrollo por
- https://github.com/Elconter420 👨‍💻
- https://github.com/meja777 👩‍💻

---

*¡Que comience el duelo!* 🃏⚡
