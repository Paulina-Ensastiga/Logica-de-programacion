// Función para convertir la temperatura de grados Celsius a grados Fahrenheit y Kelvin
function convertirTemperatura(temperaturaCelsius) {
    // Verificar si el valor ingresado es un número válido
    if (isNaN(temperaturaCelsius)) {
      console.log("El valor ingresado no es un número válido. Por favor, intenta de nuevo.");
      return;
    }
  
    // Convertir la temperatura a grados Fahrenheit y Kelvin
    const temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
    const temperaturaKelvin = temperaturaCelsius + 273.15;
  
    // Mostrar los resultados en la consola o en el DOM
    console.log(`Grados Fahrenheit: ${temperaturaFahrenheit}`);
    console.log(`Grados Kelvin: ${temperaturaKelvin}`);
  }
  
  // Función para obtener la temperatura ingresada por el usuario
  function obtenerTemperatura() {
    let inputTemperatura = prompt("Ingrese la temperatura en grados Celsius:");
  
    // Convertir el valor ingresado a número
    const temperaturaCelsius = parseFloat(inputTemperatura);
  
    // Llamar a la función para convertir y mostrar los resultados
    convertirTemperatura(temperaturaCelsius);
  }
  
  // Llamar a la función principal para obtener la temperatura del usuario
  obtenerTemperatura();
  