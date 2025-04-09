// Function to fetch voices from the backend and populate the dropdown
async function fetchVoices() {
    try {
        const response = await fetch('/voices');
        const voices = await response.json();

        // Populate the dropdown with available voices
        const voiceDropdown = document.getElementById('voice');
        voiceDropdown.innerHTML = ''; // Clear the dropdown

        voices.forEach(voice => {
            const option = document.createElement('option');
            option.value = voice;
            option.textContent = voice;
            voiceDropdown.appendChild(option);
        });

        // Set default voice (optional)
        if (voices.length > 0) {
            voiceDropdown.value = voices[0];
        }
    } catch (error) {
        console.error('Error fetching voices:', error);
    }
}

// Fetch voices when the page loads
window.onload = function () {
    fetchVoices();
};

// Function to convert the input text to speech
async function convertToSpeech() {
    const text = document.getElementById('text').value;
    const voice = document.getElementById('voice').value;
    const pitch = document.getElementById('pitch').value;
    const rate = document.getElementById('rate').value;
    const volume = document.getElementById('volume').value;

    // Construct the parameters for the backend request
    const params = {
        text: text,
        voice: voice,
        pitch: pitch,
        rate: rate,
        volume: volume
    };

    try {
        const response = await fetch('/convert', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(params)
        });

        if (response.ok) {
            const audioBlob = await response.blob();
            const audioUrl = URL.createObjectURL(audioBlob);
            const audioElement = document.getElementById('audio');
            audioElement.src = audioUrl;
        } else {
            alert('Error converting text to speech');
        }
    } catch (error) {
        console.error('Error during speech conversion:', error);
    }
}

// Function to save the generated audio as a file
function saveAudio() {
    const audioElement = document.getElementById('audio');
    const link = document.createElement('a');
    link.href = audioElement.src;
    link.download = 'speech.mp3';
    link.click();
}

