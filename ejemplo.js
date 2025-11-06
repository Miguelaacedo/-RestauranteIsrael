const person = {
    name: 'Jane',
    age: 21,
    hobbies: ['Sports'],
};

const { name, ...spread } = person;
console.log(name, spread);

const myArr = [1, 2, 3, 4, 5];
const [first, ...spreadItems] = myArr;
console.log(first, spreadItems);

let miArray = [3, 5, 7, 2, 9];
let minimo = Math.min(...miArray);

console.log(minimo);

//let cadena = EliminarEspacios('aqui', ' lados ', ' espacio');

/*function EliminarEspacios(...cadenas) {
   for (let i=0; i<cadenas.length; i++) {
     cadenas[i] = cadenas[i].trim();
   }
   return cadenas;
}

console.log(cadena);



let pepe = ('fransd' , 'mario');
let pe =  ['pepe', 'mario'];

console.log(pepe);
console.log(pe);*/

function sum(...theArgs) {
    let total = 0;
    for (const arg of theArgs) {
        total += arg;
    }
    return total;
}

console.log(sum(1, 2, 3));
// Expected output: 6

console.log(sum(1, 2, 3, 4));
// Expected output: 10