
 var headers = {
   "Content-Type": "application/json",                                                                                                
   "Access-Control-Allow-Origin": "*"
}

const url = "http://localhost:8080";

//    /clienti/getNomeCognome/{nome}/{cognome}
async function onClickPrenota(){

    var cliente = {
        nome : document.getElementById("nome").value,
        cognome : document.getElementById("cognome").value,
    }


    var id = await checkClienteExist(cliente);

       if (id===null || id === undefined){
        cliente = await createCliente(cliente);
         }
        else{
        console.log("id = "+id);
        } 
    
}

async function createCliente(cliente){
    const response = await fetch (url + "/clienti/createCliente", {
        method: "POST",
        headers : headers,
        body : JSON.stringify(cliente)
    })
   
    return await response.json();
}

async function checkClienteExist(cliente){
    const response = await fetch (url + "/clienti/getNomeCognome/"+cliente.nome+"/"+cliente.cognome, {
        method: "GET",
        headers : headers
    })
    const data = await response.json();
    return data.id;
}

