window.onload = () => {
    setActionsOpenNewWindowOnImg();
}

const setActionsOpenNewWindowOnImg = () => {
    const nameClassImg = '.new-window-img';
    let images = document.querySelectorAll(nameClassImg);
    for(let img of images) {
        img.addEventListener("click", () => actionOpenNewWindowImg(img));
    }
}

const actionOpenNewWindowImg = (img) => {
    const urlImg = getUrlImg(img);
    const url = getUrlForOpenWindow(urlImg);
    openNewWindow(url);
}


const getUrlForOpenWindow = (urlImg) => {
    return document.location.origin + "/" + urlImg;
}

const getUrlImg = (img) => {
    const nameAttributeUrl = 'src';
    return img.getAttribute(nameAttributeUrl);
}

const openNewWindow = (url) => {
    window.open(url);
}