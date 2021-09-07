const setUpdateDateTime = () => {
    let interval = 1000;
    let time = document.querySelector('time');
    setInterval(() => updateTime(time), interval)
}

const updateTime = (time) => {
    time.textContent = new Date().toLocaleString();
}

document.addEventListener("DOMContentLoaded", setUpdateDateTime)