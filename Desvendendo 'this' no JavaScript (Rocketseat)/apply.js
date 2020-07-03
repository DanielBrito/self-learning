// Retorna o this do contexto que eu enviar.

function multiply() {
  const args = Array.from(arguments);
  this.total = args.reduce((acc, item) => {
    return acc * item;
  }, 1);
}

multiply.apply(this, [1, 2, 3, 4, 5]);

console.log(this.total);
