//alert("si funciona");

//llamada a la tablaCitas jQuery plugin
$(document).ready(function() {

    
  });

  async function registarCita(){
    //llamada ala funcion fech
    
    

    const request = await fetch('api/citas', {
        method: 'POST',
        headers:{
            'Accep':'application/json',
            'Content-Type': 'application/json'
        }
    });
    const citas = await request.json();
   
  
  }
  
