
const hiddenButtonOpen = () => {
    let buttonOpen = document.querySelector(nameClassButtonOpen);
    buttonOpen.classList.remove("")
}

const nameClassButtonOpen = ".sidebar-button-open";

const setShowButtonOpen = (actionShowButton) => {
    setActionOnButton(nameClassButtonOpen, actionShowButton);
}




const setHiddenAndShowButtonOpen = () => {
    const nameClassButtonOpen = ".sidebar-button-open";
    const nameEventClick = "click"
    let buttonOpen = document.querySelector(nameClassButtonOpen);
    buttonOpen.addEventListener(nameEventClick, )
}

document.addEventListener("DOMContentLoaded", setHiddenAndShowButtonOpen)