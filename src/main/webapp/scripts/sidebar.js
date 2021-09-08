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

const nameClassSidebarOpen = "sidebar-open";
const nameClassSidebarClose = "sidebar-close";

const setCloseStyle = () => {
    setStyleSidebar(nameClassSidebarOpen, nameClassSidebarClose)
}

const setOpenStyle = () => {
    setStyleSidebar(nameClassSidebarClose, nameClassSidebarOpen)
}

const setStyleSidebar = (removeClassStyle, addClassStyle) => {
    const nameClassSidebar = '.sidebar-container-absolute';
    setStyle(nameClassSidebar, removeClassStyle, addClassStyle);
}

const setStyle = (nameClassElement, removeClassStyle, addClassStyle) => {
    let element = document.querySelector(nameClassElement);
    element.classList.remove(removeClassStyle);
    element.classList.add(addClassStyle);
}

window.onload = () => {
    setActionOpenOnButton();
    setActionCloseOnButton();
}
