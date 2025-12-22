
 var headers = {
   "Content-Type": "application/json",                                                                                                
   "Access-Control-Origin": "*"
}

const url = "http://localhost:8080"

function onClickPrenota(){

    document.getElementById("esito").innerHTML = "Inviato!";

    var cliente = {

        nome : document.getElementById("nome").value,
        cognome : document.getElementById("cognome").value,

    }
    
    

    fetch (url + "/createCliente", {
        method: "POST",
        headers : headers,
        body : JSON.stringify(cliente)
    })
    .then(function(response){
        return response.json();
    })
    .then(function(cliente){
        console.log(cliente)
    });


}