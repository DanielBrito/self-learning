// MAP
const { passengers } = require("../data");

// 1. Quantos anos eles têm?
const newPassengers = passengers.map(
  (passenger) => `${passenger.name} tem ${2019 - passenger.birthYear} anos`
);

console.table(newPassengers);

// 2. Informar se o nome é palíndromo:
const founds = passengers.map((passenger) => {
  const reverseName = [].map
    .call(passenger.name, (letter) => letter)
    .reverse()
    .join("");

  if (reverseName.toLowerCase() === passenger.name.toLowerCase())
    return `Este nome é palíndromo: ${passenger.name}`;
});

console.table(founds);
