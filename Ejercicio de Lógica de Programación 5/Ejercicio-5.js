// Función para generar un número secreto aleatorio entre 1 y 100
function generarNumeroSecreto() {
    return Math.floor(Math.random() * 100) + 1;
  }
  
  // Función para obtener los números ingresados por el usuario y adivinar el número secreto
  function adivinarNumeroSecreto(numeroSecreto) {
    const numerosIngresados = [];
  
    while (true) {
      let inputNumero = prompt("Ingrese un número del 1 al 100 para adivinar el número secreto:");
  
      // Convertir el valor ingresado a número
      const numeroIngresado = parseInt(inputNumero);
  
      // Verificar si el valor ingresado es un número válido entre 1 y 100
      if (isNaN(numeroIngresado) || numeroIngresado < 1 || numeroIngresado > 100) {
        console.log("El valor ingresado no es un número válido entre 1 y 100. Por favor, intenta de nuevo.");
        continue;
      }
  
      // Agregar el número ingresado a la lista de números
      numerosIngresados.push(numeroIngresado);
  
      // Verificar si el número ingresado es el número secreto
      if (numeroIngresado === numeroSecreto) {
        console.log("Felicidades, adivinaste el número secreto.");
        console.log("Números introducidos antes de adivinar el número secreto: " + numerosIngresados.join(', '));
        break;
      } else {
        console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
      }
    }
  }
  
  // Generar el número secreto aleatorio entre 1 y 100
  const numeroSecreto = generarNumeroSecreto();
  
  // Llamar a la función principal para obtener los números ingresados y adivinar el número secreto
  adivinarNumeroSecreto(numeroSecreto);
  