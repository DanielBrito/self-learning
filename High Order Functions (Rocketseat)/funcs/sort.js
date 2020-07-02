// SORT (Baseado nas definições do Unicode ASCII)
const { shopCart, passengers } = require("../data");

// 1. Organize o carrinho do maior número de produtos para o menor:
const orderByTotalProducts = shopCart.sort((a, b) => b.quantity - a.quantity);

console.table(orderByTotalProducts);

// 2. Organize os passageiros por nome:
const orderByPassengerName = passengers.sort((passengerA, passengerB) => {
  if (passengerA.name.toLocaleLowerCase() < passengerB.name.toLocaleLowerCase())
    return -1;
  if (passengerA.name.toLocaleLowerCase() > passengerB.name.toLocaleLowerCase())
    return 1;
  return 0;
});

console.table(orderByPassengerName);
