const filterUsers = async (name) =>
  fetch(
    `https://jsonplaceholder.typicode.com/users?name_like=${name}`
  ).then((res) => res.json());

const debounceEvent = (fn, wait = 1000, time) => (...args) =>
  clearTimeout(time, (time = setTimeout(() => fn(...args), wait)));

function handleKeyUp(event) {
  filterUsers(event.target.value).then((users) =>
    console.log(users.map((user) => user.name))
  );
}

document
  .querySelector("input")
  .addEventListener("keyup", debounceEvent(handleKeyUp, 500));
