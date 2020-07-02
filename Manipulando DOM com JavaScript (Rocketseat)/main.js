// Get all the keys:
const keys = document.querySelectorAll(".key");

// Play notes:
function playNote(event) {
  let audioKeyCode = getKeyCode(event);

  // Typep or pressed key:
  const key = document.querySelector(`.key[data-key="${audioKeyCode}"`);

  // Check if the key exists:
  if (!key) {
    return;
  }

  addPlayingClass(key);
  playAudio(audioKeyCode);
}

function addPlayingClass(key) {
  key.classList.add("playing");
}

function removePlayingClass(event) {
  event.target.classList.remove("playing");
}

function getKeyCode(event) {
  const isKeyboard = event.type === "keydown" ? true : false;
  return isKeyboard ? event.keyCode : event.target.dataset.key;
}

function playAudio(audioKeyCode) {
  const audio = document.querySelector(`audio[data-key="${audioKeyCode}"`);

  audio.currentTime = 0;
  audio.play();
}

// Handle click with mouse:
keys.forEach(function (key) {
  key.addEventListener("click", playNote);
  key.addEventListener("transitionend", removePlayingClass);
});

// Handle key(board) pressed:
window.addEventListener("keydown", playNote);
