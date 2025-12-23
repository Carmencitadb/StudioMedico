
var headers = {
    "Content-Type": "application/json",
    "Access-Control-Allow-Origin": "*"
}

const url = "http://localhost:8080";

//    /clienti/getNomeCognome/{nome}/{cognome}
async function onClickPrenota() {

    var cliente = {
        id: null,
        nome: document.getElementById("nome").value,
        cognome: document.getElementById("cognome").value
    }

    var specializzazione = document.getElementById("visita").value

    var id = await checkClienteExist(cliente);

    if (id === null || id === undefined) {
        createCliente(cliente);
        cliente.id = await checkClienteExist(cliente);
    }

    var dottore = await getDoctorBySpecial(specializzazione);



}

function createCliente(cliente) {
    fetch(url + "/clienti/createCliente", {
        method: "POST",
        headers: headers,
        body: JSON.stringify(cliente)
    })
        .then(function (response) {
            return response.json();
        })
}

async function checkClienteExist(cliente) {
    try {
        const response = await fetch(url + "/clienti/getNomeCognome/" + cliente.nome + "/" + cliente.cognome, {
            method: "GET",
            headers: headers
        })

        const data = await response.json();

        return data.id;
    }
    catch (error) {
        console.log(error);
    }
}

async function getDoctorBySpecial() {
    try {
        const response = await fetch(url + "/dottori/getSpecializzazione/" + specializzazione, {
            method: "GET",
            headers: headers
        })

        return await response.json();
    }
    catch (error) {
        console.log(error);
    }
}

function createPrenotazione() {
try {
    
} catch (error) {
    
}


}

