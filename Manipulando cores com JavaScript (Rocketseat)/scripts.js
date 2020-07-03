const { body } = document;

try {
  body.style.backgroundColor = lumiance("#6232cc", 0.6);
} catch (e) {
  console.log("Error: ", e.message);
}

function lumiance(hex, luminosity = 0) {
  hex = hex.replace(/[^0-9a-f]/gi, "");

  const isValidHex = hex.length === 6 || hex.length === 3;

  if (!isValidHex) throw new Error("Invalid HEX");

  if (hex.length === 3) {
    hex = hex.split("").reduce((newHex, item) => {
      return (newHex += item + item);
    }, "");
  }

  const black = 0;
  const white = 255;
  const twoDigitGroup = hex.match(/([0-9a-f]){2}/gi);

  let newHex = "#";

  for (let subgroup of twoDigitGroup) {
    const numberFromHex = parseInt(subgroup, 16);
    const calculateLuminosity = numberFromHex + luminosity * white;

    const blackOrLuminosity = Math.max(black, calculateLuminosity);
    const partialColor = Math.min(white, blackOrLuminosity);

    const newColor = Math.round(partialColor);

    const numberToHex = newColor.toString(16);
    const finalHex = `0${numberToHex}`.slice(-2);

    newHex += finalHex;
  }

  return newHex;
}
