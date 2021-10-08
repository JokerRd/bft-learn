const setSignOutAction = () => {
    const nameClassSignOut = '.sign-out';
    const nameEventClick = 'click'
    let signOut = document.querySelector(nameClassSignOut);
    signOut.addEventListener(nameEventClick, signOutAction);
}

const signOutAction = () => {
    if (isConfirmSignOut()) {
        const messageSuccessSignOut = "Вы успешно вышли";
        alert(messageSuccessSignOut);
    } else {
        const messageFaultSignOut = "Я ценю вашу преданность";
        alert(messageFaultSignOut);
    }
}

const isConfirmSignOut = () => {
    const messageConfirm = "Вы уверены, что хотите выйти?";
    return confirm(messageConfirm);
}


document.addEventListener("DOMContentLoaded", setSignOutAction)