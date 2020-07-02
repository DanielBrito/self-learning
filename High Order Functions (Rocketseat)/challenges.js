const { childrenAge, mailList, shopCart } = require("./data");

// Adicione o ano de nascimento das crianças para cada elemento do array:

const childrenMap = childrenAge.map((age) => {
  return {
    age: age,
    birthYear: new Date().getFullYear() - age,
  };
});

console.table(childrenMap);

const childrenReduce = childrenAge.reduce((list, age) => {
  list.push({
    age,
    birthYear: new Date().getFullYear() - age,
  });
  return [...list];
}, []);

console.table(childrenReduce);

// Crie um array somente com os domínios da lista de email:
const domains = mailList.map((mail) => {
  const mailArray = mail.split("@");
  return mailArray[1];
});

console.table(domains);

// Encontre o maior preço dos produtos abaixo de 100 reais:
const bellow100 = shopCart
  .filter((product) => product.unitPrice <= 100)
  .reduce((lastProductUnitPrice, currentProduct) => {
    if (lastProductUnitPrice > currentProduct.unitPrice)
      return lastProductUnitPrice;

    return currentProduct.unitPrice;
  }, 0);

console.table(bellow100);
