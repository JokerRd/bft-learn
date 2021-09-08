const setActiveLanguageAction = () => {
    const languages = document.querySelectorAll('.language-button');
    console.log(languages);
    for(const language of languages) {
        language.addEventListener("click", ()=> setActiveLanguage(language));
    }
}

const setActiveLanguage = (currentLanguage) => {
    let activeLanguage = document.querySelector('.language-active');
    activeLanguage.classList.remove('language-active');
    currentLanguage.classList.add('language-active');
}


document.addEventListener("DOMContentLoaded", setActiveLanguageAction)