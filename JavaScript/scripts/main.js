const miTitulo = document.querySelector("h1");
miTitulo.textContent = "¡Hello World! ¡What Happen Motherfuckers! ¿What's up?";

document.querySelector("html").onclick = function () {
    alert("¡Ouch! ¡Deja de pincharme!");
};

let miImage = document.querySelector("img");
miImage.onclick = function () {
  let miSrc = miImage.getAttribute("src");
  if (miSrc === "/JavaScript/images/Vaquitas tamaño mediano.jpg") {
    miImage.setAttribute("src", "/JavaScript/images/pequeña - copia.jpg");
  } else {
    miImage.setAttribute("src", "/JavaScript/images/Vaquitas tamaño mediano.jpg");
  }
};

