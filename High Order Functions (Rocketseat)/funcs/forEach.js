// FOREACH (Não aplica o conceito de imutabilidade, ou seja, altera o objeto)
const { passengers } = require("../data");

// 1. Adicione a idade (age) para cada pessoa:
passengers.forEach((passenger) => {
  passenger.age = 2020 - passenger.birthYear;
});

console.table(passengers);
