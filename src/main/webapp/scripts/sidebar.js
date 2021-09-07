const setActionCloseOnButton = () => {
    const nameClassButtonClose = '.sidebar-button-close';
    setActionOnButton(nameClassButtonClose, setCloseStyle);
}

const setActionOpenOnButton = () => {
    const nameClassButtonOpen = '.sidebar-button-open';
    setActionOnButton(nameClassButtonOpen, setOpenStyle);
}

const setActionOnButton = (nameClassButton, actionOnButton) => {
    const nameEventClick = "click"
    let button = document.querySelector(nameClassButton);
    button.addEventListener(nameEventClick, actionOnButton)
}

const nameClassSidebarOpen = ".sidebar-open";
const nameClassSidebarClose = ".sidebar-close";

const setCloseStyle = () => {
    setStyle(nameClassSidebarOpen, nameClassSidebarClose)
}

const setOpenStyle = () => {
    setStyle(nameClassSidebarClose, nameClassSidebarOpen)
}

const setStyle = (removeClassStyle, addClassStyle) => {
    const nameClassSidebar = '.sidebar';
    let sidebar = document.querySelector(nameClassSidebar);
    sidebar.classList.remove(removeClassStyle)
    sidebar.classList.add(addClassStyle)
}

window.onload(setActionCloseOnButton)
window.onload(setActionOpenOnButton)