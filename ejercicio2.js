let numero;
numero=-41;
if(numero>0){
    console.log('El numero ingresado es positivo')
}else if(numero===0){
    console.log('El numero ingresado es 0')
}else{
    console.log('El numero ingresado es negativo')
}

let numeroWhile;
numeroWhile=0;
while(numeroWhile<3){
    numeroWhile++;
    console.log(`El valor en esta vuelta es ${numeroWhile}`)
}
console.log(numeroWhile);
do {
    console.log('Solo me muestro una vez')
} while (numeroWhile<3){

};

let numeroFor=0;

for(i=0;numeroFor<=3;i++){
console.log(numeroFor++);
}

let estacion=0;

switch(estacion){
    case 1:
        console.log('La estacion es verano');
        break;
    case 2:
        console.log('La estacion es primavera');
        break;
    case 3:
        console.log('La estacion es otoño');
        break;
    case 1:
        console.log('La estacion es invierno');
        break;
    default:
        console.log('no es una estacion valida');
        break;    
}
