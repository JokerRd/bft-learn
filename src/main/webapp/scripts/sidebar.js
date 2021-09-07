const setButtonActionClose = () => {
    const nameClassButtonClose = '.sidebar-button-close';
    setButtonAction(nameClassButtonClose, setCloseStyle);
}

const setButtonActionOpen = () => {
    const nameClassButtonOpen = '.sidebar-button-open';
    setButtonAction(nameClassButtonOpen, setOpenStyle);
}

const setButtonAction = (nameClassButton, action) => {
    let nameEventClick = "click"
    let button = document.querySelector(nameClassButton);
    button.addEventListener(nameEventClick, action)
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

window.onload(setButtonActionClose)
window.onload(setButtonActionOpen)