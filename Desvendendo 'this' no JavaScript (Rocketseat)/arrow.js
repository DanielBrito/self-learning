// Pega this do escopo anterior.

this.name = "Valeska";

const age = (age) => {
  const birthYear = (age) => {
    const year = 2019 - age;
    console.log(this.name, year);
  };

  birthYear(age);
};

const dev = {
  sayMyName: () => {
    this.name = "Enzo";
  },
};

age(25);
dev.sayMyName();

console.log(this.name);
