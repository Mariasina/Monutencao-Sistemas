import json from "../Dados/loja.json" with{type:"json"}
const products = document.getElementById("products");

function dados(){

    for(var i in json){
        var card = document.createElement("div");
        var title = document.createElement("h2");
        var image = document.createElement("img");
        var price = document.createElement("p");

        var green = image = document.createElement("img");
        var red = image = document.createElement("img");

        title.textContent = json[i].descricao;
        image.src = json[i].imagem;
        price.textContent = "Preço: R$" + json[i].preco;
        card.setAttribute('class', "card");
        green.src

        card.appendChild(title);
        card.appendChild(image);		
        card.appendChild(price);	

        if(json[i].estoque == true){
            card.appendChild(title);

        }
        
        products.appendChild(card);		
        

    }        
}

dados();
