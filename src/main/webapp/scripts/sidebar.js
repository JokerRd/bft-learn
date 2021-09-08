window.onload = () => {
    setActionOpenOnButton();
}


const setActionOpenOnButton = () => {
    const nameClassButtonOpen = '.sidebar-button';
    setActionOnButton(nameClassButtonOpen, setActionOpenAndCloseOnButton);
}

const setActionOnButton = (nameClassButton, actionOnButton) => {
    const nameEventClick = "click"
    let button = document.querySelector(nameClassButton);
    button.addEventListener(nameEventClick, actionOnButton)
}

const setActionOpenAndCloseOnButton = () => {
    const nameClassButtonSidebar = '.sidebar-button';
    const nameClassButtonOpen = 'sidebar-button-open';
    const nameClassButtonClose = 'sidebar-button-close';
    let button = document.querySelector(nameClassButtonSidebar);
    if (containsDefaultButtonClass(button)) {
        setOpenSidebar();
        removeClassForElement(button,nameClassButtonOpen);
        addClassForElement(button, nameClassButtonClose);
        addMarginFromSidebar();
    } else {
        setCloseSidebar();
        removeClassForElement(button, nameClassButtonClose);
        addClassForElement(button, nameClassButtonOpen);
        removeMarginFromSidebar();
    }
}

const containsDefaultButtonClass = (button) => {
    const nameClassButtonDefault = 'sidebar-button-open';
    return button.classList.contains(nameClassButtonDefault)
}

const nameClassMarginOn = 'margin-from-sidebar-on';
const nameClassMarginOff = 'margin-from-sidebar-off';

const addMarginFromSidebar = () => {
    const nameClassSurvey = '.flex-container';
    let survey = document.querySelector(nameClassSurvey);
    removeClassForElement(survey,nameClassMarginOff);
    addClassForElement(survey, nameClassMarginOn);
}

const removeMarginFromSidebar = () => {
    const nameClassSurvey = '.flex-container';
    let survey = document.querySelector(nameClassSurvey);
    removeClassForElement(survey, nameClassMarginOn);
    addClassForElement(survey, nameClassMarginOff);
}

const setCloseButton = () => {

}

const setOpenButton = () => {

}

const nameClassSidebarOpen = "sidebar-open";
const nameClassSidebarClose = "sidebar-close";

const setCloseSidebar = () => {
    setStyleSidebar(nameClassSidebarOpen, nameClassSidebarClose)
}

const setOpenSidebar = () => {
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

const removeAndAddClassForElement = (element, removeClassStyle, addClassStyle) => {
    element.classList.remove(removeClassStyle);
    element.classList.add(addClassStyle);
}

const removeClassForElement = (element, removeClassStyle) => {
    element.classList.remove(removeClassStyle);
}

const addClassForElement = (element, addClassStyle) => {
    element.classList.add(addClassStyle);
}

