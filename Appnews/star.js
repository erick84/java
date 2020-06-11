document.querySelector('.menu-btn').addEventListener('click', () => {
    document.querySelector('.nav-menu').classList.toggle('load');
});

ScrollReveal().reveal('.showcase');
ScrollReveal().reveal('.News-cards', { delay: 500});
ScrollReveal().reveal('.cards-banners-one', { delay: 500});
ScrollReveal().reveal('.cards-banners-two', { delay: 500});