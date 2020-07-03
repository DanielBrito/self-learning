// Não pega this global

this.name = "Valeska";

function age(age) {
  this.name = "Joshua";

  function birthYear(age) {
    this.name = "Kyam";

    const year = new Date().getFullYear() - age;
    console.log(this.name, year);
  }

  birthYear(age);

  console.log(this.name);
}

age(25);

console.log(this.name);
