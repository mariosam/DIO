/* global vars */
let order = [];
let clickedOrder = [];
let score = 0;

/* 0 - green | 1 - red | 2 - yellow | 3 - blue */
const blue      = document.querySelector('.blue');
const red       = document.querySelector('.red');
const green     = document.querySelector('.green');
const yellow    = document.querySelector('.yellow');

/* random colors */
let shuffleOrder = () => {
    let colorOrder = Math.floor(Math.random() * 4);
    order[order.length] = colorOrder;
    clickedOrder = [];

    for (let i in order) {
        let elementColor = createColorElement(order[i]);
        lightColor(elementColor, Number(i) + 1);
    }
}

/* spark the next color */
let lightColor = (element, number) => {
    number = number * 500;
    setTimeout(() => {
        element.classList.add('selected');
    }, number - 250);
    setTimeout(() => {
        element.classList.remove('selected');
    });
}

/* compare saved colors with user click sequence */
let checkOrder = () => {
    for(let i in clickedOrder) {
        if(clickedOrder[i] != order[i]) {
            gameOver();
            break;
        }
    }
    if(clickedOrder.length == order.length) {
        createMsg(`Pontuação: ${score}<br>Você acertou! Iniciando próximo nível!`);
        nextLevel();
    }
}

/* user click on color */
let click = (color) => {
    clickedOrder[clickedOrder.length] = color;
    createColorElement(color).classList.add('selected');

    setTimeout(() => {
        createColorElement(color).classList.remove('selected');
        checkOrder();
    },500);
}

/* pick a color and play the song */
let createColorElement = (color) => {
    if (color == 0) {
        document.querySelector('#song1').play();
        return green;
    } else if(color == 1) {
        document.querySelector('#song2').play();
        return red;
    } else if (color == 2) {
        document.querySelector('#song3').play();
        return yellow;
    } else if (color == 3) {
        document.querySelector('#song4').play();
        return blue;
    }
}

/* add points and pick a new color */
let nextLevel = () => {
    score++;

    shuffleOrder();
}

/* end of game - restart the controls */
let gameOver = () => {
    createMsg(`Pontuação: ${score}!<br>Você perdeu o jogo!<br>Clique em OK para iniciar um novo jogo`);
    order = [];
    clickedOrder = [];

    playGame();
}

/* do you wanna play a game? */
let playGame = () => {
    createMsg(`Bem vindo ao Gênesis! Iniciando novo jogo!`);
    score = 0;

    nextLevel();
}

/* show dinamic message */
let createMsg = (msg) => {
    document.querySelector('#msg').innerHTML = msg;
}

/* create click events */
green.onclick = ()  => click(0);
red.onclick = ()    => click(1);
yellow.onclick = () => click(2);
blue.onclick = ()   => click(3);

/* start the game */
playGame();
