# 💬 Text-to-Speech (TTS) Application using Spring Boot & MaryTTS

This project is a full-stack **Text-to-Speech (TTS)** web application developed using **Spring Boot** and **MaryTTS**, enabling real-time voice synthesis with customizable parameters. The frontend is built using HTML, CSS, and JavaScript for an interactive user experience.

---

## 📁 Project Structure
Hexalearn Folder:
- Contains the `marytts-5.1.2` folder, which includes the MaryTTS API integrated into the project.Inside it there is a `lib` folder with essential jar files.
-`voices` folder containing the voices I downloaded
- TTS Folder:This is the main source code folder and contains:
  * Backend code (`controller` and `service`).
  * Frontend files (`index.html`, `styles.css`, `script.js`).
  * `pom.xml` file for managing project dependencies.
  * `lib` file where all jar files (including voices and other dependencies) are stored.

Additional voices can be downloaded from here:https://github.com/marytts/marytts/blob/master/download/marytts-components.xml


---

## 🛠️ Setup Instructions
1. Please manually download the required jar files using the following command in the command prompt:
   mvn install:install-file -Dfile=C:\path\to\your\jar\file.jar -DgroupId=de.dfki.mary -DartifactId=marytts -Dversion=5.2 -Dpackaging=jar
   Ensure all jar files are placed in the `lib` folder within the `TTS` directory.
2.If additional jar files or voices are required, they can be added as dependencies in the `pom.xml` file and needed to be added manually like in the above step.
3. I used Visual Studio Code (VS Code) for the development of this project. If you prefer to use VS Code, please ensure that you have the necessary extensions installed for a smooth setup.
4.For running the backend the command in the terminal of vs code should be " mvn clean install & mvn spring-boot:run"(Windows) and for the frontend just turn on the live server.

## 🚀 Features

- 🎤 Real-time Text-to-Speech conversion
- 🎛️ Customizable voice parameters (pitch, rate, volume)
- 🔊 Audio playback and one-click download
- 🔗 Seamless integration of backend and frontend

---

